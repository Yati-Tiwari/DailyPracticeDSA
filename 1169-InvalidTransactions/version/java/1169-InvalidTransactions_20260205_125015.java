// Last updated: 2/5/2026, 12:50:15 PM
1class Solution {
2    static class Transaction {
3        String name,city;
4        int time,amount;
5        String original;
6        Transaction(String s) {
7            String[] parts=s.split(",");
8            name=parts[0];
9            time=Integer.parseInt(parts[1]);
10            amount=Integer.parseInt(parts[2]);
11            city=parts[3];
12            original=s;
13        }
14    }
15    public List<String> invalidTransactions(String[] transactions) {
16        List<Transaction> list=new ArrayList<>();
17        for(String t : transactions){
18            list.add(new Transaction(t));
19        }
20        List<String> result=new ArrayList<>();
21        for(int i=0; i < list.size(); i++){
22            Transaction t1=list.get(i);
23            boolean invalid=false;
24
25            // amount > 1000
26            if(t1.amount > 1000){
27                invalid = true;
28            }
29
30            // same name, diff city, within 60 minutes
31            for (int j=0; j < list.size(); j++) {
32                if (i==j){
33                    continue;
34                }
35                Transaction t2=list.get(j);
36                if (t1.name.equals(t2.name) && !t1.city.equals(t2.city) &&
37                    Math.abs(t1.time - t2.time) <=60) {
38                    invalid=true;
39                    break;
40                }
41            }
42            if (invalid) result.add(t1.original);
43        }
44        return result;
45
46    }
47}