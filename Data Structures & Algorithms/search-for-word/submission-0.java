class Solution {
      public boolean exist(char[][] board, String word) {

        boolean [][] seen = new boolean[board.length][board[0].length];
        for(int i =0; i< board.length; i++){
            for(int j =0; j< board[0].length; j++){
                if (dfs(board, i, j, word, 0, seen)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, int row, int col,
                        String word, int index,
                        boolean[][] seen) {
        if (index == word.length()) return true;

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length|| seen[row][col] ||board[row][col] != word.charAt(index) ){
            return false;
        }
        seen[row][col] = true;
        boolean found =
                dfs(board, row + 1, col, word, index + 1, seen) ||
                        dfs(board, row - 1, col, word, index + 1, seen) ||
                        dfs(board, row, col + 1, word, index + 1, seen) ||
                        dfs(board, row, col - 1, word, index + 1, seen);

        seen[row][col]= false;

        return found;
    }
}