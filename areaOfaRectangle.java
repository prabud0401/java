import java.util.Scanner;

public class areaOfaRectangle {
    
    public static void main(String[] args) {

        float length , width, area;

        // Use the Scanner class for input
        Scanner scanner=new Scanner(System.in);

        // Define variables for length and width.
        System.out.println("Let's calculate the are of a Rectangle");

        System.out.println("Enter the length: ");
        length=scanner.nextFloat();

        System.out.println("Enter the width: ");
        width=scanner.nextFloat();

        // Implement a method to calculate and display the area.
        area=length+width;

        System.out.println("The are of this rectangle is: "+area);
    }
}
