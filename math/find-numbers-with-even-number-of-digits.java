class Solution {
    public int findNumbers(int[] nums) {
  int t=0;
  for(int i=0;i<nums.length;i++)    
  {
    int n=nums[i];
    int s=0;
    while(n>0)
    {
        s=s+1;
        n=n/10;

    }
    if(s%2==0){
        t=t+1;
    }
  }  return t;
    }
}