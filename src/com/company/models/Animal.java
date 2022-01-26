package com.company.models;

public class Animal {

    private int enclosure;
    private String name;
    private int quantity;
    private String eat;
    private String food;
    private int appetite;
    public int minFood;


    public Animal(int enclosure, String name, int quantity, String eat, String food) {
        this.enclosure = enclosure;
        this.name = name;
        this.quantity = quantity;
        this.eat = eat;
        this.food = food;
    }

    public int getMinFood() {
        return minFood;
    }

    public void setMinFood(int minFood) {
        minFood = appetite * quantity;
        this.minFood = minFood;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Animal() {

    }

    public int getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(int enclosure) {
        this.enclosure = enclosure;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String toString() {
        return "enclosure: " + this.enclosure
                + ". name: " + this.name
                + ". Quantity: " + this.quantity
                + ". eat: " + this.eat
                + ". food: " + this.food;
    }
}
