package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array02 {
    public static void main(String[] args) {
        ArrayList<String> heros = new ArrayList(Arrays.asList("spider man", "thor", "hulk", "iron man", "captain america"));
        
//        1. Length of the list
        System.out.println(heros.size());
        
//        2. Add 'black panther' at the end of this list
        heros.add("black panther");
        
        /*3. You realize that you need to add 'black panther' after 'hulk',
        so remove it from the list first and then add it after 'hulk'*/
        System.out.println(heros);
        heros.remove("black panther");
        System.out.println(heros);
        heros.add(3, "black panther");
        System.out.println(heros);
        
        /*4. Now you don't like thor and hulk because they get angry easily :)
        So you want to remove thor and hulk from list and replace them with doctor strange (because he is cool).
        Do that with one line of code.*/
        heros.remove(2);
        heros.set(1, "doctor strange");
        System.out.println(heros);
        
//        5. Sort the heros list in alphabetical order (Hint. Use dir() functions to list down all functions available in list)
//        heros.sort();
        Collections.sort(heros);
        System.out.println(heros);
    }
}
