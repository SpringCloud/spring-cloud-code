package cn.springcloud.book.controller;

import com.atomikos.icatch.tcc.rest.CoordinatorImp;
import com.atomikos.tcc.rest.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caibosi on 2018-07-27.
 */
@RestController
@RequestMapping(value = "/coordinator", consumes = "application/tcc+json")
public class TccCoordinatorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TccCoordinatorController.class);

    CoordinatorImp coordinatorImp = new CoordinatorImp();

    @PutMapping(path = "/confirm")
    public ResponseEntity confirm(@RequestBody Transaction transaction) {
        try {
            coordinatorImp.confirm(transaction);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
            return ResponseEntity
                    .notFound()
                    .build();
        }
    }

    @PutMapping(path = "/cancel")
    public ResponseEntity cancel(@RequestBody Transaction transaction) {
        try {
            coordinatorImp.cancel(transaction);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
            return ResponseEntity
                    .notFound()
                    .build();
        }
    }
}
