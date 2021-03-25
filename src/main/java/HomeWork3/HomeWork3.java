package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {


//        /**
//         * №1
//         *  Задать целочисленный массив, состоящий из элементов 0 и 1.
//         *  С помощью цикла и условия заменить 0 на 1, 1 на 0.
//         */
//        int[] arrayZeroOne = {1, 1, 0, 0, 0, 1, 1, 0 ,1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
//        for (int i = 0; i < arrayZeroOne.length; i++) {
//            if(arrayZeroOne[i] == 0) {
//                arrayZeroOne[i] = 1;
//            } else {
//                arrayZeroOne[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(arrayZeroOne));
//
//
//        /**
//         * #2
//         * Задать пустой целочисленный массив длиной 100.
//         * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.
//         */
//        int[] emptyArray = new int[100];
//        for (int i = 0; i < emptyArray.length; i++) {
//            emptyArray[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(emptyArray));
//
//        /**
//         * №3
//         * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//         * пройти по нему циклом, и числа меньшие 6 умножить на 2
//         */
//        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 6){
//                array[i] = array[i] * 2;
//            }
//        }
//        System.out.println(Arrays.toString(array));

        /**
         * N4
         * Создать квадратный двумерный целочисленный массив
         * и заполнить его диагональные элементы единицами.
         */
        int[][] arrayDiagonal = new int[5][5];
        for (int i = 0; i < arrayDiagonal.length; i++) {
            for (int j = 0; j < arrayDiagonal[i].length; j++) {
                if (i == j) {
                    arrayDiagonal[i][j] = 1;
                   }
                System.out.print(" " + arrayDiagonal[i][j] + " ");
            }
            System.out.println();

        }












    }
}
