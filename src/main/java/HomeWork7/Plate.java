package HomeWork7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public void info(){
        System.out.println(this);
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }
    public void decreaseCount(int appetite){
        if(validateCount(appetite) == true){
            return;
        }
        foodCount -= appetite;
    }

    /**
     * №2,4 Валидация на количество еды в тарелке. Кот не трогает еду, если ему не хватает
     * @param appetite
     * @return
     */
    public boolean validateCount(int appetite){
        if(getFoodCount() < appetite){
            System.out.println("Коту недостаточно еды в тарелке");
            return true;
        }
        return false;

    }

    /**
     * №6 Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
     * @param addedFood
     */
    public void addFood(int addedFood){
        foodCount += addedFood;
    }


}
