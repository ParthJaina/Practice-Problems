import java.util.Scanner;

class VowelConsonantCounter {
    public static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 65 && ch <= 90) {
            ch = (char) (ch + 32);
        }
        
        if (ch >= 97 && ch <= 122) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        int[] counts = countVowelsAndConsonants(text);
        
        System.out.println("Total Vowels: " + counts[0]);
        System.out.println("Total Consonants: " + counts[1]);
        
        sc.close();
    }
}
