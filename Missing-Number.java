public class MissingNumber
{
    public static void main(String[]args)
    { 
        int[]ar = {3,0,1};
        System.out.println(missing(ar));
    }

    public static int missing(int[]nums)
    {
        int n = nums.length+1;
        
        for(int i=0;i<=n;i++){
            boolean found = false;
            
            for(int j=0;j<n-1;j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
