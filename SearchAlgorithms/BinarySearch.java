class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(r >= l){
            int mid = l + (r-l)/2;
            if(target > nums[mid]){
                l = mid + 1;
            }
            else if(target < nums[mid]){
                r = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
