import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeworkTwo {

    public static void main(String[] args) {

        int[] oldArray = ArrayGenerator();
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(ReplaceArray(oldArray))); // Task 1

        System.out.println(Arrays.toString(Task2())); // Task 2

        System.out.println(Arrays.toString(Task3())); // Task 3

        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       System.out.println("Maximum: " + findMax(mas)); // Task 4
       System.out.println("Minimum: " + findMin(mas)); // Task 4

        int side = 10;
        int[][] dArr = new int[side][side];
        crossFill(dArr);
        for ( int i = 0; i < dArr.length; i++){
            for (int f = 0; f < dArr[i].length; f++){
                System.out.print(dArr[i][f] + " "); // Task 5
            } System.out.println(" ");
        }


    }

    public static int[] ArrayGenerator() {
        int[] myArray = new int[10];
        int Random = 10;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * Random);
        } return  myArray;
    }

    public static int[] ReplaceArray(int[] newArray) {
        for (int i = 0; i < 10; i++) {
            if (newArray[i] == 0) {
                newArray[i] = 1;
            } else newArray[i] = 0;
        } return  newArray;
    }

    public static int[] Task2() {
        int[] myArray2 = new int[8];
        myArray2[0] = 1;
        for (int i = 1; i < myArray2.length; i++){
            myArray2[i] = i * 3 + 1;
        }
        return  myArray2;
    }

    public static int[] Task3() {
        int[] myArray3 = new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray3.length; i++){
            if (myArray3[i] < 6){
                myArray3[i] = myArray3[i] * 2;
            }
        } return  myArray3;
    }

    public static int findMax(int[] array) {
        Arrays.sort(array);
        return  array[array.length -1];
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
        if (array[i] < min)
            min = array[i];
    } return min;
    }


    private static void crossFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }
}
