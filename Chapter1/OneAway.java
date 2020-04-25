/**
 * There are three types of edits that can be performed on strings: insert a
 * character, remove a character, or replace a character. Given two strings,
 * write a function to check if they are one edit (or zero edits) away.
 * 
 * Input -> Output 
 * 'pale, ple' -> true 
 * 'pales, pale' -> true 
 * 'pale, bale' -> true 
 * 'pale, bake' -> false
 */
public class OneAway {

    public static boolean oneEditAway(String a, String b){
        int lenDiff = a.length() - b.length();
        if(lenDiff == 0){
            int i = 0;
            int j = 0;
            boolean foundDiff = false;
            while(i < a.length() && j < b.length()){
                if(a.charAt(i) != b.charAt(j)){
                    if(foundDiff) return false;
                    foundDiff = true;
                }
                i++;
                j++;
            }
            return true;
        }

        if(lenDiff == 1) return oneEditInsert(a, b);
        if(lenDiff == -1) return oneEditInsert(b, a); 
        return false;
    }
    
    public static boolean oneEditInsert(String a, String b){
        int index1 = 0;
        int index2 = 0;
        while(index1 < a.length() && index2 < b.length()){
            if(a.charAt(index1) != b.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index1++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true; 
    }

    public static void main(String[] args){
        System.out.println("pale, ple -> true || " + oneEditAway("pale", "ple"));
        System.out.println("pales, pale -> true || " + oneEditAway("pales", "pale"));
        System.out.println("pale, bale -> true || " + oneEditAway("pale", "bale"));
        System.out.println("pale, bake -> false || " + oneEditAway("pale", "bake"));
    }
}