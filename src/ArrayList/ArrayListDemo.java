package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // ArrayList<Type> arrayList = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<String> languages = new ArrayList<>();

        // add elements
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Swift");
        languages.add(1, "Python");

        System.out.println(languages);

        // access elements
        String str = languages.get(1);
        System.out.println(str);

        // change in arraylist
        languages.set(1, "C++");
        System.out.println(languages);

        // remove
        System.out.println(languages.size());

        languages.remove(2);
        System.out.println(languages);

        System.out.println(languages.size());

        //Iteration
        for(String language: languages) {
            System.out.println(language);
        }
    }
}
