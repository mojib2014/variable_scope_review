package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Ol","Black", 4, 5, 2.4, "Dog");
//        animal.setName("Maliot");
//        animal.setColor("Black");
//
//
//        System.out.println(animal.ToString());
    /*
        Bat bat = new Bat();
        bat.name = "Winch";
        bat.color = "Brown";
        bat.legs = 2;
        bat.age = 12;
        bat.weight = .4;
        bat.type= "Bird";
        System.out.println();
        System.out.println(bat.ToString());
    */

        VariableScope a = new VariableScope();
        a.age = 20;
        System.out.println(a.age);
        a.speak("red");
        VariableScope.speak("brown");
    }
}
