public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void walk() {
        System.out.println("dog walking...");
    }

    public void run() {
        System.out.println("dog running...");
    }
}
