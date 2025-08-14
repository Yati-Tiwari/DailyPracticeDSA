// Last updated: 8/14/2025, 11:24:19 AM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        int current=0;
      List<Integer>arr=new ArrayList<>();
      print(n,current,arr);
		return arr;
	}
	public static void print(int n,int current,List<Integer> arr) {
		if(current>n) {
			return;
		}
		if(current!=0){
            arr.add(current);
        }
		int i=0;
		if(current==0) {
			i=1;
		}
		for(;i<=9;i++) {
			print(n,current*10+i,arr);
		}
	}

}