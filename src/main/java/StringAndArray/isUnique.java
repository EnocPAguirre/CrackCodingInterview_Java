package StringAndArray;

public class isUnique {

    public boolean isUniqueChar(String str){
        if(str.length() > 128) return false;

        boolean[] charset = new boolean[128];
        for (int i = 0; i < str.length(); i++){
            int value = str.charAt(i);
            if(charset[value]){
                return false;
            }
            charset[value] = true;
        }

        return true;
    }
}
