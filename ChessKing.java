public class ChessKing {
    public static void printPath(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1, dy = y2 - y1;
        int moves = Math.max(Math.abs(dx), Math.abs(dy));

        System.out.println("Minimum moves: " + moves);
        while (x1 != x2 || y1 != y2) {
            if (x1 < x2) x1++;
            else if (x1 > x2) x1--;
            
            if (y1 < y2) y1++;
            else if (y1 > y2) y1--;

            System.out.println("Move to: (" + x1 + ", " + y1 + ")");
        }
    }

    public static void main(String[] args) {
        printPath(1, 1, 5, 3);  // example
    }
}
