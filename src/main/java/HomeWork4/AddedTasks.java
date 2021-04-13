package HomeWork4;

public class AddedTasks {
    public static void main(String[] args) {

        numInARow(new int[]{1,1,3,1,1,1,1,1,5,4,1,1,1,1,1,1,1,7});
        numInARow(new int[]{1,1,1,4});



    }

    public static void numInARow(int[] array){
        int count = 1;
        int countRem = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i+1]){
                count++;
            } else {
                if(count > countRem){
                    countRem = count;
                    count = 1;
                } else {
                    count = 1;
                }
            }

        }
        System.out.println(countRem);
    }
}
