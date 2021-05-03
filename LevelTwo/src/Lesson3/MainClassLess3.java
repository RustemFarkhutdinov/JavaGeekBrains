package Lesson3;

import java.util.*;
import java.util.function.Function;

public class MainClassLess3 {

    private static final String words =
            "Fluffy cat, fluffy cat" +
                    "Stay here, on my bed! " +
                    "I am alone at home " +
                    "And you are sweet and warm! ";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.merge(s, 1, Integer::sum);

        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        PhoneBook.Phonebook phonebook = new PhoneBook.Phonebook();
        phonebook.add("Rustem", "Rustem 555555");
        phonebook.add("Petrov", "No phone");
        phonebook.add("Ivanov", "8880009");
        phonebook.add("Ivanov", "No phone number");
        phonebook.add("Ivan", "ivan 8-987-266");

        System.out.println("phone Ivan: " + phonebook.get("Ivan"));
        System.out.println("phone Rustem: " + phonebook.get("Rustem"));
    }
}
