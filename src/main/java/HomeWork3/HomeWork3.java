package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

//        /**
//         * №1
//         *  Задать целочисленный массив, состоящий из элементов 0 и 1.
//         *  С помощью цикла и условия заменить 0 на 1, 1 на 0.
//         */
//        int[] arrayZeroOne = {1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
//        for (int i = 0; i < arrayZeroOne.length; i++) {
//            if (arrayZeroOne[i] == 0) {
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
//            if (array[i] < 6) {
//                array[i] = array[i] * 2;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//
//        /**
//         * N4
//         * Создать квадратный двумерный целочисленный массив
//         * и заполнить его диагональные элементы единицами.
//         */
//        int n = 7;
//        int[][] arrayDiagonal = new int[n][n];
//        for (int i = 0; i < arrayDiagonal.length; i++) {
//            for (int j = 0; j < arrayDiagonal[i].length; j++) {
//                if (i == j || i + j == n-1 ) {
//                    arrayDiagonal[i][j] = 1;
//                }
//                System.out.print(" " + arrayDiagonal[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//
//        /**
//         * №5
//         */
//        arrayGivenLengthAndValue(10, 25);
//
//        /**
//         * №6
//         *  Задать одномерный массив и найти в нем минимальный и максимальный элементы
//         */
//        int[] arrayMaxMin = {0, -50, 25, 66, 33, 150, -10};
//        int min = arrayMaxMin[0];
//        int max = arrayMaxMin[0];
//        for (int i = 0; i < arrayMaxMin.length; i++) {
//            if (arrayMaxMin[i] < min) {
//                min = arrayMaxMin[i];
//            } else if (arrayMaxMin[i] > max) {
//                max = arrayMaxMin[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//
//        /**
//         * №7
//         */
//
//        System.out.println(isSumTheSame(arraySeven));

        isSumTheSame(new int[]{1,1,1,2,1});
        isSumTheSame(new int[]{5,5,1,2,1,1,5});
//        badChangePlaces(new int[]{0, 1, 2, 3, 4, 5, 6}, -2);
        System.out.println();

        //changePlaces(new int[]{0, 1, 2, 3, 4, 5, 6}, 1); //5601234



    }

    /**
     * №8
     * Смещение элементов массива на n позиций
     *
     * @param array - одномерный массив
     * @param n     - размер смещения
     * @return - массив
     */
    public static int[] badChangePlaces(int[] array, int n) {
        int a = 0;
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (n >= 0) {
                    if (i + n < array.length) {
                        array2[i] = array[i + n];
                    } else {
                        array2[i] = array[a];
                        a++;
                    }
                System.out.print(array2[i] + " ");
            } else {
                if (i + n < 0) {
                    array2[i] = array[array.length + n + i];
                } else {
                    array2[i] = array[i + n];

                }
                System.out.print(array2[i] + " ");
            }

        }
        return array2;
    }

//    public static int[] changePlaces(int[] array, int n) {
//        int a = 0;
//        int tmp;
//
//        for (int i = 0; i < array.length; i++) {
//
//                tmp = array[i];
//                array[i] = array[i+1];
//                array[i+1] = tmp;
//
//            System.out.print(array[i] + " ");
//
//
//        }
//        return array;
//
//
//    }
//    public static int[] helpMethod(int[] array, int n){
//        for (int i = 0; i < array.length; i++) {
//            int tmp = array[0];
//            array[0] = array[4];
//            array[4] = tmp;
//            System.out.print(array[i] + " ");
//        }
//        return array;
//
//
//    }








    /**
     * №7
     * @param array - не пустой одномерный целочисленный массив
     * @return true, если в массиве есть место, в котором сумма левой и правой части массива равны
     */
    public static boolean isSumTheSame(int[] array) {
        int beginSum = 0;
        int endSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                beginSum += array[j];
                endSum += array[array.length - 1 - j];

            }

        }

        System.out.println(beginSum);
        System.out.println(endSum);
        return true;
    }
}





//    /**
//     * № 5
//     * @param len - длина массива
//     * @param initialValue - значение массива
//     * @return одномерный массив
//     */
//    public static int[] arrayGivenLengthAndValue(int len, int initialValue){
//        int array2[] = new int[len];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = initialValue;
//            System.out.print(array2[i] + " ");
//        }
//        return array2;
//    }



//      OLD VERSION
//    public static int[] changePlaces(int[] array, int n){
//
//        for (int i = 0; i < array.length; i++) {
//            if (i + n < array.length) {
//
//                array[i] = array[i + n];
//            } else {
//                array[i] = array[array.length - i - 1];
//
//            }
//
//            System.out.print(array[i] + " ");
//        }
//        return array;
//}








