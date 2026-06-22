class Solution {
     public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String [] part = path.split("/");

        for(String p : part) {

            if (p.equals("") || p.equals(".")){
                continue;
            }else if (p.equals("..")){
                if (!stack.empty())
                stack.pop();
            }else {
                stack.push(p);
            }
        }

        StringBuilder str = new StringBuilder();
        for(String s : stack){
            str.append("/").append(s);
        }

        return str.length() == 0 ? "/" :  str.toString();
    }
}