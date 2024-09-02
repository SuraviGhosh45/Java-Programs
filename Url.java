import java.util.Scanner;

public class Url {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter url: ");
        String str=sc.next();
        if(str.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(str.endsWith(".org")){
            System.out.println("Organization Website");
        }
        else if(str.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("other");
        }
    }
}
