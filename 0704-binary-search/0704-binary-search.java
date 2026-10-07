class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        while(low<=high){
            //compare target with midvalue
            if(nums[mid]==target){
                //target found
                return mid;
            }
            else if(target>nums[mid]){
                //go to right soide
                low = mid+1;
            }
            else{
                //target<arr[mid]
                high = mid-1;
            }
            //update mid
            mid = (low+high)/2;
        }
        return -1;
    }
}