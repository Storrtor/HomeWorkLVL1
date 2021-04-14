package HomeWork6;

public class Dog extends Animal{

    public static int count2 = 0;

    public Dog(String name) {
        super(name);
        count2++;
        System.out.println("Собака №" + count2);
    }

    @Override
    protected void run(int range) {
        validateRange(range);
        validateRun(range);
        super.run(range);

    }

    @Override
    protected void swim(int range) {
        validateRange(range);
        validateSwim(range);
        super.swim(range);
    }

    @Override
    protected void validateRun(int range) {
        super.validateRange(range);
        if(range > 500) {
            throw new IllegalArgumentException("Собака не может пробежать больше 500 метров");
        }
    }

    @Override
    protected void validateSwim(int range) {
        super.validateRange(range);
        if (range > 10) {
            throw new IllegalArgumentException("Собака не может проплыть больше 10 метров");
        }
    }
}
