package com.example.cartoonlist;

public class CartoonData {
    private String cartoonName;
    private String cartoonDescription;
    private Integer cartoonImage;

    public CartoonData(String cartoonName, String cartoonDescription, Integer cartoonImage) {
        this.cartoonName = cartoonName;
        this.cartoonDescription = cartoonDescription;
        this.cartoonImage = cartoonImage;
    }

    public String getCartoonName() {
        return cartoonName;
    }

    public void setCartoonName(String cartoonName) {
        this.cartoonName = cartoonName;
    }

    public String getCartoonDescription() {
        return cartoonDescription;
    }

    public void setCartoonDescription(String cartoonDescription) {
        this.cartoonDescription = cartoonDescription;
    }

    public Integer getCartoonImage() {
        return cartoonImage;
    }

    public void setCartoonImage(Integer cartoonImage) {
        this.cartoonImage = cartoonImage;
    }
}
