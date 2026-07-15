class Solution {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low-1;
        int j= high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }
            swap(arr,i,j);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] nums, int low, int high){
        if(low<high){
            int p = partition(nums, low, high);
            quickSort(nums, low, p);
            quickSort(nums, p+1, high);
        }
    }

    public int[] sortArray(int[] nums) {

        quickSort(nums, 0, nums.length-1);
        return nums;
    }
}