package com.invoice.controllers;

import com.invoice.service.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class InvoiceController {
    Logger logger = Logger.getLogger(InvoiceController.class.getName());

    @GetMapping("/api/invoices/{id}")
    public ResponseEntity<Long> invoice(@PathVariable("id") int id) {
        logger.fine("Got an invoice request for id " + id);
        logger.fine(System.getenv("EXPECTED_DATE_URI"));
        return new ResponseEntity<>(id * 100 + 10 + new Client().getResponse(id), HttpStatus.OK);
    }
}
