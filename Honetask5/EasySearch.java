package Honetask5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        text = text + " ";
        long result = 0;
        String wordcopy = "";
        boolean flag = true;
        for (int i = 0; i < word.length(); i++){
            wordcopy += String.valueOf(i);
        }
        text = text.replaceAll("[,.!?\"()1234567890=+>^]", " ");
        char[] allchars = text.toCharArray();
        if (text.indexOf(word) == 0 && allchars[text.indexOf(word) + word.length()] == ' '){
            result++;
            text = text.replaceFirst(word, wordcopy);
        }
        while (flag){
            if (allchars[text.indexOf(word) + word.length()] != ' ' ||
                    allchars[text.indexOf(word) -1 ] != ' '){
                text = text.replaceFirst(word, wordcopy);
            }
            if (text.indexOf(word) > 0 && allchars[text.indexOf(word) + word.length()] == ' '&&
                    allchars[text.indexOf(word) -1 ] == ' ') {
                result++;
                text = text.replaceFirst(word, wordcopy);
            }
            if (!text.contains(word)){
                flag = false;
            }
        }
        return result;
    }
}
