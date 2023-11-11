import java.util.ArrayList;
import java.util.List;

public class ex4 {
    public String texto;

    public List<Character> eval(String texto){
        List<Character> uppercaseCharacters = new ArrayList<>();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isUpperCase(c)) {
                uppercaseCharacters.add(c);
            }
        }

        if (uppercaseCharacters.isEmpty()) {
            System.out.println("No tiene mayúsculas");
        } else {
            System.out.println("Tiene " + uppercaseCharacters); // [H, L, M, U]
        }
        return uppercaseCharacters;
    }
}
