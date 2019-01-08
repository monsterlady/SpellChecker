import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpellChecker {

    public void Readwordlist(String filename,String usertext) throws FileNotFoundException {
        PrintWriter mistakes = new PrintWriter("mistakes.txt");
        Scanner scannerOne = new Scanner(new File(usertext));
        mistakes.println("List of incorrect words:");
        while (scannerOne.hasNext()) {
            String wordToCheck = scannerOne.next().trim().toLowerCase().replaceAll("[^a-zA-Z]", "");
            boolean correct = false;
            Scanner scannerTwo = new Scanner(new File(filename));
            while (scannerTwo.hasNext()) {
                String wordToCompare = scannerTwo.next().trim().toLowerCase().replaceAll("[^a-zA-Z]", "");
                if (wordToCheck.equals(wordToCompare)) {
                    correct = true;
                }
            }
            scannerTwo.close();

            if (!correct) {
                mistakes.println(wordToCheck);
            }
        }
        System.out.println("Spell check is complete!");
        scannerOne.close();
        mistakes.close();
    }
    }


