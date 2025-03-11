public class Code26 {
    public static void main(String[] args) {
        char ch = '5';
        if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else if (Character.isLetter(ch)) {
            System.out.println("Letter");
        } else {
            System.out.println("Special character");
        }
    }
}
