package com.company.ui;

import com.company.models.Animal;
import com.company.mvc.AnimalController;
import com.company.mvc.AnimalView;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Animal model = new Animal();
        AnimalView view = new AnimalView();
        AnimalController controller = new AnimalController(model, view);

        view.firstPrint();
        view.print();
        view.actions();


    }


}
