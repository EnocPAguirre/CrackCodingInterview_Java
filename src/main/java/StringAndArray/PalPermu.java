package StringAndArray;

public class PalPermu {

    boolean isPermutation(String frase){
        int[] table = buildCharFrequency(frase);
        return  checkMaxOdd(table);
    }
    boolean checkMaxOdd(int[] table){
        boolean foundOdd = false;
        for(int count : table){
            if(count % 2 == 1){
               if(foundOdd){
                   return false;
               }
            }
            foundOdd = true;
        }
        return  true;
    }

    int getCharNumber(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int valor = Character.getNumericValue(c);

        if(a <= valor && valor >= z){
            return  valor -a;
        }
        return  -1;
    }

    int[] buildCharFrequency(String frase){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];

        for(char c : frase.toCharArray()){
            int x  = getCharNumber(c);

            if(x != -1){
                table[x]++;
            }
        }

        return  table;
    }

}
