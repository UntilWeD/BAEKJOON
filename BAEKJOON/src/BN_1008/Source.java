package BN_1008;

import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Double A=0d, B=0.0;

        Scanner sc = new Scanner(System.in);

        String input = sc.next() + sc.nextLine();

        String[] str  = input.split(" ");

        A = Double.parseDouble(str[0]);
        B = Double.parseDouble(str[1]);

        System.out.println(A +"/"+ B +" = "+ A/B);
    }
}
