package StringAndArray;

public class Url {

    void replaceSpaces(char[] word, int trueLength){

        int countSpaces = 0, index, i = 0;
        for (i = 0; i < trueLength; i++){
            if(word[i] == ' '){
                countSpaces++;
            }
        }

        index = trueLength + (countSpaces * 2);

        if(trueLength < word.length) word[trueLength] = '\0';

        for(i = trueLength - 1; i > 0; i--){
            if(word[i] == ' ') {
                word[index - 1] = '0';
                word[index - 2] = '2';
                word[index - 3] = '%';
                index = index - 3;
            }else {
                word[index - 1] = word[i];
                index--;
            }
        }
    }

}
