import java.util.Scanner;


public class input {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

     int a =10,b=2,c;

     System.out.println("Enter a number: ");
     a= scanner.nextInt();

     System.out.println("Enter b number: ");
     b=scanner.nextInt();

     a++;
     b--;

     c=a+b;

     System.out.println(c);
    }
    
}
