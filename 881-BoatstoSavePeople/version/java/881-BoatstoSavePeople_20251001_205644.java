// Last updated: 10/1/2025, 8:56:44 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        // step1 : count $5 and $10 notes 
        int five=0;
        int ten=0; 
        for (int i=0; i < bills.length; i++) {
            int bill=bills[i];
            if (bill==5) {
                five++;
            } 
            else if (bill==10) {
                if (five == 0) {
                    return false; // $5 chnage nhi de skte
                }
                five--;
                ten++;
            } 
            else { // bill==20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
