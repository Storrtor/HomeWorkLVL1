package HomeWork2;



public class HomeWork2 {
    public static void main(String[] args) {

//        System.out.println(isSumBetweenTenAndTwenty(15,5));
//        isNumbPositive(0);
//        isNumbPositive(-10);
//        isNumbPositive(200);
//        System.out.println(isNumbNegativeBool(-5));
//        printString("Hello", 5);
        isMonthColdOrWarm(MonthEnums.JANUARY);
        isMonthColdOrWarm(MonthEnums.APRIL);
        isMonthColdOrWarm(MonthEnums.JULY);
        isMonthColdOrWarm(MonthEnums.SEPTEMBER);


//        System.out.println(isYearLeap(1));
//        System.out.println(isYearLeap(4));
//        System.out.println(isYearLeap(100));
//        System.out.println(isYearLeap(400));
//        System.out.println(isYearLeap(1600));
//        System.out.println(isYearLeap(2021));
//        System.out.println(isYearLeap(2012));
//        System.out.println(isYearLeap(2015));
//        System.out.println(isYearLeap(2016));
//        System.out.println(isYearLeap(2028));
//        System.out.println(isYearLeap(2100));

    }


    public static boolean isSumBetweenTenAndTwenty(int a, int b) {
        int sum =  a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
    }

    public static void isNumbPositive(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNumbNegativeBool(int a){
        if(a < 0){
            return a < 0;
        } else {
            return false;
        }
    }

    public static void printString(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isYearLeap(int year) {

        if (year %4 == 0 && year %100 != 0) {
            return true;
        } else if (year %4 == 0 && year %400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void isMonthColdOrWarm(MonthEnums enums) {
        switch (enums) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY: {
                System.out.println("Cold");
                break;
            }
            case MARCH:
            case APRIL:
            case MAY: {
                System.out.println("Warm");
                break;
            }
            case JUNE:
            case JULY:
            case AUGUST: {
                System.out.println("Hot");
                break;
            }
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER: {
                System.out.println("Cool");
            }
        }
    }
}
