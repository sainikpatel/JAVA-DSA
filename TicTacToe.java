import java.util.Scanner;

public class TicTacToe {
    static char[][] board = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';

        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                if (checkWin(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch turn
            } else {
                System.out.println("Cell occupied! Try again.");
            }

            if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
        scanner.close();
    }

    static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true; // Row
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true; // Column
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player); // Diagonal
    }

    static boolean isDraw() {
        for (char[] row : board)
            for (char cell : row)
                if (cell == ' ') return false;
        return true;
    }
}
