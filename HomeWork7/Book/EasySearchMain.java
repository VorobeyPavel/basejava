package HomeWork7.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearchMain{
    public static void main(String[] args) {

        String filePath = "C:\\Users\\vorob\\Downloads\\Война и мир_книга.txt";
        String book=readAllBytesJava7( filePath );


        EasySearch easySearch = new EasySearch();
        System.out.println(easySearch.search(book,"мир"));

        EasySearch easySearch2=new EasySearch();
        System.out.println(easySearch2.search(book,"война"));

        EasySearch easySearch3=new EasySearch();
        System.out.println(easySearch3.search(book," и "));

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