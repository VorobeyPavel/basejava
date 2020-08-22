package HomeWork7.Book;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{

    @Override
    public int search(String book, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(book);
        int result = 0;
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}
