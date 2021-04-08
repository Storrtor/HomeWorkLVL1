package HomeWork6;

public class Animal {
    public static int count = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        count++;
        System.out.println("Животное №" + count);
    }

    protected void run(int range){
        System.out.println(name + "пробежал " + range + " м");
    }

    protected void swim(int range){
        System.out.println(name + " проплыл " + range + " м");
    }

    protected void validateRun(int range){
        if(range < 0) {
            throw new IllegalArgumentException("Расстояние не может быть отрицательным");
        }
    }

    protected void validateSwim(int range){
        if(range < 0) {
            throw new IllegalArgumentException("Расстояние не может быть отрицательным");
        }
    }


}
