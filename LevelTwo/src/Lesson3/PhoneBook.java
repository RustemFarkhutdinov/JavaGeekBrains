package Lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

public class PhoneBook {
    public static class Phonebook {

        private final Map<String, Set<String>> entries = new TreeMap<>();

        public void add(String surname, String phoneNumber) {
            Set<String> phones = getPhones(surname);
            phones.add(phoneNumber);
        }

        private Set<String> getPhones(String surname) {
//        return entries.getOrDefault(surname, new HashSet<>());
//        return entries.computeIfAbsent(surname, key -> new HashSet<>());
            return entries.computeIfAbsent(surname, new Function<String, Set<String>>() {
                @Override
                public Set<String> apply(String s) {
                    return new HashSet<>();
                }
            });
        }

        public Set<String> get(String surname) {
            return getPhones(surname);
        }

        public Set<String> getAllSurnames() {
            return entries.keySet();
        }

    }
}