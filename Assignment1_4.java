import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assignment1_4 {
    public static void main(String[] args) {
        try {
            BufferedReader reader=new BufferedReader(new FileReader("Alphabets.txt"));
                        
        } catch (FileNotFoundException e) {
           System.out.println(e);
        }
        
    }
}
