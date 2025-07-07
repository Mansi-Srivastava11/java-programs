public class recursionPalindrome {
    static boolean isPalindrome(String str){
        int size = str.length();
        //size of string
        if(size<=1){
            return true;
        }
        // if above statement is false then it execute next line.
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(size-1);
        if(firstChar!=lastChar){
            return false;
        }
        // If above if is false then executes remaining number of characters in next lines.
        String remainStr = str.substring(1,size-1);
        return isPalindrome(remainStr);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("naman"));
        System.out.println(isPalindrome("Shraddha"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Ajitesh"));
    }
}
