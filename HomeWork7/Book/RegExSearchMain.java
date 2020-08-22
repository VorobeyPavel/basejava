package HomeWork7.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RegExSearchMain {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\vorob\\Downloads\\Война и мир_книга.txt";
        String book=readAllBytesJava7( filePath );

        List<String> list = new ArrayList<>();
        list.add(book);

        RegExSearch exSearch=new RegExSearch();
        System.out.println(exSearch.search(book, "[В?в?]{1}ойна"));

        RegExSearch exSearch2=new RegExSearch();
        System.out.println(exSearch2.search(book, "[М?м?]{1}ир"));

        RegExSearch exSearch3=new RegExSearch();
        System.out.println(exSearch3.search(book, "[И?и?]{1}"));
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
}
