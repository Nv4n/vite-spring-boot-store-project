package com.store.entities;

public class Product {
    private int prodID;
    private String prodName;
    private double prodPrice;
    private int prodCount;
    private String prodDescr;

    public Product(int prodID, String prodName, double prodPrice, int prodCount, String prodDescr) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodCount = prodCount;
        this.prodDescr = prodDescr;
    }

    public Product() {
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdCount() {
        return prodCount;
    }

    public void setProdCount(int prodCount) {
        this.prodCount = prodCount;
    }

    public String getProdDescr() {
        return prodDescr;
    }

    public void setProdDescr(String prodDescr) {
        this.prodDescr = prodDescr;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                ", prodCount=" + prodCount +
                ", prodDescr='" + prodDescr + '\'' +
                '}';
    }
}