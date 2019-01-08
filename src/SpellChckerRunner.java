import java.io.FileNotFoundException;

public class SpellChckerRunner {

    public static void main(String[] args) {
        try {
            SpellChecker sc = new SpellChecker();
            sc.Readwordlist("words", "user.txt");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
