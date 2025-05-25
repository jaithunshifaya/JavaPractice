public class UnionArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 3, 6, 8};

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                System.out.print(a[i++] + " ");
            } else if (a[i] > b[j]) {
                System.out.print(b[j++] + " ");
            } else {
                System.out.print(a[i] + " ");
                i++; j++;
            }
        }

        while (i < a.length) System.out.print(a[i++] + " ");
        while (j < b.length) System.out.print(b[j++] + " ");
    }
}
