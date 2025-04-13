package io.meltingscales.amethystalgorithms.codingbasics;

public class CodingBasicsConstructors {

  public static void main(String[] args) {

    class Animal {

      String name;
      int age;
      String color;

      public Animal() {}

      public Animal(String name) {
        this.name = name;
      }

      public Animal(String name, int age) {
        this.name = name;
        this.age = age;
      }

      public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
      }

      public void printInfo() {
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age);
        System.out.println("Animal color: " + color);
        System.out.println();
      }
    }

    // Using the no-argument constructor
    Animal unknownAnimal = new Animal();
    unknownAnimal.printInfo();

    // Using the constructor with the name parameter
    Animal lion = new Animal("Lion");
    lion.printInfo();

    // Using the constructor with the name and age parameters
    Animal tiger = new Animal("Tiger", 5);
    tiger.printInfo();

    // Using the constructor with the name, age, and color parameters
    Animal elephant = new Animal("Elephant", 10, "Gray");
    elephant.printInfo();
  }
}
