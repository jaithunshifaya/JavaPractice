public class ZigZagMatrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] mat = new int[n][n];
        int num = 1;

        for (int line = 0; line < 2 * n - 1; line++) {
            int startCol = line < n ? 0 : line - n + 1;
            int count = line < n ? line + 1 : 2 * n - line - 1;

            for (int j = 0; j < count; j++) {
                int row = startCol + j;
                int col = line - row;
                mat[row][col] = num++;
            }
        }

        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
