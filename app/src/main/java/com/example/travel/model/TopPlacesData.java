package com.example.travel.model;

public class TopPlacesData {
    String placeName;
    String CountryName;
    String Price;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TopPlacesData(String placeName, String countryName, String price, Integer imageUrl) {
        this.placeName = placeName;
        this.CountryName = countryName;
        this.Price = price;
        this.imageUrl = imageUrl;
    }

    // getter and setter

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
