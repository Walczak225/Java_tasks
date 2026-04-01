package Task09;

public class magicSquare {
    private int[][] array;
    public magicSquare(int[][] array) {
        this.array = array;
    }

    public boolean isMagicSquare() {
        int columnLenght = array.length;
        int rowLenght = array[0].length;
        if (columnLenght != rowLenght) return false;
        int columnSum = 0;
        int rowSum = 0;
        int diagonalSumA = 0;
        int diagonalSumB = 0;
        for (int i = 0; i < rowLenght; i++) {
            rowSum += array[0][i];
            columnSum += array[i][0];
        }
        if (columnSum != rowSum) return false;

        for (int i = 0; i < array.length; i++) {
           diagonalSumA += array[i][i];
           diagonalSumB += array[i][columnLenght-1-i];
        }
        if (diagonalSumA != diagonalSumB) return false;

        return true;
    }




}
