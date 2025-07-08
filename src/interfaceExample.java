class Monkey{
    void jump(){
        System.out.println("Jumpiong...");
    }
    void bite(){
        System.out.println("Biting");
    }
}

interface   BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        Human h =new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
        h.speak();

        //Demonstrating Polymorphism using Monkey class

        Monkey mansi = new Human();
        mansi.bite();
        mansi.jump();
        // mansi.speak(); ---> cannont run because human is subclass of monkey and monkey cannot speak.
    }
}
