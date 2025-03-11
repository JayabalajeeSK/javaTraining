package com.jb.T11OOPSAgain;
abstract class Animal
{
    abstract void bark();
}
class Dog extends Animal{
    public void bark()
    {
        System.out.println("bow bow");
    }
}
class Cat extends Animal{
    public void bark()
    {
        System.out.println("meow meow");
    }
}
public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals={new Cat(), new Dog()};
        for(Animal animal: animals)
        {
            animal.bark();
        }
    }
}
// meow meow
// bow bow