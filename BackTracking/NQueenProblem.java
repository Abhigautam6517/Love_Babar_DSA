public class NQueenProblem {

    public static boolean isQueenPlaced(boolean [][]board, int row, int column){

        // Check Row
        for(int i=row;i>=0;i--){
            if(board[i][column]) {
                return false;
            }
        }

        //left diagonal
         for(int i=row, j=column; i>=0 && j>=0; i--,j--){
            if(board[i][j]){
                return false;
            }
         }

         //Right Diagonal
         for(int i=row, j=column; i>=0 && j<board[row].length; i--,j++){
            if(board[i][j]){
                return false;
            }
         }
         return true;
    }


    private static int countQueenPlacement(boolean[][] board, int CurrentRow) {
        int count = 0;
        if(CurrentRow==board.length){
            return 1;
        }
        for(int column =0;column<board[CurrentRow].length;column++){
            if(isQueenPlaced(board, CurrentRow,column)){
                board[CurrentRow][column] = true;
                int value = countQueenPlacement(board, CurrentRow+1);
                count = count+value;
                board[CurrentRow][column]=false;
            }
        }
        return count;

       
    }
    public static void main(String[] args) {
        boolean board[][]=new boolean[4][4];
        int count = countQueenPlacement(board,0);
        System.out.println(count);
        
    }

    
    
}
