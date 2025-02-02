public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();

        Cat cat = (Cat) animal;
        cat.run();

        if (cat instanceof Cat) {
            ((Cat) cat).walk();
        }
    }
}