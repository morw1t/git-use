public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void walk() {
        System.out.println("cat walking...");
    }

    public void run() {
        System.out.println("cat running...");
    }
}
