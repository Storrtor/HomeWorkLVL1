package HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {

        /**
         * до изменения ДЗ:
         */
        boolean myBoolean = true;
        char myChar = 'b';
        byte myByte = 10;
        short myShort = 100;
        int myInt = 258;
        long myLong = 285000L;
        float myFloat = 1.05555555f;
        double myDouble = 1.02;

        System.out.println(computeNumbers(2.01f, 4.05f, 10.015f, 2.0484f));

        System.out.println("-----------");
        /**
         * После изменения ДЗ:
         */

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }

    public static float computeNumbers(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = -100;
        int b = 20;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 500;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
