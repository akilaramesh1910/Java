
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        boolean isValid = sudoku(board);
        System.out.println("Is the board valid? " + isValid);
    }
    public static boolean sudoku(char[][] board) {

        Set<String> value = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j =0; j < 9; j++){
                char number = board[i][j];
                if(number != '.'){
                    if(!value.add(number + " in row " + i)){
                        return false;
                    }
                    if(!value.add(number + " in column " + j)){
                        return false;
                    }
                    if(!value.add(number + " in box " + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
