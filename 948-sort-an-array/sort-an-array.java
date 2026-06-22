class Solution {
    //Divide
    public void divide(int[] arr, int si, int ei){
        //Base condition:
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    //Conquer
    public void conquer(int[] arr, int si, int mid, int ei){
    int idx1 = si;
    int idx2 = mid+1;
    int x =0;
    int merged[] = new int[ei-si+1];

    while(idx1<=mid && idx2<=ei){
        if(arr[idx1]<arr[idx2]){
            merged[x++]=arr[idx1++];
        }else{
            merged[x++]=arr[idx2++];
        }
    }
    while(idx1<=mid){
        merged[x++]=arr[idx1++];
    } 
    while(idx2<=ei){
        merged[x++]=arr[idx2++];
    }
    for(int i=0,j=si;i<merged.length;i++,j++){
        arr[j]=merged[i];
    }
}

    public int[] sortArray(int[] nums) {
        int si = 0;
        int ei = nums.length-1;
        divide(nums, si, ei);
    return nums;
    }
}
