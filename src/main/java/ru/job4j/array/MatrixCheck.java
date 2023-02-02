package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rst = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != board[row][0]) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
