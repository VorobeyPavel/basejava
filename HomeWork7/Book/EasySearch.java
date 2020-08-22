package HomeWork7.Book;

public class EasySearch implements ISearchEngine{

    @Override
    public int search(String book, String word) {
        word=word.toLowerCase();
        int idx2 = book.indexOf(word);
        int result=0;
        while (idx2 != -1) {
            idx2 = book.indexOf(word, idx2 + 1);
            result++;
        }
        return result;
    }
}