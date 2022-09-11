import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Assignment1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1;
        System.out.println("Enter the data to be entered to the file");
        String data = sc.nextLine();

        File f1 = new File("d:/java/Alphabets.txt");

        try {
            f1.createNewFile();
            FileOutputStream fout = new FileOutputStream(f1);

            for (int i = 0; i < data.length(); i++) {
                fout.write(data.charAt(i));
            }
            fout.close();
            File f2 = new File("d:/java/Consonants.txt");
            f2.createNewFile();
            FileOutputStream fout2 = new FileOutputStream(f2);

            FileInputStream fin = new FileInputStream(f1);

            while ((var1 = fin.read()) != -1) {
                try {
                    char var2 = (char) var1;

                    switch (var2) {
                        case 'a':
                        case 'A':
                        case 'e':
                        case 'E':
                        case 'i':
                        case 'I':
                        case 'o':
                        case 'O':
                        case 'u':
                        case 'U':
                            throw new Exception("java.lang.VowelNotAllowedException: vowels are not allowed");

                        default:
                            fout2.write(var2);
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            fin.close();
            fout2.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
