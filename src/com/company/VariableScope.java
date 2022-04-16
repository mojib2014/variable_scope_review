package com.company;

public class VariableScope {
    private String name;
    public static int age = 3;

    public static void speak(String color) {
        System.out.println(color);
        System.out.println(age);
    }

    public void chageName() {
        name = "something new";
        speak("green");
    }
    public static void main(String [] args) {
        int x = 1;
        VariableScope a = new VariableScope();
        a.chageName();
        a.age = 5;
        System.out.println(a.age);
        System.out.println(a.name);
    }
}
