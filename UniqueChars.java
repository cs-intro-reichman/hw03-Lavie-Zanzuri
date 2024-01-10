/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String newstr = "";
        newstr = newstr + s.charAt(0);
        for(int i = 1; i < s.length(); i ++) {
            Boolean isduplicate = false ;
            for(int j = 0 ; j < i; j ++) {
                if(s.charAt(i) == s.charAt(j))
                {
                    isduplicate = true ;
                    break;
                }
            }
            if(isduplicate == false) {
                newstr = newstr + s.charAt(i);
            }

        }
        return newstr;
    }
}
