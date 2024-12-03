public class ArrCharOps {
public static void main(String[] args) {
    System.out.println(ArrCharOps.compareTo("abc", "abc"));
}

 public static int compareTo(String str1, String str2) {

        if (str1 == null || str2 == null){
            return -2;
        }

        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++){
            if (str1.charAt(i) > str2.charAt(i)){
                return 1;
            }
            if (str2.charAt(i) > str1.charAt(i)){
                return -1;
            }
        }

        if (str1.length() < str2.length()){
            return -1;
        } 
        if (str1.length() > str2.length()){
            return 1;
        }

        return 0;
    }

public static char charAt(char[] arr1, int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'charAt'");
}

public static int indexOf(char[] arr1, char c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
}

public static int lastIndexOf(char[] arr1, char c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
}

public static int indexOf(char[] arr1, char c, int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
}

public static boolean equals(char[] arr1, char[] arr12) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'equals'");
}

public static char[] concat(char[] arr1, char[] arr3) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'concat'");
}

public static char[] subArray(char[] arr1, int i, int j) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subArray'");
}

public static long hashCode(char[] arr2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hashCode'");
}


   