package ProgrammingIQ;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindAllComboStrings {

    public static void main(String[] args) {
        String s = "abc";
        Set<String> ss = new HashSet<>();
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                ss.add(s.substring(i, j));
            }
        }

        Collections.sort(new ArrayList<>(ss));

        for(String s1:ss){
            System.out.println(s1);
        }
    }
    
}