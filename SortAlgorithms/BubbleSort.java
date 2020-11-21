public class BubbleSort {
    public static void main (String[]args)
    {
        int arr[] = {78, 32, 48, 1024, 69, 12, 5, 420, 2048, 5, -7};//Example array
        System.out.println();
        printArr(arr);
        bubbleSort(arr);
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
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i ++)
        {
            for (int j = 0; j < n - i - 1; j ++)
            {
                if (arr [j]> arr [j + 1])
                {
                    int temp = arr[j];
                    arr [j] = arr [j + 1];
                    arr [j + 1] = temp;
                }
            }
        }
    }
}