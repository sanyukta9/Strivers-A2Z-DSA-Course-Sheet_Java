import java.util.Scanner;

public class IfElse {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        String str=null;
        if(a>b){
            str="greater";
        }
        else if(a==b){
            str="equal";
        }
        else
            str="smaller";
        return str;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(compareIfElse(a, b));
    }
}