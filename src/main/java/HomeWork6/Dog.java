package HomeWork6;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        count++;
        System.out.println("Собака №" + count);
    }

    @Override
    protected void run(int range) {
        validateRun(range);
        super.run(range);

    }

    @Override
    protected void swim(int range) {
        validateSwim(range);
        super.swim(range);
    }

    @Override
    protected void validateRun(int range) {
        if(range < 0) {
            throw new IllegalArgumentException("Расстояние не может быть отрицательным");
        } else if (range > 500) {
            throw new IllegalArgumentException("Собака не может пробежать больше 500 метров");
        }
    }

    @Override
    protected void validateSwim(int range) {
        if(range < 0) {
            throw new IllegalArgumentException("Расстояние не может быть отрицательным");
        } else if (range > 10) {
            throw new IllegalArgumentException("Собака не может проплыть больше 10 метров");
        }
    }


}
