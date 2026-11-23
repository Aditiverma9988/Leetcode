class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {

            List<Integer> tempList = new ArrayList<>();

            for (int col = 1; col <= row; col++) {

                tempList.add(nCr(row - 1, col - 1));
            }

            ans.add(tempList);
        }

        return ans;
    }

    public int nCr(int n, int r) {

        if (r > n) return 0;

        r = Math.min(r, n - r);

        int ans = 1;

        for (int i = 0; i < r; i++) {
            ans = ans * (n - i) / (i + 1);
        }

        return ans;
    }
}