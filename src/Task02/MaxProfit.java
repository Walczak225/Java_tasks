package Task02;

public class MaxProfit {
    int[] table;

    public MaxProfit(int[] table){
        this.table = table;
    }

    public int calculateMaxProfit(int[] table){
        int minValue = table[0];
        int profit = -1;
        int maxProfit = 0;

        for (int i = 1; i < table.length; i++){
            int current = table[i];
            if (current < minValue) minValue = table[i];
            profit = current - minValue;
            if (profit > maxProfit) maxProfit = profit;
        }
        return maxProfit > 0 ? maxProfit : -1;
    }


}
