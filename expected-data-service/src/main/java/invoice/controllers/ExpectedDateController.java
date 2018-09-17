package invoice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ExpectedDateController {
    Logger logger = Logger.getLogger(ExpectedDateController.class.getName());

    @GetMapping("/api/expected-date/{id}")
    public ResponseEntity<Long> invoice(@PathVariable("id") int id) {
        logger.fine("Got an expected date request for id " + id);
        return new ResponseEntity<>(System.currentTimeMillis() + id, HttpStatus.OK);
    }
}
