/*
Data type refers to the type of value a variable has and the way the computer interprets it.
Each data type has a different size. You’ve studied 5 different data types and the sizes of
the data types:
Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte
 */
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