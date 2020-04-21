/**Given 2 strings, check if one
 * is a permutation of the other.
 */
public class CheckPermutation {

    public static boolean isPerm(String a, String b){
        int[] char_set = new int[128];
        for(int i = 0; i < a.length(); i++){
            char_set[a.charAt(i)]++;
        }

        for(int i = 0; i < b.length(); i++){
            if(--char_set[b.charAt(i)] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPerm("aabc", "baca") + " || true");
        System.out.println(isPerm("abcc", "aca") + " || false");
        System.out.println(isPerm("urban", "bnura") + " || true");
    }
}