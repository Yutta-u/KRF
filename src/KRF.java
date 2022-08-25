import java.util.Scanner;

public class KRF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();
        int R = scan.nextInt();
        int F = scan.nextInt();

        int k = 3;
        int r = k + 2;
        int f = r + 7;

        int sum1 = K * k;
        int sum2 = R * r;
        int sum3 = F * f;

        int allsum = sum1 + sum2 + sum3;

        System.out.println(allsum);

    }
}
