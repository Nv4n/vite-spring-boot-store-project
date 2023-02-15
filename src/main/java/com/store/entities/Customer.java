package com.store.entities;

public class Customer {
    private static Integer ID = 0;
    private String customerID = this.getClass().getName();

    private String customerUnm;
    private String customerPass;
    private String customerMail;

    public Customer(String customerUnm, String customerPass, String customerMail) {
        this.customerID += (++ID);

        setCustomerUnm(customerUnm);
        setCustomerPass(customerPass);
        setCustomerMail(customerMail);
    }

    public Customer() {
        this("no-customer-username", "no-customer-password",
                "no-customer-mail");
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerUnm() {
        return customerUnm;
    }

    public void setCustomerUnm(String customerUnm) {
        this.customerUnm = customerUnm;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    @Override
    public String toString() {
        return String.format("Customer{\n\tcustomerUnm : %s,\n\tcustomerMail : %s,\n\tcustomerPass : %s\n}",
                customerUnm, customerMail, customerPass);
    }
}