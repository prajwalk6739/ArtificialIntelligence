package Basic;
import java.util.*;
public class Nqueen {
        public static void placeNQueens(int n){
            int[][] board = new int[n][n];
            solveNQueens(board, 0,n);
        }
        static void solveNQueens(int board[][], int row, int N)
        {
            if (row == N)
            {
                printSolution(board,N);
                return;
            }
            for (int i = 0; i < N; i++)
            {
                if ( isSafe(board, row, i, N) )
                {
                    board[row][i] = 1;
                    solveNQueens(board, row + 1, N);
                    board[row][i] = 0;
                }
            }
        }
        static boolean isSafe(int board[][], int row, int col, int N)
        {
            int i, j;
            for (i=0;i<row;i++)
            {
                if (board[i][col]==1)
                    return false;
            }
            // Check upper diagonal on left side
            for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
                if (board[i][j] == 1)
                    return false;
            //Check upper right diagonal
            for (i=row,j=col;i>=0 && j<N;i--,j++)
                if (board[i][j] == 1)
                    return false;
            return true;
        }
        static void printSolution(int board[][], int N) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(board[i][j] + " ");
                System.out.println();
            }
            System.out.println();
        }
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter No. of Queens:-");
            int n = s.nextInt();
            placeNQueens(n);
        }
}
