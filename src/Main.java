import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        String[][] list = new String[7][4];

        for (int i = 0; i < list.length; i++) {
            for (int x = 0; x < list[i].length; x++) {
                if (i == 0 || i==3 || i==6) {
                    list[i][x] = "*  ";
                }
                if (i == 1 || i==2 || i==4 || i==5) {
                    if (x == 0 || x == 3) {
                        list[i][x] = "*  ";
                    } else {
                        list[i][x]="   ";
                    }
                }
            }
        }
        for (String[] a:list){
            for (String b: a){
                System.out.print(b);
            }
            System.out.println();
        }


    }
}
