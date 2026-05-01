// 2529. Maximum Count of Positive Integer and Negative Integer

public class MaximumCount
{
    public static void main(String[]args)
    {
        int[]nums = {5,20,66,1314};
        System.out.println(maximumCount(nums));
    }

    public int maximumCount(int[] nums) 
    {
        int pos=0,neg=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg++;
            }
            else if(nums[i]>0){
                pos++;
            }
        }
        if(pos<neg){
            return neg;
        }
        return pos;
    }
}
