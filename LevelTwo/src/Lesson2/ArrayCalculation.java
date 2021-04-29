package Lesson2;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayCalculation {

    private String[][] arrayData;
    private int arraySizeOne;
    private int arraySizeTwo;

    String[] number = {"zero",  " ", "one", "two",  "авыаы", "three", "four", "five", "six", "42ав"};

    public ArrayCalculation(int arraySizeOne, int arraySizeTwo) {
        this.arraySizeOne = arraySizeOne;
        this.arraySizeTwo = arraySizeTwo;
        this.arrayData = new String[arraySizeOne][arraySizeTwo];
        System.out.println("creating an array");
    }



//    public void ArrayCalculation1() {
//        for (int i = 0; i < arrayData.length; i++) {//идём по строкам
//            for (int j = 0; j < arrayData.length; j++) {//идём по столбцам
//                arrayData[i][j] = number[(int) (Math.random() * 10)];
//            }
//            System.out.println();
//        } System.out.println(Arrays.deepToString(arrayData));
//    }


    public static int calculation(String[][] arrayData){
        if (arrayData.length !=4) throw  new MyArraySizeExcception("Need 4x4 array only!");
        int sum = 0;
        for (int i = 0; i < arrayData.length; i++) {
           if(arrayData[0].length != 4) throw  new MyArraySizeExcception("Need 4x4 array only!");
            for (int j = 0; j < arrayData[i].length; j++) {
                try {
                    sum += Integer.parseInt(arrayData[i][j]);
                } catch (NumberFormatException e) {
                    throw  new MyArrayDataExcception(String.format("Need 4x4 array only!", j + 1, i + 1));
                }
            }
        }
        System.out.println("Sun is " + sum);
        return sum;
    }
//    public int getArraySizeOne(int number1) {
//        return arraySizeOne;
//    }
//
//    public int getArraySizeTwo(int number2) {
//        return arraySizeOne;
//    }
}
