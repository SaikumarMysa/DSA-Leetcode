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

            swap(arr, i, j);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int nums[], int low, int high){
        if(low<high){
            int p = partition(nums, low, high);
            quickSort(nums, low, p);
            quickSort(nums, p+1, high);
        }
    }
    public int maximumGap(int[] nums) {
        int n = nums.length;

        if(n<2) return 0;

        int high = n-1;

        quickSort(nums, 0, high); // 1 3 6 9 

        int max = -1;
        for(int i=1; i<n; i++){
            max = Math.max(max, nums[i]-nums[i-1]);
        }
     return max;
    }
}