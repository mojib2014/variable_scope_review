package com.company;

public class Animal {

    private String name;
    private String color;
    private int legs;
    private int age;
    private double weight;
    private String type;


    public Animal(String name, String color, int legs, int age, double weight, String type) {
        if(name.length() <= 3) {
            System.out.println("Name must be at least 3 characters!");
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.age = age;
        this.weight = weight;
        this.type = type;
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name)
    {
        if(name.length() <=3) {
            System.out.println("Name must be greater than three characters");
            return;
        }else
        {
            this.name = name;
        }


    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getLegs(){
        return this.legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }


    public String ToString(){
        String print = (
                "Name: " + this.name + "\n"
                        + "Color: " + this.color + "\n"
                        + "Legs: " + this.legs + "\n"
                        + "Age: " + this.age + "\n"
                        + "Weight: " + this.weight + "\n"
                        + "Type: " + this.type
        );
        return print;
    }

    public static void test(){
        System.out.println("Hi");
    }
}

