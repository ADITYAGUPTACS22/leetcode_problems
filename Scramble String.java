class Solution {
    static boolean solve(String s1,String s2, HashMap<String, Boolean> mp)
    {
		int num=s1.length();
		if(s1.compareTo(s2)==0)
           {
             return true;
           }
        if(num<=1) 
            {
                return false;
            }
        
        String key=s1+" "+s2;
        if(mp.containsKey(key))
            return mp.get(key);
      
        boolean flag=false;  
        
        for(int i=1;i<num;i++) 
        {
            if((solve(s1.substring(0,i),s2.substring(num-i,num),mp) && (solve(s1.substring(i,num),s2.substring(0,num-i),mp))) || 
               (solve(s1.substring(0,i),s2.substring(0,i),mp) && (solve(s1.substring(i,num),s2.substring(i,num),mp)))) 
            {
                flag=true;
                break;
            }
        }
        mp.put(key,flag);
        return flag;
    }
    public boolean isScramble(String s1, String s2) 
    {
        if(s1.length()!=s2.length()) 
           {
             return false;
           }
        if(s1.equals(s2)) 
            {
                return true;
            }
        HashMap<String, Boolean> mp=new HashMap<String, Boolean>();
        return solve(s1,s2,mp);
    }
}
