public class Code14 {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);
    }
}
