public class Assignment1_1 {
    public static void main(String[] args) {
        int num1 = 4, num2 = 0;
        int[] array = new int[4];
        String string = null;
        try {
            array[4] = 23;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
        try {
            System.out.println(string.equals("string"));
        } catch (NullPointerException exception) {
            System.out.println(exception);
        }
        try {
            System.out.println(num1 % num2);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }
    }
}
