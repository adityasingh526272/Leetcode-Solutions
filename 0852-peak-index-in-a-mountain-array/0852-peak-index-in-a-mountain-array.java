class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s+ (e-s)/2;

            if(arr[mid] < arr[mid+1]){
                //main ascending order wale part me hu
                //iska mtlb main left part me hu
                //or mujhe pata h answer right me h
                //toh fatafat right part me move kro
                s = mid + 1;
            }
            else{
                //arr[mid] >= arr[mid+1]
                //iska mtlb main right part me hu
                //iska mtlb mai ek potential solution pe khada hu
                ans = mid;
                //now i have to find the final solution
                //mujhe pata h right part wala descending order h
                //toh bada number agr exist krta h toh pakka left me hi milega
                //left me move kro
                e = mid-1;
            }
        }
        return ans;
    }
}