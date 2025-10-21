// Last updated: 10/21/2025, 9:50:40 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean alive = true;

            while (alive && curr < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();
                int sum = top + curr;

                if (sum < 0) {
                    stack.pop(); // top smaller, remove it
                } else if (sum > 0) {
                    alive = false; // current smaller, destroy it
                } else {
                    stack.pop();  // equal, both destroyed
                    alive = false;
                }
            }

            if (alive) {
                stack.push(curr);
            }
        }

        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }

        return res;
    }
}
