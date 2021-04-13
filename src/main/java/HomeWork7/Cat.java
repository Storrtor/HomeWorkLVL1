package HomeWork7;


public class Cat {
    /**
     * №3 Создали коту поле сытость
     */
    private String name;
    private int appetite;
    private boolean fulness;


    public Cat(String name, int appetite, boolean fulness) {
        this.name = name;
        this.appetite = appetite;
        this.fulness = fulness;
    }

    /**
     * №3 При создании коты голодны, если не задать иного
     * @param name
     * @param appetite
     */
    public Cat(String name, int appetite) {
        this(name, appetite, false);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fulness=" + fulness +
                '}';
    }

    public void info(){
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFulness() {
        return fulness;
    }

    public void setFulness(boolean fulness) {
        this.fulness = fulness;
    }

    /**
     * Если коту удалось покушать, то сытость = true
     * @param plate
     */
    public void eat(Plate plate){
        if (plate.validateCount(this.appetite) == true){
            return;
        }
        plate.decreaseCount(this.appetite);
        this.fulness = true;
    }


}
