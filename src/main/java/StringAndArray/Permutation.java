package StringAndArray;

import java.util.Arrays;

public class Permutation {

    String sort(String str){
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public boolean isPermutation(String palabra1, String palabra2){
        if(palabra1.length() != palabra2.length()){
            return  false;
        }

        return sort(palabra1).equals(sort(palabra2));
    }

}
