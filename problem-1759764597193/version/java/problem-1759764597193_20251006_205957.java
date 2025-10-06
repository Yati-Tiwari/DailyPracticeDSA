// Last updated: 10/6/2025, 8:59:57 PM
class Solution {
    public String simplifyPath(String path) {
        // stack bna liya jisme hum folder store karenge
        Stack<String> stack = new Stack<>();

        // path ko "/" se tod diya, matlab har folder alag ho gaya
        String[] parts = path.split("/");

        // har ek part pe loop
        for (int i = 0; i < parts.length; i++) {
            String dir = parts[i]; // current folder name

            if (dir.equals("") || dir.equals(".")) {
                // agar empty hai ya "." hai to skip krdo kyunki same folder mei hi hai
                continue;
            } 
            else if (dir.equals("..")) {
                // agar ".." mila matlab ek folder peeche jaana hai
                if (!stack.isEmpty()) {
                    stack.pop(); // peeche jaane k liye last folder remove
                }
            } 
            else {
                // normal folder name hai to usko stack mei daal do
                stack.push(dir);
            }
        }
        // ab stack ke andar final folders bache hai
        // unko "/" ke sath jod dena hai taaki proper path ban jaye
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        // agar stack empty hai to matlab root folder hi bacha
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
