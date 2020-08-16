package HomeWork7.Person_and_Animal;

import obj.dto.Man;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomString {
    static String random (int stringLength) {
        String s = "ЁЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮQWERTYUIOPLKJHGFDSAMNBVCXZёйцукенгшщзхъэждлорпавыфячсмитьбюqwertyuioplkjhgfdsamnbvcxz ";
        StringBuilder builder = new StringBuilder();
        char[] array = s.toCharArray();

        for (int i = 0; i < stringLength; i++) {
            int a = (int) (Math.random() * s.length());
            builder.append(array[a]);
        }
        return builder.toString();
    }
}
