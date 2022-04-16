package com.company;

public class Bat extends Animal {
    int breast;

    public Bat(String name,
               String color,
               int legs,
               int age,
               double weight,
               String type) {
        super(name,color,legs,age,weight,type);
        this.breast = breast;
    }

    public int getBreast(){
        return this.breast;
    }
    public void setBreast(int breast){
        this.breast = breast;
    }

  /*  @Override
    public String toString() {
        return "Bat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", legs=" + legs +
                ", age=" + age +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", breast=" + breast +
                '}';


   */
}