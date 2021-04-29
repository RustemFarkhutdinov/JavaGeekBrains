package Lesson2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassLesson2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        ArrayCalculation creatingArray = new ArrayCalculation(number1, number2);

      String[][] arr1 = new String[][]{
              {"2", "2", "2", "2", },
              {"2", "3", "0", "1", },
              {"#", "2", "1", "2", },
              {"fds", "21", "2", "2", }
      };
try {
    ArrayCalculation.calculation(arr1);
} catch (MyArrayDataExcception e){
    e.printStackTrace();
} catch (MyArraySizeExcception e){
    }
}
}
