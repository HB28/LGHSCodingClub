public class BinarySearch {
    public static int searchInsert(int[] nums, int target) {
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
        return l;
    }
    public static void main(String[]args)
    {
        //test
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 4;
        System.out.println(searchInsert(arr,target));
    }
}