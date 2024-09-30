class Solution {
    Boolean [][] arr;
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() +s2.length() != s3.length())
        {
            return false;
        }
        arr = new Boolean[s1.length()+1][s2.length()+1];
    
       return helper(s1, s2, s3,0, 0 );
        
    }
    
    public boolean helper(String s1, String s2, String s3, int i, int j)
    {
        if(i == s1.length() && j== s2.length())
        {
            return true;
        }
        
        if(arr[i][j] != null)
        {
            return arr[i][j];
        }
    
        if(i < s1.length() && s1.charAt(i) == s3.charAt(i +j))
        {
           boolean firstIndex = helper(s1, s2, s3, i+1, j);
            if(firstIndex == true)
            {
                return true;
            }
        }
        
         if(j < s2.length() && s2.charAt(j) == s3.charAt(i+j))
        {
           boolean secondIndex = helper(s1, s2, s3, i, j+1);
             if(secondIndex ==true)
                 return true;
        }
        return arr[i][j]=false;
    }
}
