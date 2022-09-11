import java.util.Scanner;

public class Assignment1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked whether prime or not");
        int number = sc.nextInt();
        sc.close();
        boolean flag = true;
        try {
            if (number < 0) {
                throw new Exception("java.lang.NegativeNumberNotAllowedException: Entered number can't be negative");
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    throw new Exception("java.lang.NumberNotPrimeException: Entered number is not prime");
                } else {
                    System.out.println("Entered number is prime number");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
