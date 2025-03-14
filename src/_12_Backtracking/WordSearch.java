package _12_Backtracking;
//https://leetcode.com/problems/word-search/description/?envType=study-plan-v2&envId=top-interview-150
public class WordSearch {
    public static void main(String[] args) {
        char[][]board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word="ABCCED";
        int rows= board.length;
        int cols= board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(board[i][j]==word.charAt(0) && exist(board,word,i,j,0))
                {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
    public static boolean exist(char[][]board,String word,int r,int c,int count)
    {
          if(count==word.length())
          {
              return true;
          }
          if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!=word.charAt(count))
          {
              return false;
          }
          char temp=board[r][c];
          board[r][c]=' ';
          boolean found=exist(board,word,r-1,c,count+1) || exist(board,word,r+1,c,count+1)
                  || exist(board,word,r,c-1,count+1) || exist(board,word,r,c+1,count+1);
          board[r][c]=temp;
          return found;
    }
}
