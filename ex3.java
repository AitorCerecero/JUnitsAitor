public class ex3 {
    public String text;

    public boolean validateNums(String text){
        boolean containsNumbers = false;

        for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (Character.isDigit(c)) {
        containsNumbers = true;
        break;
        }
    }

    System.out.println("Es: "+containsNumbers); // true
    return containsNumbers;
  }
}
