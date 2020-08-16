package HomeWork7.Person_and_Animal;

import java.util.Random;

public class Animal {

    private String nick=(String)(random(15));
    private int age=1+(int)(Math.random()*15);

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
