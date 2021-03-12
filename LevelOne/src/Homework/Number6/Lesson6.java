package Homework.Number6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Lesson6 {
    public static final Random random = new Random();
    private static final int maxLength = 100;
    private static final int charBound1 = 65;
    private static final int charBound2 = 90;
    private static final int filesAmount = 4;
    private static final int wordsAmount = 5;
    private static final int wordsLength = 10;
    private static final String search = "find_me";

    private static FileOutputStream fos;
    private static FileInputStream fis;

    private static String generateSymbols(int amount){
       StringBuilder sequence = new StringBuilder();
       for(int i=0; i < amount; i++)
           sequence.append((char)(charBound1 + random.nextInt(charBound2 - charBound1)));
           return sequence.toString();
    }

    private static void writeFileContents(String fileName, int length) {
    try {
        fos = new FileOutputStream(fileName);
        fos.write(generateSymbols(length).getBytes());
        fos.flush();
        fos.close();
    } catch (IOException e){
        System.err.println(fileName + e.getCause());
     }
   }

   private static void writeFileContents( String fileName, int words, int length) {
       try {
           fos = new FileOutputStream(fileName);
           for (int i = 0; i < words; i++) {
               if (random.nextInt(wordsAmount) == wordsAmount / 2)
                   fos.write(search.getBytes());
               else
                   fos.write(generateSymbols(length).getBytes());
               fos.write(' ');
           }
           fos.flush();
           fos.close();
       } catch (IOException e) {
           System.err.println("Something Wrong" + fileName + "  Reason:" + e.getCause());
       }
   }


    private static void mergeFiles( String inputFile1, String inputFile2, String outputFile){
        try {
       fos = new FileOutputStream(outputFile);
       int ch;
       fis = new FileInputStream(inputFile1);
       while ((ch = fis.read()) != -1)
           fos.write(ch);
       fis.close();

       fis = new FileInputStream(inputFile2);
            while ((ch = fis.read()) != -1) {
            fos.write(ch);
   }
        fis.close();

        fos.flush();
        fos.close();
    } catch (IOException e){
        System.err.println("Something wrong." + e.getCause());
    }
}

    private static boolean searchInFile(String fileName, String search) throws  IOException {
        fis = new FileInputStream(fileName);
        byte[] searchSequence = search.getBytes();
        int ch;
        int i = 0;
        while ((ch = fis.read()) != -1) {
            if (ch == searchSequence[i]) {
                i++;
            } else {
                i = 0;
                if (ch == searchSequence[i]) {
                    i++;
                }
            }
            if (i == searchSequence.length) {
                fis.close();
                return true;
            }
        }
        fis.close();
        return false;
    }



    public static void main(String[] args) {

    String[] fileNames = new String[filesAmount];
        for(int i = 0; i < fileNames.length; i++)
            fileNames[i] = "File" + i + ".txt";

            for(int i = 0; i < fileNames.length; i++)
                if(i < 2)
                    writeFileContents(fileNames[i], maxLength);
                else
                    writeFileContents(fileNames[i], wordsAmount, wordsLength);
                System.out.println("Result work task number one in tje file: file0 and file2.");

        mergeFiles(fileNames[0], fileNames[1], "FileOut.txt");
        System.out.println("connection result in the: FileOut.txt");

        try{
            System.out.println("If the match is in the file2? " + searchInFile(fileNames[2], search));
        } catch (IOException ex){
        throw new RuntimeException(ex);
    }
 }
}