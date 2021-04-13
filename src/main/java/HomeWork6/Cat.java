package HomeWork6;

public class Cat extends Animal {

    public static int count1 = 0;

    public Cat(String name) {
        super(name);
        count1++;
        System.out.println("Кот №" + count1);
    }

    @Override
    protected void run(int range) {
        super.validateRange(range);
        validateRun(range);
        super.run(range);

    }

    @Override
    protected void swim(int range) {
        System.out.println("Кот не умеет плавать");
    }


    @Override
    protected void validateRun(int range) {
        super.validateRange(range);
        if (range > 200) {
            throw new IllegalArgumentException("Кот не может пробежать больше 200 метров");
        }
    }
}
