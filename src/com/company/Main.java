package com.company;

public class Main {
    public static void main(String[] args) {
        Veterinary vet = new Veterinary();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("косточками", " в Мадриде", "Боня"," черная");
        animals[1] = new Cat("рыбой", " в Париже", "Симка"," рыжая");
        animals[2] = new Horse("травой", " в Маями","Максимум", " белая");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
abstract class Animal {
    String food;
    String location;
    String name;
    String coloration;

    Animal(String food, String location,String name,String  coloration) {
        this.food = food;
        this.location = location;
        this.name = name;
        this. coloration = coloration;
    }

    public void makeNoise() {
        System.out.println("Бегает");
    }
    public void eat() {

        System.out.println("Ест");
    }
    public void sleep() {

        System.out.println("Спит");
    }
}
class Dog extends Animal {

    Dog(String food, String location, String name, String  coloration) {
        super(food, location, name, coloration);

    }
    @Override
    public void makeNoise() {
        System.out.printf("Name: %s \n  coloration: %s \n speaking: гаф");
    }
    @Override
    public void sleep() {
        System.out.printf("Собака спит");
    }
}
class Cat extends Animal {

    Cat(String food, String location, String name, String  coloration) {
        super(food, location, name, coloration);

    }
    @Override
    public void makeNoise() {
        System.out.printf("Name: %s \n  coloration: %s \n speaking: мяу");
    }
    @Override
    public void sleep() {
        System.out.printf("Кошка спит");
    }
}
class Horse extends Animal {

    public Horse(String food, String location, String name, String  coloration) {
        super(food, location, name, coloration);
    }
    @Override
    public void makeNoise() {
        System.out.printf("Name: %s \n coloration: %s \n speaking: иго-го");
    }
    @Override
    public void eat() {
        System.out.printf("Лошадь кушает");
    }
}
class Veterinary {
    void treatAnimal(Animal animal) {
        System.out.println("На приеме у ветеринара была " +animal.name);
        System.out.println("Кличка " +animal.name);
        System.out.println("Откраска" +animal. coloration);
        System.out.println( "Питается " +animal.food);
        System.out.println("Питомец находится" +animal.location);
        System.out.println();
    }
}