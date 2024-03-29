/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String newst = "";
        int ascii;
        char ch ;
        for(int i = 0;i < s.length();i ++) {
            if((int) s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) {
                ascii = ((int) s.charAt(i)) + 32 ;
                ch = (char) ascii ;
                newst = newst + ch;
            }
            else {
                newst = newst + s.charAt(i);
            }
        }
        return newst;
    }
}
