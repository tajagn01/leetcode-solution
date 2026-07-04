class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int rowMin = 0;

        int colMax = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int curRowMin = Integer.MAX_VALUE;

            for (int j = 0; j < m; j++) {
                curRowMin = Math.min(curRowMin, matrix[i][j]);
            }

            rowMin = Math.max(rowMin, curRowMin);
        }

        for (int j = 0; j < m; j++) {
            int curColMax = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                curColMax = Math.max(curColMax, matrix[i][j]);
            }

            colMax = Math.min(colMax, curColMax);
        }


        if (rowMin == colMax) {
            return Arrays.asList(rowMin);
        }

        return new ArrayList<>();
    }
}