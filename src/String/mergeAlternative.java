package String;
//1768. Merge Strings Alternately leetcode
public class mergeAlternative {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "forgeeks";
        System.out.println(mergeAlternately(s1, s2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        for(int i=0; i<word1.length() || i<word2.length(); i++){
            if(i<word1.length()){
                merge.append(word1.charAt(i));
            }
            if(i<word2.length()){
                merge.append(word2.charAt(i));
            }
        }
        return merge.toString();
    }
}
