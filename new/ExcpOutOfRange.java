import java.util.Scanner;
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}
public class ExcpOutOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (in between 10 and 50): ");
        int number = sc.nextInt();
        sc.close();
        try {
            if (number < 10 || number > 50)
                throw new OutOfRangeException("Number is out of range (less than 10 or greater than 50)");
            System.out.println("Square of " + number + " is: " + number * number);
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
