package com.company.mvc;

import com.company.models.Animal;

import java.util.*;

public class AnimalView {

    private AnimalController controller;

    //первый вывод текста при начале игры
    public void firstPrint() {
        System.out.println("Please enter the number of enclosure to create");
    }

    //инициализация контроллера и вывод листа
    public void print() {
        controller = new AnimalController();
        ArrayList animals = controller.input();

        Iterator itr = animals.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    //выбор действий и дальнейший сет входящих параметров
    public void actions() {
        while (true) {
            System.out.println("please enter an action: 1 move, 2 next");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                List list = new ArrayList();
                System.out.println("введите количество еды ");
                int inputQuantity = scanner.nextInt();
                System.out.println("введите вид еды ");
                String inputEat = scanner.next();
                System.out.println("введите номер вальера ");
                int inputEnclosure = scanner.nextInt();
                list.add(0, inputEnclosure);
                list.add(inputQuantity);
                list.add(inputEat);
                controller.moveEat(list);

            } else {
                break;
            }
        }
        controller.changeList();

    }

}
