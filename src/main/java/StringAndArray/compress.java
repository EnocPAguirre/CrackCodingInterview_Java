package StringAndArray;

public class compress {
    String comprimir(String str){

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++){
            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressed.append(str.charAt(1));
                compressed.append(countConsecutive);
                countConsecutive=0;
            }
        }

        return compressed.length() < str.length()? compressed.toString(): str;
    }
}
