import java.util.*;

/* Implement an algorithm to determine
 * if a string has all unique characters.
 * What if you cannot use additional data
 * structures?
 */
public class IsUnique {

    public static boolean isUniqueDS(String s){
        HashSet<Character> h = new HashSet<Character>();
        for(char c: s.toCharArray()){
            if(!h.add(c)) return false;
        } 
        return true;
    }

    public static boolean isUnique(String s){
        //128 or 256 char alphabets
        //assume 128 this time
        boolean[] chars = new boolean[128];
        for(int i = 0; i < s.length(); i++){
            if(chars[s.charAt(i)]) return false;
            else chars[s.charAt(i)] = true;
        } 
        return true;
    }

    public static void main(String[] args){
        System.out.println("With Data Structures:");
        System.out.println(isUniqueDS("aabc") + " : false");
        System.out.println(isUniqueDS("abcc") + " : false");
        System.out.println(isUniqueDS("abc") + " : true");
        System.out.println("");
        System.out.println("Without Data Structures:");
        System.out.println(isUnique("aabc") + " : false");
        System.out.println(isUnique("abcc") + " : false");
        System.out.println(isUnique("abc") + " : true");

    }
}