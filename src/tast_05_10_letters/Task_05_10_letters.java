package tast_05_10_letters;

import java.util.HashMap;
import java.util.Map;
/*Задание
В тексте посчитать сколько раз встречается каждая буква.
(Подсказка. Воспользуйтесь конструкцией Map<Character, Integer>)*/

public class Task_05_10_letters {
    public static void main(String[] args) {
        String text = "Hello people!";
        getLetterCount(text);
    }

    public static void getLetterCount(String text) {
        char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) Character.toLowerCase(ch[i]);
        }
        Map<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < ch.length; ++i) {
            letterCount.put(ch[i], letterCount.getOrDefault(ch[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}

