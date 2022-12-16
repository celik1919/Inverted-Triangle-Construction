import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = mec.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int r = 1; r <= i; r++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*(n-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}