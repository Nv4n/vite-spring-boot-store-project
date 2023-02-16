package com.store.entities;

public class Product {
    private static Integer ID = 0;
    private String prodID = this.getClass().getName();

    private String prodName;
    private ProductCategory prodCategory;
    private double prodPrice;
    private int prodCount;
    private String prodDescr;

    public Product(String prodName, ProductCategory prodCategory, double prodPrice, int prodCount, String prodDescr) {
        this.prodID += (++ID);

        setProdName(prodName);
        setProdCategory(prodCategory);
        setProdPrice(prodPrice);
        setProdCount(prodCount);
        setProdDescr(prodDescr);
    }

    public Product() {
        this("no-product-name", null, 0.00, 0, "no-product-description");
    }

    public String getProdID() {
        return prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdCategory(ProductCategory prodCategory) {
        this.prodCategory = prodCategory;
    }

    public ProductCategory getProdCategory() {
        return prodCategory;
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
        return String.format("Product {\n\tprodID : %s,\n\tprodName : %s,\n\tprodCategory : %s,\n\tprodPrice : %.2f,\n\tprodCount : %d\n}",
                prodID, prodName, prodCategory, prodPrice, prodCount);
    }
}