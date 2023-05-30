package AI_Lab;
import java.util.Scanner;
public class A_Star_Algorithm {
    public static boolean board(int maze[][]){
        int path[][] = new int[maze.length][maze.length];
        return searchPath(maze,0,0,path);
    }
    public static boolean searchPath(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;
        if(i<0 || j<0||i>=n||j>=n||maze[i][j]==0||path[i][j]==1){
            return false;
        }
        path[i][j]=1;
        if(i==n-1 && j==n-1){
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.print(path[r][c]+" ");
                }
                System.out.println();
            }
            return true;
        }
        if(searchPath(maze,i-1,j,path)){
            return true;
        }
        if(searchPath(maze,i,j+1,path)){
            return true;
        }
        if(searchPath(maze,i+1,j,path)){
            return true;
        }
        if(searchPath(maze,i,j-1,path)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maze[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maze[i][j] = s.nextInt();
            }
        }
        System.out.println(board(maze));
    }
}
