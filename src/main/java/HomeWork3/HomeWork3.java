package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        changeOneToZero(new int[]{1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1});

        fillArray(new int[100]);

        multiplicationArray(new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});

        fillOneToDiagonal(5);

        arrayGivenLengthAndValue(10, 25);
        System.out.println();

        findMaxAndMin(new int[]{0, -50, 25, 66, 33, 150, -10});

        System.out.println("Результат: " + isSumTheSame(new int[]{1, 1, 2, 4}));

        changePlaces(new int[]{0, 1, 2, 3, 4}, 2);
        System.out.println();
        changePlaces(new int[]{0, 1, 2, 3, 4}, -2);

    }

    /**  №1
     * @param array целочисленный массив, состоящий из эдементов 0 и 1.
     * @return массив в котором заменяется 0 на 1, 1 на 0.
     */
    public static int[] changeOneToZero(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    /**
     * #2
     * Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.
     */
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    /**
     * №3
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2
     */
    public static int[] multiplicationArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    /**
     * N4
     * Создать квадратный двумерный целочисленный массив
     * и заполнить его диагональные элементы единицами.
     */
    public static int[][] fillOneToDiagonal(int n){
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == n - 1) {
                    array[i][j] = 1;
                }
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    /**
     * № 5
     * @param len          - длина массива
     * @param initialValue - значение массива
     * @return одномерный массив
     */
    public static int[] arrayGivenLengthAndValue(int len, int initialValue) {
        int array[] = new int[len];
        Arrays.fill(array,initialValue);
        return array;
    }

    /**
     * №6
     *  Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    public static int[] findMaxAndMin(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный: " + min);
        System.out.println("Макисмальный: " + max);
        return array;

    }


    /**
     * №7
     *
     * @param array - не пустой одномерный целочисленный массив
     * @return true, если в массиве есть место, в котором сумма левой и правой части массива равны
     */
    public static boolean isSumTheSame(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += array[j];
            }
            for (int j = i; j < array.length; j++) {
                sum -= array[j];
            }
            if (sum == 0)
                return true;
        }
        return false;
    }


    /**
     * №8
     * Смещение элементов массива на n позиций
     *
     * @param array - одномерный массив
     * @param n     - размер смещения
     * @return - массив
     */
    public static void changePlaces(int[] array, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = tmp;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}














