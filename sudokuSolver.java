public class sudokuSolver{
    public static void print(int[][][] board){
        for(int i = 0; i<9;i++){
            for(int j = 0; j<9; j++){
                for(int k = 0; k<board[i][j].length; k++){
                    System.out.print(board[i][j][k]);
                }
                System.out.print(",");
            }
            System.out.println("");
        }
    }
    public static int[][] solve(int[][] board){

        return board;
    }
    public static int[][][] fill(int[][][] board){
        for(int i = 0; i<9;i++){
            for(int j =0; j<9; j++){
                for(int k = 0; k<9; k++){
                    board[i][j] = new int[] {0,1,2,3,4,5,6,7,8,9};
                }
            }
        }
        return board;
    }
    public static void main(String[] args){
        int[][][] board = new int[9][9][9];
        fill(board);
        print(board);

    }
}