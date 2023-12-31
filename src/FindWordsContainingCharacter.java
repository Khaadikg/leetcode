import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {

    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                out.add(i);
            }
        }
        return out;
    }
}
