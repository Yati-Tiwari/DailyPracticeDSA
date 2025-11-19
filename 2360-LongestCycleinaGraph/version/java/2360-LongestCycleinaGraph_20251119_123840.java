// Last updated: 11/19/2025, 12:38:40 PM
class Solution {
   public static int longestCycle(int[] edges) {
		int[] in = new int[edges.length];

		// Step 1: Count in-degrees
		for (int i = 0; i < edges.length; i++) {
			if (edges[i] != -1) {
				in[edges[i]]++;
			}
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}

		boolean[] visited = new boolean[edges.length];

		// Step 2: Topological pruning
		while (!q.isEmpty()) {
			int e = q.poll();
			visited[e] = true;
			if (edges[e] != -1) {
				in[edges[e]]--; 
				if (in[edges[e]] == 0) {
					q.add(edges[e]);
				}
			}
		}

		int ans = -1;

		// Step 3: Detect cycles
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				int c = 1;
				visited[i] = true;
				int nbrs = edges[i];
				Map<Integer, Integer> map = new HashMap<>();
				map.put(i, 0);
				int step = 1;

				while (nbrs != -1 && !map.containsKey(nbrs)) {
					if (visited[nbrs]) break;
					map.put(nbrs, step++);
					visited[nbrs] = true;
					nbrs = edges[nbrs];
				}

				if (nbrs != -1 && map.containsKey(nbrs)) {
					ans = Math.max(ans, step - map.get(nbrs));
				}
			}
		}

		return ans;
	}
}