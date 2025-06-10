import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int row = 1; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = triangle.get(row - 1);

            currentRow.add(1);

            for (int col = 1; col < row; col++) {
                currentRow.add(previousRow.get(col - 1) + previousRow.get(col));
            }

            currentRow.add(1);
            triangle.add(currentRow);
        }

        return triangle;
    }
}
