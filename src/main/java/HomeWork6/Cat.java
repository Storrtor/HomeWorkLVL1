package HomeWork6;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
        count1++;
        System.out.println("Кот №" + count1);
    }

    @Override
    protected void run(int range) {
        validateRun(range);
        super.run(range);

    }

    @Override
    protected void swim(int range) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    protected void validateRun(int range) {
        if(range < 0) {
            throw new IllegalArgumentException("Расстояние не может быть отрицательным");
        } else if(range > 200){
            throw new IllegalArgumentException("Кот не может пробежать больше 200 метров");
        }
    }


}
