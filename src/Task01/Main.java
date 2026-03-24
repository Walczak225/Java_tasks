package Task01;

import Task02.MaxProfit;

public class Main {
    static void main() {
        int[] table = {44, 30, 24, 32, 35, 30, 40, 38, 15};
        System.out.println("Table: ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + ", ");
        }
        MaxProfit maxProfit = new MaxProfit(table);
        System.out.print("\nMax profit: ");
        System.out.print(maxProfit.calculateMaxProfit(table));

    }
}
