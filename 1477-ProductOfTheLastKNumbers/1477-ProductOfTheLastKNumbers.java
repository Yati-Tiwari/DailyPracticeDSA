// Last updated: 8/14/2025, 11:20:07 AM
import java.util.LinkedList;

class ProductOfNumbers {
    private LinkedList<Integer> nums;
    private int product;

    public ProductOfNumbers() {
        nums = new LinkedList<>();
        product = 1;
    }

    public void add(int num) {
        if (num == 0) {
            nums.clear();
            product = 1;
        } else {
            nums.add(num);
            product *= num;
        }
    }

    public int getProduct(int k) {
        if (k > nums.size()) {
            return 0;
        }

        if (k == nums.size()) {
            return product;
        }

        int divisor = 1;
        for (int i = 0; i < nums.size() - k; i++) {
            divisor *= nums.get(i);
        }
        
        return product / divisor;
    }
}
