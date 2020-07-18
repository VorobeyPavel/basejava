package HomeWork4;

import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число колец, не менее 3: ");
        int i=sc.nextInt();

        if (i<3){
            System.out.println("Количество колец должно быть не менее 3");
            return;
        }
        int column=3;
        int [][] list=new int[i][column];
        for (i=0; i<list.length; i++){
            list[i][0]=i+1;
        }
        printList(list);

        for (;!checkEndGame(list);) {
            Scanner scan = new Scanner(System.in);
            int operation = scan.nextInt();
            switch (operation) {
                case 1:
                    Scan1(list);
                    break;
                case 2:
                    Scan2(list);
                    break;
                case 3:
                    Scan3(list);
                    break;
                case 4:
                    Scan4(list);
                    break;
                case 5:
                    Scan5(list);
                    break;
                case 6:
                    Scan6(list);
                    break;
            }
            printList(list);
        }
    }

    public static boolean checkEndGame(int[][]list){
        for (int i = 0; i <list.length; i++) {
            if (list[i][list.length-1]==0){
                System.out.println("Для перемещения колец используйте цифры:"+"\n"+
                        "1-(1->>2), 2-(1->>3), 3-(2->>1), 4-(2->>3), 5-(3->>1), 6-(3->>2)");
                return false;
            }
        }
        return true;
    }


    public static void printList(int[][]list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------");
    }

    public static void Scan1(int[][]list) {
        for (int i = 0; i < list.length; i++) {
            int j = 0;
            int k = 1;
            for (int n = list.length - 1; n >= 0; n--) {
                if (list[i][j]==0)
                    continue;
                if (list[n][k] == 0 && list[i][j]>0){
                    list[n][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] > list[i][j] && list[n-1][k]==0) {
                    list[n-1][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] < list[i][j]){
                    System.out.println("Данный ход невозможен");
                    return;
                }
            }
        }
    }

    public static void Scan2(int[][]list) {
        for (int i = 0; i < list.length; i++) {
            int j = 0;
            int k = 2;
            for (int n = list.length - 1; n >= 0; n--) {
                if (list[i][j]==0)
                    continue;
                if (list[n][k] == 0) {
                    list[n][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] > list[i][j] && list[n-1][k]==0) {
                    list[n-1][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] < list[i][j]){
                    System.out.println("Данный ход невозможен");
                    return;
                }
            }
        }
    }

    public static void Scan3(int[][]list) {
        for (int i = 0; i < list.length; i++) {
            int j = 1;
            int k = 0;
            for (int n = list.length - 1; n >= 0; n--) {
                if (list[i][j]==0)
                    continue;
                if (list[n][k] == 0) {
                    list[n][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] > list[i][j] && list[n-1][k]==0) {
                    list[n-1][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] < list[i][j]){
                    System.out.println("Данный ход невозможен");
                    return;
                }
            }
        }
    }

    public static void Scan4(int[][]list) {
        for (int i = 0; i < list.length; i++) {
            int j = 1;
            int k = 2;
            for (int n = list.length - 1; n >= 0; n--) {
                if (list[i][j]==0)
                    continue;
                if (list[n][k] == 0) {
                    list[n][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] > list[i][j] && list[n-1][k]==0) {
                    list[n-1][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] < list[i][j]){
                    System.out.println("Данный ход невозможен");
                    return;
                }
            }
        }
    }

    public static void Scan5(int[][]list) {
        for (int i = 0; i < list.length; i++) {
            int j = 2;
            int k = 0;
            for (int n = list.length - 1; n >= 0; n--) {
                if (list[i][j]==0)
                    continue;
                if (list[n][k] == 0) {
                    list[n][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] > list[i][j] && list[n-1][k]==0) {
                    list[n-1][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] < list[i][j]){
                    System.out.println("Данный ход невозможен");
                    return;
                }
            }
        }
    }

    public static void Scan6(int[][]list) {
        for (int i = 0; i < list.length; i++) {
            int j = 2;
            int k = 1;
            for (int n = list.length - 1; n >= 0; n--) {
                if (list[i][j]==0)
                    continue;
                if (list[n][k] == 0) {
                    list[n][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] > list[i][j] && list[n-1][k]==0) {
                    list[n-1][k] = list[i][j];
                    list[i][j] = 0;
                    return;
                }
                if (list[n][k] != 0 && list[n][k] < list[i][j]){
                    System.out.println("Данный ход невозможен");
                    return;
                }
            }
        }
    }
}
