package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class CrossAndZeroes {
    public static char[][] map;
    public static int size;
    public static int dots_to_win;

    public static int count1 = 0;
    public static int count2 = 0;
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;
    public static int count6 = 0;

    public static int step1;
    public static int step2;
    public static int step3;

    public static int x, y;



    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '*';

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void initMap(int size) {
        map = new char[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        //Нумерация столбцов
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Нумерация строк
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn(int size) {
        int x, y;
        do {
            System.out.println("Введите координаты хода, где Х - (cтрока) У - (столбец)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y, size));
        map[x][y] = DOT_X;

    }

    public static boolean isCellValid(int x, int y, int size) {
        if (x < 0 || x >= size || y < 0 && y >= size) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void aiTurn(int size) {
        System.out.println();
        do {
            //Диагонали работают
            if (dots_to_win == count1 - 2) {
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        if(i + j == map.length - 1) {
                            if(!isCellValid(x, y,size)) {
                                x = i;
                                y = j;
                            }
                        }

                    }
                }
            } else if (dots_to_win == count2 - 2){
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        if(i == j) {
                            if(!isCellValid(x, y,size)) {
                                x = i;
                                y = j;
                            }
                        }

                    }
                } //Вот отсюда и ниже не работает, потому что при проверке строк у меня обнуляется count, когда я перехожу на проверку следующей строчки,
                // и даже если там и было допустим 2, то на выходе из цикла будет -3 по последней строчке.
                // На самом деле с другими параметрами аналогично
            } else if (dots_to_win == count3 - 2) { // Строки
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        if(!isCellValid(x,y,size)) {
                            x = i;
                            y = j;
                        }
                    }

                }
            } else if (dots_to_win == count4 - 2) {
                // Столбцы

                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        x = i;
                        y = j;
                    }
                }
            } else if (dots_to_win == count5 - 2) {
                // Диагонали при поле 5 и дотс 4

                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        x = i;
                        y = j;
                    }
                } // Диагонали при поле 5 и дотс 4

                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        x = i;
                        y = j;
                    }
                }
            } else {
                x = random.nextInt(size);
                y = random.nextInt(size);
            }

        } while (!isCellValid(x, y, size));
        System.out.println("Компьютер походил в " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;

    }

    public static boolean isFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }



    public static boolean checkWin(char dot, int dots_to_win) {
        // Условия победы диагоналей
        count1 = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i + j == map.length - 1) {
                    if (map[i][j] != dot) {
                        count1--;
                    }
                    if (map[i][j] == dot) {
                        count1++;
                        if (dots_to_win == count1) {
                            return true;
                        }
                    }
                }
            }
        }
        count2 = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == j) {
                    if (map[i][j] != dot) {
                        count2--;
                    }
                    if (map[i][j] == dot) {
                        count2++;
                        if (dots_to_win == count2)
                            return true;
                    }
                }
            }
        }

        //Условия победы строк
        count3 = 0;
        step1 = 0;
        for (int i = 0; i < map.length; i++) {
            if (i == step1) {
                count3 = 0;
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] != dot) {
                        count3--;
                    }
                    if (map[i][j] == dot) {
                        count3++;
                        if (dots_to_win == count3) {
                            return true;
                        }
                    }
                }
                step1++;
            }
        }

        //Условие победы столбцов
        count4 = 0;
        step2 = 0;
        do {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {

                    if(j == step2) {
                        if (map[i][j] != dot) {
                            count4--;
                        }
                        if (map[i][j] == dot) {
                            count4++;
                            if (dots_to_win == count4) {
                                return true;
                            }
                        }
                    }
                }

            }
            count4 = 0;
            step2++;
        } while (step2 < map.length);


        //Условие победы побочных диагоналей при DOTS_TO_WIN = 4 на поле 5;
        /**
         * Я пыталась написать в общем виде, чтобы на любом размере поля больше 5 при параметре DOTS_TO_WIN = 4
         * все возможные диагонали давали победу при 4х точках, но условие очень сложное получается.
         * Я не исключаю, что можно найти закономерность, но у меня не получилось((
         * Поэтому DOTS_TO_WIN = 4 будет работать только на поле 5 ((
         */
        count5 = 0;
        step3 = 1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == dot) {
                    if (i + j == step3) {
                        count5++;
                        if ( dots_to_win == count5) {
                            return true;
                        }
                        step3 = step3 + 2;
                    }
                }
            }
        }
        count6 = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i + j == 3) {
                    if (map[i][j] != dot) {
                        count6--;
                    }
                    if (map[i][j] == dot) {
                        count6++;
                        if ( dots_to_win == count6) {
                            return true;
                        }
                    }
                    if (i + j == 5) {
                        if (map[i][j] != dot) {
                            count6--;
                        }
                        if (map[i][j] == dot){
                            count6++;
                            if (dots_to_win == count6) {
                                return true;
                            }
                        }

                    }
                }
            }
        }

        return false;
    }


    public static void play(int size) {
        initMap(size);
        printMap();
        while (true) {
            humanTurn(size);
            printMap();
            if (checkWin(DOT_X, dots_to_win)) {
                System.out.println("Победил человек");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn(size);
            printMap();
            if (checkWin(DOT_O, dots_to_win)) {
                System.out.println("Победил компуктер");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Пора поиграть!");
        int d;
        do {
            System.out.println("Введите размер поля на котором хотите поиграть от 3 до 10");
            d = scanner.nextInt();
        } while (d < 3 || d > 10);
        do {
            System.out.printf("Введите количество заполненных клеточек, необходимых для победы от 3 до 10, но не больше %d и не меньше %d", d, (d-1));
            System.out.println();
            dots_to_win = scanner.nextInt();
        } while (dots_to_win < 3 || dots_to_win > d);
        play(d);

    }
}

