public class MagicSquare {
    public static void main(String[] args) {
        int n = 5;
        int[][] magic = new int[n][n];

        int num = 1, i = 0, j = n / 2;

        while (num <= n * n) {
            magic[i][j] = num++;
            int newI = (i - 1 + n) % n;
            int newJ = (j + 1) % n;
            if (magic[newI][newJ] != 0)
                i = (i + 1) % n;
            else {
                i = newI;
                j = newJ;
            }
        }

        for (int[] row : magic) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
