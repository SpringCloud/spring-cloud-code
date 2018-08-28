package cn.springcloud.book.service;

import com.atomikos.tcc.rest.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by caibosi on 2018-07-27.
 */
@Component
public class TccCoordinatorClient {

    private static final MediaType APPLICATION_TCC_JSON = new MediaType("application", "tcc+json");

    @Value("${tcc.coordinator.url}")
    String tccCoordinatorUrl;

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<String> confirm(Transaction transaction) {
        RequestEntity<Transaction> requestEntity = RequestEntity.put(URI.create(tccCoordinatorUrl + "/confirm"))
                .contentType(APPLICATION_TCC_JSON)
                .body(transaction);
        return restTemplate.exchange(requestEntity, String.class);
    }

    public ResponseEntity<String> cancel(Transaction transaction) {
        RequestEntity<Transaction> requestEntity = RequestEntity.put(URI.create(tccCoordinatorUrl + "/cancel"))
                .contentType(APPLICATION_TCC_JSON)
                .body(transaction);
        return restTemplate.exchange(requestEntity, String.class);
    }
}
