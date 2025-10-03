// Last updated: 10/3/2025, 9:13:27 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        // starting from 1 we call helper fn
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result; // return final ans list
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int start, int n, int k) {
        // agar current list ka size = k ho gya matlab ek combo mil gya
        if (current.size() == k) {
            result.add(new ArrayList<>(current)); // usko result mei daal do
            return; // aur return krdo
        }

        // yaha loop start se n tak chalega, har number try krenge
        for (int i = start; i <= n; i++) {
            current.add(i); // abhi ka number dal diya
            backtrack(result, current, i + 1, n, k); // aage ke numbers check krne gaye
            current.remove(current.size() - 1); // backtrack, jo dala tha use hata diya
        }
    }
}
