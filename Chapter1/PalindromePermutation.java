/**Given a string, write a function to 
 * determine if it is a permutation of
 * a palindrome.
 * 
 * Ignore casing and non-letter 
 * characters
 */
public class PalindromePermutation {
    public static boolean isPalindromePermutation(String s){
        int[] alphabet = new int[24];
        s = s.toLowerCase();
        int numSpaces = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                numSpaces++;
                continue;
            }
            alphabet[s.charAt(i) - 'a']++;
        }
        if((s.length()-numSpaces)%2 == 0){
            for(int i = 0; i < alphabet.length; i++){
                if(alphabet[i] != 0 && alphabet[i] != 2){
                    return false;
                }
            }
        }
        else{
            int oddCount = 0;
            for(int i: alphabet){
                if(i == 1){
                    if(oddCount == 1) return false;
                    
                    oddCount++;
                }
                else if(i != 0 && i != 2){
                    return false;
                }
            }
            if(oddCount != 1) return false;
            
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindromePermutation("Tact Coa") + " || true");
        System.out.println(isPalindromePermutation("Tact Csoa") + " || false");
        System.out.println(isPalindromePermutation("Tact Cssoa") + " || true");
    }
}