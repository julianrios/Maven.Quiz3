package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        List<String> list = new ArrayList<>();
        for (int rowNumber = 0; rowNumber <= value; rowNumber++) {
            for (int columnNumber = 0; columnNumber < board.length; columnNumber++) {

                list.add(board[rowNumber][columnNumber]);
            }
        }
        String[] stringArray = list.toArray(new String[0]);
        return stringArray;
    }

    public String[] getColumn(Integer value) {
        return getRow(value);
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
