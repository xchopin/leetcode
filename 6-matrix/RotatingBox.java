/**
Runtime6ms
Beats 97.36%
Analyze Complexity
Memory 79.75MB
Beats 48.59%
*/

class RotatingBox {
    public char[][] rotateTheBox(char[][] boxGrid) {
        for (int row = 0; row < boxGrid.length; row++) {
            int availableSpot = boxGrid[0].length - 1;
            int stoneFinder = availableSpot - 1;
            while (stoneFinder >= 0) {
                if (boxGrid[row][availableSpot] != '.') {
                    availableSpot--;
                    stoneFinder--;
                } else {
                    if (boxGrid[row][stoneFinder] == '#') {
                        boxGrid[row][stoneFinder] = '.';
                        boxGrid[row][availableSpot] = '#';
                        availableSpot--;
                        stoneFinder--;
                    } else if (boxGrid[row][stoneFinder] == '*') {
                        availableSpot = stoneFinder;
                        stoneFinder--;
                    } else {
                        stoneFinder--;
                    }
                }

            }
        }


        char[][] res = new char[boxGrid[0].length][boxGrid.length];

        for (int row = 0; row < boxGrid.length; row++) {
            for (int column = 0; column < boxGrid[0].length; column++) {
                res[column][boxGrid.length - 1 - row] =   boxGrid[row][column];
            }     
        }


        return res;
        
    }
}
