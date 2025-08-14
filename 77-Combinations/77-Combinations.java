// Last updated: 8/14/2025, 11:26:32 AM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> Answer = new ArrayList<>();
        Backtrack(1, n, k, new ArrayList<>(), Answer);
        return Answer;
    }
    public void Backtrack(int start,int n,int k,List<Integer> temp_List, List<List<Integer>> Answer) {
        if (temp_List.size() == k) {
           Answer.add(new ArrayList<>(temp_List));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp_List.add(i);
            Backtrack(i + 1, n, k, temp_List, Answer);
            temp_List.remove(temp_List.size() - 1);
        }
    }
}
