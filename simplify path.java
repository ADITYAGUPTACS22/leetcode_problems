class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String ar[]= path.split("/");
        for(int i=0;i<ar.length;i++)
        {
            if(!stack.isEmpty()&& ar[i].equals("..") )
            stack.pop();
            else if(!ar[i].equals("")&&!ar[i].equals(".")&& !ar[i].equals(".."))
            {stack.push(ar[i]);}
        }
       String ans="";
        if(stack.isEmpty())return "/";
        while(!stack.isEmpty())
        {
            ans="/"+stack.pop()+ans;
        }
        return ans;
    }
}
