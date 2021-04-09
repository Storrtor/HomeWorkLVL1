package HomeWork6;

public class Animal {
    /**
     * №4. Подсчет созданных животных
     */
    public static int count = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        count++;
        System.out.println("Животное №" + count);
    }

    /**
     * №2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия
     * @param range
     */
    protected void run(int range){
        System.out.println(name + " пробежал " + range + " м");
    }

    protected void swim(int range){
        System.out.println(name + " проплыл " + range + " м");
    }

    /**
     *
     * №3. Ограничения на бег и плавание
     * @param range
     */
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
