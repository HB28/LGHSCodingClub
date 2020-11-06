public class SelectionSort
{
    public static void main(String [] args)
    {
        int arr[] = {78, 32, 48, 1024, 69, 12, 5, 420, 2048, 5, -7};//Example array
        System.out.println();
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
    public static void printArr(int[] arr)
    {
        System.out.print("[");
        for(int i = 0; i < arr.length; i ++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void selectionSort(int[]arr)
    {
        for(int i = 0; i < arr.length - 1; i ++)
        {
            int lowIndex = i;
            for(int n = i + 1; n < arr.length; n ++)
            {
                if(arr[n] < arr[lowIndex])
                {
                    lowIndex = n;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowIndex];
            arr[lowIndex] = temp;
        }
    }
}
