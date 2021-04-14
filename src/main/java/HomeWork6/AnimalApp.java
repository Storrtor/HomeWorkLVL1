package HomeWork6;

public class AnimalApp {

    public static void main(String[] args) {

        Dog dog = new Dog("Байкал");
        Cat cat = new Cat("Теллур");
        Cat cat1 = new Cat("Mur");
        Dolphin dolphin = new Dolphin("Nut");

        dolphin.swim(10);


        dog.run(50);
        dog.swim(7);

        cat.run(150);
        cat.swim(7);



    }
}
