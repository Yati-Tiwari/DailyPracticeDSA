// Last updated: 1/26/2026, 4:40:46 PM
1class Solution {
2    public int primeSubarray(int[] nums, int k) {
3        int n=nums.length;
4        int max=0;
5        // nums me max value nikal rahe hain, sieve limit ke liye
6        for (int i=0; i < n; i++) {
7            max=Math.max(max, nums[i]);
8        }
9
10        // prime array yahin bana diya
11        boolean[] prime=sieve(max);
12
13        // TreeMap use kar rahe kyunki hume min prime aur max prime chahiye
14        TreeMap<Integer,Integer> map=new TreeMap<>();
15
16        int primes=0; // current window me kitne primes hain
17
18        // l1 -> window jisme at most 1 prime ho (invalid wale)
19        // l2 -> window jisme maxPrime - minPrime <= k ho
20        int l1=0;
21        int l2=0;
22        int cnt1=0; // at most 1 prime wale subarrays
23        int cntK=0; // gap <= k wale subarrays
24
25        for (int j=0;j< n;j++) {
26
27            // agar nums[r] prime hai to window me add karo
28            if (prime[nums[j]]) {
29                primes++;
30                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
31            }
32            // l1 window ko aisa rakho ki primes <= 1 rahe
33            while (primes > 1) {
34                if (prime[nums[l1]]) {
35                    primes--;
36                }
37                l1++;
38            }
39
40            // l2 window ko aisa rakho ki prime gap <= k rahe
41            while (!map.isEmpty() && map.lastKey() - map.firstKey() > k) {
42                if (prime[nums[l2]]) {
43                    map.put(nums[l2], map.get(nums[l2]) -1);
44                    if (map.get(nums[l2])==0) {
45                        map.remove(nums[l2]);
46                    }
47                }
48                l2++;
49            }
50
51            // yahan count update ho raha
52            cnt1 +=(j- l1+1); // at most 1 prime wale
53            cntK +=(j- l2+1); // gap <= k wale
54        }
55
56        // final valid = (gap<=k) - (at most 1 prime)
57        return cntK-cnt1;
58    }
59
60    // simple sieve function
61    private boolean[] sieve(int n) {
62        boolean[] prime=new boolean[n+1];
63        Arrays.fill(prime,true);
64
65        if(n>=0){
66            prime[0]=false;
67        }
68        if(n>=1){
69            prime[1]=false;
70        }
71
72        for (int p=2; p*p<=n; p++) {
73            if (prime[p]) {
74                for (int i=p*p; i<=n; i+=p) {
75                    prime[i]=false;
76                }
77            }
78        }
79        return prime;
80    }
81}
82