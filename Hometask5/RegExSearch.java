package Hometask5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        text = " " + text + " ";
        text = text.replaceAll("[,.!?\"()1234567890=+>^]", " ");
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        char[] allchars = text.toCharArray();
        while (matcher.find()) {
            if (allchars[matcher.end()] == ' ' && allchars[matcher.start() - 1] == ' ') {
                count++;
            }
        }
        return count;
    }
}
