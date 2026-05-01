// 27. Remove Element

public class RemoveElement
{
    public static void main(String[]args)
    {
        int[]ar = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(ar,val));
    }

    public static int removeElement(int[]nums, int val)
    {
        int a=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] != val){
                nums[a] = nums[i];
                a++;
            }
        }
        return a;        
    }
}
