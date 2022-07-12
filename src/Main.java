import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("dictionary.txt");
        Scanner scanner = new Scanner(file);
        String word = "skl;";
        int ch = 0;
        while (scanner.hasNextLine()){
            if(word.equals(scanner.nextLine())){
                ch++;
            }
        }
        if (ch == 1){
            System.out.println(word);
        } else {
            System.out.println("no word");
        }

    }
}