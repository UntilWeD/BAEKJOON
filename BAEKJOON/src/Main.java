import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double A=0d, B=0d;

        Scanner sc = new Scanner(System.in);

        String input = sc.next() + sc.nextLine();

        String[] str  = input.split(" ");

        A = Double.parseDouble(str[0]);
        B = Double.parseDouble(str[1]);

        System.out.printf("%.9f",A/B);
    }
}