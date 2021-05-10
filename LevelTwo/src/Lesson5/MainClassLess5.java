package Lesson5;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class MainClassLess5 {

    static final int size = 10000000;
    static final int halfSize = size / 2;

    public static void main(String[] args) {

        float[] dataOne = createArray(size);
        measureTime(() -> sequentialMethod(dataOne), "sequentialMethod");


        float[] dataTwo = createArray(size);
        measureTime(() -> parallelMethod(dataTwo), "parallelMethod");
        System.out.println("Arrays are equal: " + Arrays.equals(dataOne, dataTwo));
    }

    private static void sequentialMethod(float[] data) {
        sequentialMethod(data, 0);
    }

    private static void sequentialMethod(float[] data, int offset) {
         for (int index = 0; index < data.length; index++) {
             float currentValue = data[index];
             data[index] = computeValue(index + offset, currentValue);
         }

    }

    private static void parallelMethod(float[] data) {
        float[] partOne = Arrays.copyOfRange(data, 0, halfSize);
        float[] partTwo = Arrays.copyOfRange(data, halfSize, data.length);

        Thread threadOne = new Thread(() -> sequentialMethod(partOne, 0));
        Thread threadTwo = new Thread(() -> sequentialMethod(partTwo, halfSize));

        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            System.out.println("FAILED");
            e.printStackTrace();
            return;
        }
        System.arraycopy(partOne, 0, data, 0, halfSize);
        System.arraycopy(partTwo, 0, data, halfSize, halfSize);
    }


        private static float[]  createArray(int size) {
            float[] data = new float[size];
            Arrays.fill(data, 1.0f);
            return data;
        }

        private static float computeValue(int index, float currentValue) {
        return (float)(currentValue * Math.sin(0.2f + index / 5)*Math.cos(0.2f + index / 5)*Math.cos(0.4f + index / 2));
    }

    private static void measureTime(Runnable action, String actionName) {
        long start = System.nanoTime();
        action.run();
        long finish = System.nanoTime();
        long duration = finish - start;
        System.out.printf("Method '%s' took %d ms%n", actionName, TimeUnit.NANOSECONDS.toMillis(duration));
    }
}
//
//            // 1) Создают одномерный длинный массив, например:
//
//            float[] arr = new float[size];
//            // 2) Заполняют этот массив единицами;
//// 3) Засекают время выполнения:
//            long a = System.currentTimeMillis();
//// 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//            arr[i]=(float)(arr[i]*Math.sin(0.2f+i /5)*Math.cos(0.2f+i /5)*Math.cos(0.4f+i /2));
//// 5) Проверяется время окончания метода
//        System.currentTimeMillis();
//// 6) В консоль выводится время работы:
//        System.out.println(System.currentTimeMillis()-a);
//
//        for(
//            int i = 0;
//            i<size;i++)
//
//            {
//                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//            }
////Пример деления одного массива на два:
////System.arraycopy(arr, 0, a1, 0, h);
////System.arraycopy(arr, h, a2, 0, h);
////Пример обратной склейки:
////System.arraycopy(a1, 0, arr, 0, h);
////System.arraycopy(a2, 0, arr, h, h);
//        }
//    }
//        public static class PhonebookTwo {
//         }

