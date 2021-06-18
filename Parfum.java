package com.company;

import java.util.Arrays;

public class Parfum {
    private static int stars;

    private String name;
    private String brand;
    private float price;
    private int volume;

    private String[] composition;
    private String fragranceType;
    private String fragranceAuthor;
    private String material;

    protected String type;
    protected boolean isVerified;

    public Parfum() {
        stars += 1;
    }

    public Parfum(String name, String brand, float price, int volume) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.volume = volume;

        stars += 1;
    }

    public Parfum(String name, String brand, float price, int volume, String[] composition,
                  String fragranceType, String fragranceAuthor, String material,
                  String type, boolean isVerified) {
        resetValues(name,brand, price, volume, composition, fragranceType, fragranceAuthor,
                material, type, isVerified);
        stars += 1;
    }

    public static int getStars() {
        return stars;
    }

    public static void setStars(int stars) {
        Parfum.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String[] getComposition() {
        return composition;
    }

    public void setComposition(String[] composition) {
        this.composition = composition;
    }

    public String getFragranceType() {
        return fragranceType;
    }

    public void setFragranceType(String fragranceType) {
        this.fragranceType = fragranceType;
    }

    public String getFragranceAuthor() {
        return fragranceAuthor;
    }

    public void setFragranceAuthor(String fragranceAuthor) {
        this.fragranceAuthor = fragranceAuthor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public static void printStaticRating() {
        System.out.println("rating from class: "+ stars);
    }
    public void printRating(){
        System.out.println("rating from object: "+ stars);
    }

    public void resetValues(String name, String brand, float price, int volume, String[] composition,
                            String fragranceType, String fragranceAuthor, String material,
                            String type, boolean isVerified){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.volume = volume;
        this.composition = composition;
        this.fragranceType = fragranceType;
        this.fragranceAuthor = fragranceAuthor;
        this.material = material;
        this.type = type;
        this.isVerified = isVerified;
    }

    @Override
    public String toString() {
        return   "\n|Brand: " + brand +
                "|\n|Price: " + price +
                "|\n|Size: " + volume +
                "|\n|Type: " + type +
                "|\n|Name: " + name +
                "|\n|Fragrance Type: " + fragranceType +
                "|\n|Composition: " + Arrays.toString(composition) +
                "|\n|Fragrance author: " + fragranceAuthor +
                "|\n|Material: " + material +
                "|\n| Verified: " + isVerified ;
    }

}
