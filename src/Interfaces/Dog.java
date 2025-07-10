package Interfaces;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
    }
}
