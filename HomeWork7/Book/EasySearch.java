package HomeWork7.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EasySearch implements ISearchEngine{
    public static void main(String[] args) {

        String filePath = "C:\\Users\\vorob\\Downloads\\Война и мир_книга.txt";

        String book=readAllBytesJava7( filePath );


        EasySearch Search=new EasySearch();
        System.out.println(Search.search(book,"мир"));

        EasySearch Search2=new EasySearch();
        System.out.println(Search2.search(book,"война"));

        EasySearch Search3=new EasySearch();
        System.out.println(Search3.search(book," и "));

    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

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