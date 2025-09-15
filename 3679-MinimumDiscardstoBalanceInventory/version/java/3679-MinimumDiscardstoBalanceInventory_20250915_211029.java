// Last updated: 9/15/2025, 9:10:29 PM
class Solution {
    public long maxWeight(int[] pizzas) {
        int n=pizzas.length;
        int days = n / 4;
        int odd=(days + 1) / 2;
        int even = days - odd;
        Arrays.sort(pizzas);
        long ans=0;
        for (int i = n - odd; i < n; i++) {
            ans=ans+pizzas[i];
        }
        int idx = n - odd - 2;
        while (even > 0) {
            ans += pizzas[idx];
            idx=idx-2;
            even--;
        }
        return ans;
    }
}
