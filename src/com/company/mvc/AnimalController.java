package com.company.mvc;

import com.company.models.Animal;
import com.company.models.Lion;
import com.company.models.Tiger;
import com.company.models.Zebra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class AnimalController {
    private Animal model;
    private AnimalView view;
    private int num;

    //создание листов для рандома и генерации
    public ArrayList<Animal> animals = new ArrayList<>();
    public ArrayList<Animal> animals2 = new ArrayList<>();

    //создание основного листа для переемещения
    public ArrayList<List> moveList = new ArrayList<>();


    public AnimalController(Animal animal, AnimalView view) {
        this.model = animal;
        this.view = view;
    }

    public AnimalController() {
    }


    //логика выполнения перемещения еды
    public ArrayList moveEat(List list) {

        moveList.add(list);
        for (int i = 0; i < moveList.size(); i++) {
            System.out.println(moveList.get(i));
        }

        return moveList;
    }

    public void changeList() {
        for (int i = 0; i < moveList.size(); i++) {
            if (moveList.get(i).get(0).equals(animals.get(i).getEnclosure())) {
                if (moveList.get(i).get(2).equals(animals.get(i).getEat())) {

                }
            }
        }
    }

    //ввод количества клеток и их дальнейшая обработка
    public ArrayList input() {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            Random random = new Random();
            animals2.add(new Lion(i, "Lion", ThreadLocalRandom.current().nextInt(1, 10), "meat", "no"));
            animals2.add(new Tiger(i, "Tiger", ThreadLocalRandom.current().nextInt(1, 10), "meat", "no"));
            animals2.add(new Zebra(i, "Zebra", ThreadLocalRandom.current().nextInt(1, 10), "hay", "no"));

            int number = random.nextInt(animals2.size());
            animals.add(animals2.get(number));

            animals2.clear();

        }

        return animals;
    }


    public int getEnclosure() {
        return model.getEnclosure();
    }

    public void setEnclosure(int enclosure) {
        model.setEnclosure(enclosure);
    }

    public String getName() {
        return model.getName();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public int getQuantity() {
        return model.getQuantity();
    }

    public void setQuantity(int quantity) {
        model.setQuantity(quantity);
    }

    public String getEat() {
        return model.getEat();
    }

    public void setEat(String eat) {
        model.setEat(eat);
    }

    public String getFood() {
        return model.getFood();
    }

    public void setFood(String food) {
        model.setFood(food);
    }




}
