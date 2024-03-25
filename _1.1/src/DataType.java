import java.util.Scanner;
public class DataType {
    public static int dataTypes(String type) {
        // Write your code here
        int bytes=0;
        switch(type){
            case "Integer":
                bytes=4;
                break;
            case "Float":
                bytes=4;
                break;
            case "Long":
                bytes=8;
                break;
            case "Double":
                bytes=8;
                break;
            default:
                bytes=1;
        }
        return bytes;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dataType=sc.nextLine();
        System.out.println(dataTypes(dataType));
    }
}