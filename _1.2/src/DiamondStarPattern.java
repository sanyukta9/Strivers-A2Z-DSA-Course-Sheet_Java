import java.util.Scanner;
public class DiamondStarPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        nStarTriangle(n);
    }

    public static void nStarTriangle(int n){
        //for Star Pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        //for inverted star pyramid
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
