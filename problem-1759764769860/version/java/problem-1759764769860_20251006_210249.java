// Last updated: 10/6/2025, 9:02:49 PM
class StockSpanner {
    Stack<int[]> st; // stack mein [price, span] store karenge

    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        int span = 1; // har ek day ka span at least 1 hota hai

        // jab tak stack empty nahi aur top ka price <= current price
        while (!st.isEmpty() && st.peek()[0] <= price) {
            // uska span current span mein add kar do
            span += st.peek()[1];
            st.pop(); // usko hata do kyunki current price usse bada hai
        }

        // ab current price aur uska span stack mein daal do
        st.push(new int[]{price, span});

        // ye din ka answer hai
        return span;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */