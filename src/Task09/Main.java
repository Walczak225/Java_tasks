package Task09;

public class Main {
    static void main() {
        int[][] array = {
                {8,1,6},
                {3,5,7},
                {4,4,2}
        };
        magicSquare magicSquare = new magicSquare(array);
        System.out.print("Is magic: " + magicSquare.isMagicSquare());


    }
}
