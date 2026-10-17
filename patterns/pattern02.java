package patterns;
import java.util.Scanner;
public class pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {

            System.out.print("*");
        }
        System.out.println();
        sc.close();
      }
}
}
