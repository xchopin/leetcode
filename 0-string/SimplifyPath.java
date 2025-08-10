/**

Accepted
264 / 264 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Aug 10, 2025 16:07

Editorial

Solution
Runtime
4ms
Beats 91.29%
Analyze Complexity
Memory
43.61 MB
Beats57.28%

*/


class SimplifyPath {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        StringBuilder sb = new StringBuilder();

        int skip = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i].equals("") || arr[i].equals(".")) {
                continue;
            } else if (arr[i].equals("..")) {
                skip++;
                continue;
            } else {
                if (skip > 0) {
                    skip--;
                } else {
                    sb.insert(0, "/" + arr[i]);
                }
            }

        }

        return sb.isEmpty() ? "/" : sb.toString();   
    }
}
