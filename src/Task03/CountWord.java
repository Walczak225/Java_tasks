package Task03;

public class CountWord {
    String word;
    public CountWord(String word) {
        this.word = word;
    }

    public  String compressRLE(CountWord countWord) {
      StringBuilder builder = new StringBuilder();
      char[] chars = countWord.word.toCharArray();
      int count = 1;

      for (int i = 1; i < chars.length; i++) {
          if (chars[i] == chars[i - 1]) {
              count++;
          }else {
              builder.append(count).append(chars[i-1]);
              count = 1;
          }
      }
      builder.append(count).append(chars[chars.length-1]);
      return "Twoje słowo to: " + builder.toString();
    }

}
