public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {

        String allLowerCase = "";
        char charToAdd;

        for (int i = 0; i < str.length(); i++){
            if (96 < (int)str.charAt(i) && (int)str.charAt(i) < 123){
                charToAdd = str.charAt(i);
            }
            if (64 < (int)str.charAt(i) && (int)str.charAt(i) < 91){
                charToAdd = (char)((int)str.charAt(i)+32);
            }
            else {
                charToAdd = str.charAt(i);
            }
            allLowerCase += charToAdd;
        }
        return allLowerCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        if (str2.length() > str1.length()) {
            return false;
        }

        if (str2.length() == 0) {
            return true;
        }

        char firstLetter = str2.charAt(0);
        int counter = 0;

        for (int i = 0; i < str1.length(); i++){
            if (firstLetter == str1.charAt(i)){
                for (int j = 0; j < str2.length(); j++){
                    if (str1.charAt(i) != str2.charAt(j)){
                        break;
                    }
                    else {
                        counter++;
                    }
                    i++;
                }
            }
        }
        if (counter == str2.length()){
            return true;
        }
        return false;
    }
}
