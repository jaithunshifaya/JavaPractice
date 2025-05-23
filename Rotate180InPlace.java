public class Rotate180InPlace {
    public static void rotate180(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < m; j++) {
                
                int x = n - 1 - i;
                int y = m - 1 - j;

                
                if (i == x && j >= y) continue;

                int temp = mat[i][j];
                mat[i][j] = mat[x][y];
                mat[x][y] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate180(mat);

        
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
