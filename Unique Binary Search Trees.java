class Solution 
{
    public int numTrees(int n) 
    {
        int arr[] = new int[n+1];
        arr[1]=1;
        if(n>=2)
            arr[2]=2;
        if(n>=3)
            arr[3]=5;
        
        for(int i=4;i<=n;i++)
        {
            int total=0;
            int right = 1;
            int left = i-2;
            arr[i] = arr[i-1]*2;
            while(left>=1)
            {
                total += ( arr[left]*arr[right] );            
                left--;
                right++;
            }
            arr[i]+=total;
           
        }
        return arr[n];
    }
}
