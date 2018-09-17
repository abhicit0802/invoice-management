package com.invoice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static java.lang.System.getenv;

@Service
public class Client {

    public Long getResponse(int id) {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(getenv("EXPECTED_DATE_URI"));
        String expected_date_uri
                = getenv("EXPECTED_DATE_URI") + "/api/expected-date/" + Integer.toString(id);
        System.out.println(expected_date_uri);
        ResponseEntity<Long> response
                = restTemplate.getForEntity(
                expected_date_uri,
                Long.class);
        return response.getBody();
    }
}
