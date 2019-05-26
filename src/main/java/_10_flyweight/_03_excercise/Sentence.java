package _10_flyweight._03_excercise;


import java.util.*;

class Sentence {

    private List<String> words = new ArrayList<>();
    private Map<Integer, WordToken> tokens = new HashMap<>();


    public Sentence(String plainText) {
        words.addAll(Arrays.asList(plainText.split("\\s+")));
    }

    public WordToken getWord(int index) {
        WordToken wordToken = new WordToken();
        tokens.put(index, wordToken);
        return wordToken;
    }

    @Override
    public String toString() {
        ArrayList<String> sentence = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (tokens.containsKey(i) && tokens.get(i).isCapitalize()) {
                word = word.toUpperCase();
            }
            sentence.add(word);
        }
        return String.join(" ", sentence);
    }
}