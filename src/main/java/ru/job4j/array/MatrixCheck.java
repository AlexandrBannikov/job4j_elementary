package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rst = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != board[row][0]) {
                rst = false;
                break;
            }
        }
        return rst;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != board[0][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
