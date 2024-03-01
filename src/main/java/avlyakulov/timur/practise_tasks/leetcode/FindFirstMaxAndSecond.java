package avlyakulov.timur.practise_tasks.leetcode;


public class FindFirstMaxAndSecond {
    public int maxProduct(int[] nums) {
        int max1=0;//1st largest
        int max2=0;//2nd largest

        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }else if(num>max2){
                max2=num;
            }
        }

        return (max1-1)*(max2-1);
    }

    public static void main(String[] args) {
        //Input: nums = [1,5,4,5]
        //Output: 16
        //Explanation: Choosing the indices i=1 and j=3 (indexed from 0),
        // you will get the maximum value of (5-1)*(5-1) = 16.
        int[] arr = {1, 5, 4, 5};
        System.out.println(new FindFirstMaxAndSecond().maxProduct(arr));
    }

}