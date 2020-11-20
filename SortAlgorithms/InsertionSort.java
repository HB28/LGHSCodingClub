public class InsertionSort
 {
    public static void main(String [] args)
    {
        int arr[] = {78, 32, 48, 1024, 69, 12, 5, 420, 2048, 5, -7};//Example array
        System.out.println();
        printArr(arr);
        insertionSort(arr);
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
    public static void insertionSort(int[] arr)
    {
        int length = arr.length;
        for(int i = 1; i < length; i ++)
        {
            int key = arr[i];
            //key - 1
            int j = i - 1;
            //j - 1
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
    }
}