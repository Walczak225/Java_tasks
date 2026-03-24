package Task05;

import java.util.HashMap;
import java.util.Map;

public class Word {
    String word;
    Word(String word) {
        this.word = word;
    }

    public void longest(){
        String[] array = word.split(" ");
        String winnerString= "";
        int winnerInt = 0;
        for (int i = 0; i <array.length ; i++) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            String current = array[i];
            int max = 0;
            for(char c : current.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
            }
            for(int c : map.values()){
                if(c >  max){
                    max = c;

                }
            }
            if(max>winnerInt){
                winnerInt = max;
                winnerString = current;
            }

        }
        System.out.println("winnerString = "+winnerString + " winnerInt = "+winnerInt);


    }

}
