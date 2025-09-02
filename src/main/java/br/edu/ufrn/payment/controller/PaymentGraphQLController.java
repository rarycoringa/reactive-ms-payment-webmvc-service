package br.edu.ufrn.payment.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PaymentGraphQLController {
    @QueryMapping
    public String hello(@Argument String name) {
        return new String("Hello, " + name + "!");
    }

    @QueryMapping
    public void getPayment(Long id) {

    }

    @QueryMapping
    public void getPayments() {

    }

    @MutationMapping
    public void createPayment(Object payment) {

    }

    @MutationMapping
    public void updatePayment(Long id, Object payment) {

    }

    @MutationMapping
    public void deletePayment(Long id) {

    }
}
