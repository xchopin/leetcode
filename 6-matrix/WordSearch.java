/**
Runtime151ms Beats 43.55%
Analyze Complexity
Memory 41.55MB Beats 77.35%
**/

class WordSearch {
    public boolean exist(char[][] board, String word) {
        int columns = board.length;
        int rows = board[0].length;

        boolean[][] visited = new boolean[columns][rows];

        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                if (find(board, column, row, 0, word, visited)) {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean find(char[][] board, int cursorColumn, int cursorRow, int indexWord, String word, boolean[][] visited) {
        if (indexWord == word.length()) {
            return true;
        }

        int columns = board.length;
        int rows = board[0].length;

        boolean isOutbound = (cursorRow < 0 || cursorColumn < 0 || cursorRow >= rows || cursorColumn >= columns);

        if (isOutbound || visited[cursorColumn][cursorRow] || (word.charAt(indexWord) != board[cursorColumn][cursorRow])) {
            return false;
        }

        visited[cursorColumn][cursorRow] = true;

        if (find(board, cursorColumn, cursorRow + 1, indexWord + 1, word, visited)
            || find(board, cursorColumn, cursorRow - 1, indexWord + 1, word, visited)
            || find(board, cursorColumn + 1, cursorRow, indexWord + 1, word, visited)
            || find(board, cursorColumn - 1, cursorRow, indexWord + 1, word, visited)
        ) {
            return true;
        } else {
            visited[cursorColumn][cursorRow] = false;
            return false;
        }
    }
}
