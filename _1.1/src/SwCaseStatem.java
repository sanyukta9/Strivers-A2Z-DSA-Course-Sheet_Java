import java.util.Scanner;

public class SwCaseStatem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double[] a = new double[2];
        for (int i = 0; i < ch; i++)
            a[i] = sc.nextDouble();

        System.out.println(areaSwitchCase(ch, a));
    }

    public static double areaSwitchCase(int ch, double[] a) {
        switch (ch) {
            // for circle
            case 1:
                return ((Math.PI) * (Math.pow(a[0], 2)));
            //for rectangle
            case 2:
                return (a[0] * a[1]);
            default:
                return -1;
        }
    }
}
