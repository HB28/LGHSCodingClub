def searchInsert(nums, target):
    l = 0
    r = len(nums) - 1
    while (r >= l):
        mid = int (l + (r-l)/2)
        if (target > nums[mid]):
            l = mid + 1
        elif (target < nums[mid]):
            r = mid - 1
        else:
            return mid
    return l

#test
arr = [1,2,3,4,5,6,7,8,9,10]
target = 4
print(str(searchInsert(arr,target)))
