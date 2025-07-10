package Interfaces;

class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.run();
    }
}
