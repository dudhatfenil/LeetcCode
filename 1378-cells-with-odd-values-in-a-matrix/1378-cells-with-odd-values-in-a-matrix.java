class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowIncrements = new int[m];
        int[] colIncrements = new int[n];
        

        for (int[] index : indices) {
            int r = index[0];
            int c = index[1];
            rowIncrements[r]++;
            colIncrements[c]++;
        }
        
        int oddCount = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cellValue = rowIncrements[i] + colIncrements[j];
                if (cellValue % 2 == 1) {
                    oddCount++;
                }
            }
        }
        
        return oddCount;
    }
}