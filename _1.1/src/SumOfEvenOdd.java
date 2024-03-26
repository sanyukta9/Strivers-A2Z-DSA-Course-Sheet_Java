import java.util.Scanner;
public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int even=0;
        int odd=0;

        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                even= even+rem;
            }
            else{
                odd= odd+rem;
            }
            n=n/10;
        }
        System.out.println(even+"\t"+odd);
    }
}
