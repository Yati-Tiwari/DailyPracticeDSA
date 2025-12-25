// Last updated: 12/25/2025, 6:31:17 PM
1class Solution {
2    public int distMoney(int money, int children) {
3        if(money < children ){
4            return -1;
5        }
6        if(money >8*children){
7            return children-1;
8        }
9        if(money==8*children-4){
10            return children-2;
11        }
12        return (money-children)/7;
13    }
14}