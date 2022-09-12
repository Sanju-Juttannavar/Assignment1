/* 
Write a Java program to generate and handle any three built-in 
exceptions and display appropriate error messages.
*/


public class Assignment1_1 {
    public static void main(String[] args) {
        int num1 = 4, num2 = 0;
        int[] array = new int[4];
        String string = null;

        // handling the ArrayIndexOutOfBoundsException
        try {
            array[4] = 23;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }

        // handling the NullPointerException
        try {
            System.out.println(string.equals("string"));
        } catch (NullPointerException exception) {
            System.out.println(exception);
        }

        // handling the AirthmeticException
        try {
            System.out.println(num1 % num2);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }
    }
}
