package String;

import java.util.Arrays;

public class Performance {
    public static void main(String[] args) {
        String series = ""; // immutable (in the string we add the new value in the string then it create a new string)
        StringBuilder builder = new StringBuilder(); // Mutable(in the stringBuilder it does not creat
                                                     // e new string it automatically add in it)
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            series += ch; // series = series +ch;
            builder.append(ch);
        }
        System.out.println(series);
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder.toString());
        System.out.println(builder.capacity());
        System.out.println(builder.length());
        System.out.println(Arrays.toString(builder.chars().toArray()));
    }
}
