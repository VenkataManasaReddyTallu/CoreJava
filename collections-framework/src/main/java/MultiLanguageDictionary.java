import java.util.*;

public class MultiLanguageDictionary {
    static class Dictionary<T extends Comparable<T>> {
        TreeMap<String, T> dictionary = new TreeMap<>();

        void addWord(String word, T translation) {
            dictionary.put(word, translation);
        }

        void displayWords() {
            dictionary.forEach((word, translation) -> System.out.println(word + ": " + translation));
        }
    }

    public static void main(String[] args) {
        Dictionary<String> englishDictionary = new Dictionary<>();
        englishDictionary.addWord("Hello", "Hola");
        englishDictionary.addWord("Goodbye", "Adiós");

        englishDictionary.displayWords();
    }
}
