package com.store.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static Integer ID = 0;
    private String ordId = this.getClass().getName();

    private LocalDate ordDate;
    private List<String> ordProdsIdsLst;
    private String ordCustomerId;
    private String ordCustomerTelephone;
    private String ordCustomerAddress;
    private String ordComment;
    private double ordTotalPrice;
    private PaymentType ordPayment;

    public Order(LocalDate ordDate, List<String> ordProdsIdsLst, String ordCustomerId, String ordCustomerTelephone,
                    String ordCustomerAddress, String ordComment, double ordTotalPrice, PaymentType ordPayment) {
        this.ordId += (++ID);

        setOrdDate(ordDate);
        setOrdProdsIdsLst(ordProdsIdsLst);
        setOrdCustomerId(ordCustomerId);
        setOrdCustomerTelephone(ordCustomerTelephone);
        setOrdCustomerAddress(ordCustomerAddress);
        setOrdComment(ordComment);
        setOrdTotalPrice(ordTotalPrice);
        setOrdPayment(ordPayment);
    }

    public Order() {
        this(LocalDate.now(), new ArrayList<>(), "Customer1", "no-customer-telephone",
                "no-customer-address", "no-order-comment", 0.00, null);
    }

    public String getOrdId() {
        return ordId;
    }

    public LocalDate getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(LocalDate ordDate) {
        this.ordDate = ordDate;
    }

    public List<String> getOrdProdsIdsLst() {
        return ordProdsIdsLst;
    }

    public void setOrdProdsIdsLst(List<String> ordProdsIdsLst) {
        this.ordProdsIdsLst = ordProdsIdsLst;
    }

    public String getOrdCustomerId() {
        return ordCustomerId;
    }

    public void setOrdCustomerId(String ordCustomerId) {
        this.ordCustomerId = ordCustomerId;
    }

    public String getOrdCustomerTelephone() {
        return ordCustomerTelephone;
    }

    public void setOrdCustomerTelephone(String ordCustomerTelephone) {
        this.ordCustomerTelephone = ordCustomerTelephone;
    }

    public String getOrdCustomerAddress() {
        return ordCustomerAddress;
    }

    public void setOrdCustomerAddress(String ordCustomerAddress) {
        this.ordCustomerAddress = ordCustomerAddress;
    }

    public String getOrdComment() {
        return ordComment;
    }

    public void setOrdComment(String ordComment) {
        this.ordComment = ordComment;
    }

    public double getOrdTotalPrice() {
        return ordTotalPrice;
    }

    public void setOrdTotalPrice(double ordTotalPrice) {
        this.ordTotalPrice = ordTotalPrice;
    }

    public PaymentType getOrdPayment() {
        return ordPayment;
    }

    public void setOrdPayment(PaymentType ordPayment) {
        this.ordPayment = ordPayment;
    }

    @Override
    public String toString() {
        return String.format("Order{\n\tordId : %s,\n\tordDate : %s,\n\tordProdsIdsLst : %s,\n\tordCustomerId : %s,\n\tordCustomerAddress : %s,\n\tordTotalPrice : %.2f,\n\tordPayment : %s\n}",
                ordId, ordDate, ordProdsIdsLst, ordCustomerId, ordCustomerAddress, ordTotalPrice, ordPayment);
    }
}