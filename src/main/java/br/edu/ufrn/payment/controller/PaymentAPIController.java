package br.edu.ufrn.payment.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PaymentAPIController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return new String("Hello, " + name + "!");
    }
    
    @GetMapping("/{id}")
    public void getPayment(@PathVariable("id") Long id) {

    }

    @GetMapping
    public void getPayments() {

    }

    @PostMapping
    public void createPayment(@RequestBody Object payment) {

    }

    @PutMapping("/{id}")
    public void updatePayment(@PathVariable("id") Long id, @RequestBody Object payment) {

    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable("id") Long id) {

    }
}
