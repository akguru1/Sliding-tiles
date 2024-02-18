public class Tiles {

    public static boolean isPacked(String[][] tiles) {
        for (int r = 0; r < tiles.length; r++) {
            for (int c = 0; c < tiles[0].length; c++) {
                if (tiles[r][c] != null) {
                    if ((r > 0 && tiles[r - 1][c] == null) || (c > 0 && tiles[r][c - 1] == null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void moveTile(String[][] tiles, int row, int col) {
        // Move upwards
        while (row > 0 && tiles[row - 1][col] == null) {
            tiles[row - 1][col] = tiles[row][col];
            tiles[row][col] = null;
            row--;
        }

        // Move to the left
        while (col > 0 && tiles[row][col - 1] == null) {
            tiles[row][col - 1] = tiles[row][col];
            tiles[row][col] = null;
            col--;
        }
    }

    public static void pack(String[][] tiles) {
        for (int r = 0; r < tiles.length; r++) {
            for (int c = 0; c < tiles[0].length; c++) {
                if (tiles[r][c] != null) {
                    moveTile(tiles, r, c);
                }
            }
        }
    }

    public static void display(String[][] tiles) {
        for (String[] row : tiles) {
            for (String tile : row) {
                System.out.print((tile == null? ".": tile));
            }
            System.out.println();
        }

    }
}
