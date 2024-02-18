public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String[][] tiles = new String[5][8];
        tiles[0][0] = "W";
        tiles[0][4] = "I";
        tiles[1][2] = "N";
        tiles[1][6] = "N";
        tiles[2][2] = "N";
        tiles[2][3] = "E";
        tiles[2][4] = "E";
        tiles[3][0] = "Q";
        tiles[3][2] = "V";
        tiles[3][3] = "E";
        tiles[3][4] = "R";
        tiles[3][6] = "R";
        tiles[4][1] = "U";
        tiles[4][2] = "I";
        tiles[4][3] = "T";
        tiles[4][7] = "S";
        System.out.println("Tiles are packed is: " + Tiles.isPacked(tiles));
        Tiles.display(tiles);
        Tiles.pack(tiles);
        System.out.println("");
        Tiles.display(tiles);
        System.out.println(Tiles.isPacked(tiles));
    }

}
