package ru.croc.school;

import java.util.HashMap;
import java.util.Map;

public class WordsInTheText {
    /**
     * Строка.
     */
    private String string;
    /**
     * Слова в строке.
     */
    Map<String, Integer> words=new HashMap<>();

    /**
     * Конструктор.
     *
     * @param string строка
     */
    public WordsInTheText(String string) {
        this.string = string;
    }

    /**
     * Получение строки.
     *
     * @return строка
     */
    public String getString() {
        return string;
    }

    /**
     * Получение слов и их количества.
     *
     * @return слова и их количество
     */
    public Map<String, Integer> getWords() {
        return words;
    }

    /**
     * Удааление всех знаков препинаний, цифр вне слова, лишних пробелов и понижение всех букв.
     */
    public void cleanString(){
        string=string.replaceAll("[\\p{P}][^\\p{L}-\\p{L}]"," ");
        string=string.replaceAll(" [\\d]+ "," ");
        string=string.replaceAll(" +"," ");
        string=string.toLowerCase();
    }

    /**
     * Получение количества каждого слова.
     */
    public void counting(){
        String[] strings=string.split(" ");
        for (String s:strings) {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }
    }
}
