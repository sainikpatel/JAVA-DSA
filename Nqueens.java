import java.util.*;

public class Nqueens {

    // Check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(int row, int col, char[][] board) {
        // Check horizontally
        for (int j = 0; j < board.length; j++) {

            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // Check vertically
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {

            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Check upper-right diagonal
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {

            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Check bottom-left diagonal
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {

            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Check bottom-right diagonal
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {

            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // Save the board configuration.....
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {

        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = "";

            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    // Backtracking and recursion
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) { // Base case: all queens are placed
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q'; // Place the queen
                helper(board, allBoards, col + 1); // Recurse to the next column
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    // Solve N-Queens and return all solutions
    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with empty cells
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }


        helper(board, allBoards, 0);
        return allBoards;
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 4; // Change this value for other board sizes.

        List<List<String>> solutions = solveNQueens(n);

        // Print all solutions
        for (List<String> solution : solutions) {

            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
