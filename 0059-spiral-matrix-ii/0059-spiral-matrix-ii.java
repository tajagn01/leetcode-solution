class Solution {
    public int[] [] generateMatrix(int n) {
        int k = 1;
        int srow = 0, erow = n - 1;
        int scol = 0, ecol = n - 1;
        int[] [] mat = new int[n] [n];

        while (srow <= erow && scol <= ecol) {
            for (int j = scol; j <= ecol; j++) {
                mat[srow] [j] = k++;
            }
            srow++;

            for (int i = srow; i <= erow; i++) {
                mat[i] [ecol] = k++;
            }
            ecol--;

            if (srow <= erow) {
                for (int j = ecol; j >= scol; j--) {
                    mat[erow] [j] = k++;
                }
                erow--;
            }

            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    mat[i] [scol] = k++;
                }
                scol++;
            }
        }

        return mat;
    }
}