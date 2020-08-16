package HomeWork7.Person_and_Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Person {

    private String nick=(String)(random(15));
    private int password=10000+(int)(Math.random()*10000);


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    static String random (int stringLength){

        String s = "ЁЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮQWERTYUIOPLKJHGFDSAMNBVCXZёйцукенгшщзхъэждлорпавыфячсмитьбюqwertyuioplkjhgfdsamnbvcxz ";
        StringBuilder builder=new StringBuilder();
        char [] array= s.toCharArray();

        for (int i = 0; i < stringLength; i++) {
            int a =(int) (Math.random()*s.length());
            builder.append(array[a]);
        }
        return builder.toString();
    }
}
