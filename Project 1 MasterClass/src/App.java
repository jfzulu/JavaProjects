import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] gameBoard = {
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' } };

        printGameBoard(gameBoard);
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su casilla (1-9): ");
        int pos = scan.nextInt();
        System.out.println(pos);

    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
