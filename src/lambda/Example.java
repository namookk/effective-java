package lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> words = List.of("사과", "배");

        //익명 함수
        Collections.sort(words, new Comparator<>() {
            public int compare(String s1, String s2){
                return Integer.compare(s1.length(), s2.length());
            }
        });

        //람다
        Collections.sort(words, Comparator.comparingInt(s -> s.length()));
        //메서드 참조
        Collections.sort(words, Comparator.comparingInt(String::length));
        words.sort(Comparator.comparingInt(String::length));
    }
}
