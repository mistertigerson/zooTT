package com.company.models;

public class Zebra extends Animal{


    public Zebra(int enclosure, String name, int quantity, String eat, String food) {
        super(enclosure, name, quantity, eat, food);
    }

    public Zebra(int enclosure,int quantity ) {
    }

    public Zebra() {
        super();
    }

    @Override
    public int getMinFood() {
        return super.getMinFood();
    }

    @Override
    public void setMinFood(int minFood) {
        minFood = getAppetite() * getQuantity();
        super.setMinFood(minFood);
    }

    @Override
    public int getAppetite() {
        return super.getAppetite();
    }

    @Override
    public void setAppetite(int appetite) {
        super.setAppetite(appetite);
    }

    @Override
    public int getEnclosure() {
        return super.getEnclosure();
    }

    @Override
    public void setEnclosure(int enclosure) {
        super.setEnclosure(enclosure);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        name = "Zebra";
        super.setName(name);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public String getEat() {
        return super.getEat();
    }

    @Override
    public void setEat(String eat) {
        eat = "hay";
        super.setEat(eat);
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }
}
