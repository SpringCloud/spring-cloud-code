package cn.springcloud.book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by caibosi on 2018-07-27.
 */
public abstract class TccParticipantController<T> {

    public static final String TCC_MEDIA_TYPE = "application/tcc";
    public static final String TRANSACTION_ID = "txId";
    protected static final Logger LOGGER = LoggerFactory.getLogger(TccParticipantController.class);

    @PostMapping(value = "/tcc/{txId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity tryOperation(@PathVariable String txId, @RequestBody T body) {
        LOGGER.info("{} begin to try transaction {}", getParticipantName(), txId);
        ResponseEntity result;
        try {
            result = executeTry(txId, body);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            result = ResponseEntity.notFound().build();
        }
        LOGGER.info("{} finish try transaction {} ,result {}", getParticipantName(), txId, result.getStatusCode());
        return result;
    }

    @DeleteMapping(value = "/tcc/{txId}", consumes = TCC_MEDIA_TYPE, produces = TCC_MEDIA_TYPE)
    public ResponseEntity cancel(@PathVariable(TRANSACTION_ID) String txId) {
        LOGGER.info("{} begin to cancel transaction {}", getParticipantName(), txId);
        ResponseEntity result;
        try {
            result = executeCancel(txId);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            result = ResponseEntity.notFound().build();
        }
        LOGGER.info("{} finish cancel transaction {} ,result {}", getParticipantName(), txId, result.getStatusCode());
        return result;
    }

    @PutMapping(value = "/tcc/{txId}", consumes = TCC_MEDIA_TYPE, produces = TCC_MEDIA_TYPE)
    public ResponseEntity confirm(@PathVariable(TRANSACTION_ID) String txId) {
        LOGGER.info("{} begin to confirm transaction {}", getParticipantName(), txId);
        ResponseEntity result;
        try {
            result = executeConfirm(txId);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            result = ResponseEntity.notFound().build();
        }
        LOGGER.info("{} finish confirm transaction {} ,result {}", getParticipantName(), txId, result.getStatusCode());
        return result;
    }


    public abstract String getParticipantName();

    public abstract ResponseEntity executeTry(String txId, T body);

    public abstract ResponseEntity executeCancel(String txId);

    public abstract ResponseEntity executeConfirm(String txId);
}
