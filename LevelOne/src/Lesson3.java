import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static char[][] map;
    public static final int SIZE = 3;

    public static final int sizeX = 3;
    public static final int sizeY = 3;

    public static final char emptyChar = '_';
    public static final char playerChar = 'X';
    public static final char aiChar = 'O';

    // public static final int randomStep = (int) (Math.random() * map.length);
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int f = 0; f < map[i].length; f++) {
                map[i][f] = emptyChar;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int f = 0; f < map[i].length; f++) {
                System.out.print("| " + map[i][f] + " | "); // Task 5
            }
            System.out.println(" ");
        }
        System.out.println("----------------------");
    }

    public static void stepAI() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isMap(x, y) && !isValidCell(x, y));
        map[x][y] = aiChar;
    }

    public static void stepHuman() {
        int x;
        int y;
        do {
            System.out.println("Enter coordinates ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isMap(x, y) && !isValidCell(x, y));
        map[x][y] = playerChar;
    }

    public static boolean checkWin(char playerChar) {
        if (map[0][0] == playerChar && map[0][1] == playerChar && map[0][2] == playerChar) return true;
        if (map[1][0] == playerChar && map[1][1] == playerChar && map[1][2] == playerChar) return true;
        if (map[2][0] == playerChar && map[2][1] == playerChar && map[2][2] == playerChar) return true;

        if (map[0][0] == playerChar && map[1][0] == playerChar && map[2][0] == playerChar) return true;
        if (map[0][1] == playerChar && map[1][1] == playerChar && map[2][1] == playerChar) return true;
        if (map[0][2] == playerChar && map[1][2] == playerChar && map[2][2] == playerChar) return true;

        if (map[0][0] == playerChar && map[1][1] == playerChar && map[2][2] == playerChar) return true;
        if (map[2][0] == playerChar && map[1][1] == playerChar && map[0][2] == playerChar) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int f = 0; f < SIZE; f++) {
                if (map[i][f] == emptyChar) {
                    return false;
                }
            }
        }
        return true;
    }

        public static boolean isValidCell ( int x, int y){
            return map[x][y] == emptyChar;
        }

        public static boolean isMap ( int x, int y){
            return (x >= 0 && x < SIZE && y >= 0 && y < SIZE);
        }


        public static void main (String[]args){

            initMap();
            printMap();

            while (true) {
                stepHuman();
                if (checkWin(playerChar)) {
                    System.out.println("You WIN!!!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Map it FULL!!!");
                    break;
                }
                printMap();

                stepAI();
                if (checkWin(aiChar)) {
                    System.out.println("AI WIN!!!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Map it FULL!!!");
                    break;
                }

                printMap();
            }

//            for( boolean x = true; x != isMapFull();) {
//                printMap();
//                stepHuman();
//                if (checkWin(playerChar)){
//                  System.out.println("You WIN!!!");
//                  break;
//                 }
//                printMap();
//                stepAI();
//                if (checkWin(aiChar)){
//                 System.out.println("AI WIN!!!");
//                    break;
//                 }
//            }  System.out.println("Map it FULL!!!");

        }
    }
