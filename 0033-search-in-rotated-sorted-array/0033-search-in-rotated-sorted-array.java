class Solution {
    static int findPivotIndex(int[] nums) {
            int n = nums.length;
            int s = 0;
            int e = n-1;

            if(nums[s]<nums[e]){
                //no effective rotation
                return -1;
            }

            int ans = -1;

            //binary search wala logic
            while(s <= e){
                int mid = s+(e-s)/2;

                if(nums[mid] <= nums[n-1]){
                    //iska mtlb hum L2 wali line pr h
                    //answer toh L1 wali pr h
                    //iska mtlb move to L1, or left
                    e = mid - 1;
                }
                else{
                    //mid mera l1 pr hi h
                    //ans store
                    ans = mid;
                    //move to right
                    s = mid + 1;
                }
            }
            return ans;
        }

        static int binarySearch(int[] arr, int low, int high, int target) {

        // int low = 0;
        // int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = findPivotIndex(nums);

        //if pivotIndex = -1, then array is already sorted
        if(pivotIndex == -1){
            int ans = binarySearch(nums, 0, n-1, target);
            return ans;
        }
        else{
            //array is not sorted, array is rotated sorted

            //aray can be divided into l1, l2 wla logic

            //indexes for l1 wala array ka part
            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if(target >= nums[startArray1] && target <= nums[endArray1]){
                int ans = binarySearch(nums, startArray1, endArray1, target);
                return ans;
            } 

            //indexes for l2 wala array ka part
            int startArray2 = pivotIndex+1;
            int endArray2 = n-1; 
            if(target >= nums[startArray2] && target <= nums[endArray2]){
                int ans = binarySearch(nums, startArray2, endArray2, target);
                return ans;
            } 
        }
        return -1;
         
    }
}