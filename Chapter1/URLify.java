/**Replace all the spaces in a string with
 * '%20.' Assume the string has sufficient
 * space at the end and you are given
 * the true length of the string.
 * 
 * Use a char array to do the operation
 * in-place
 * 
 * Input: 'Mr John Smith    ', 13
 * Output: 'Mr%20John%20Smith'
 * 
 */

public class URLify {
    public static void removeSpaces(char[] c, int len){

        int endIndex = len-1;
        for(int i = c.length-1; i > 0; i--){
            if(i <= endIndex){
                break;
            }
            if(c[endIndex] == ' '){
                c[i--] = '0';
                c[i--] = '2';
                c[i] = '%';
            }
            else{
            c[i] = c[endIndex];
            }
            endIndex--;
        }
        System.out.println(new String(c));
    }

    public static void main(String[] args){
        removeSpaces("Mr John Smith    ".toCharArray(), 13);
    }
}