class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        List<int[]> ans = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<n; i++){
            if(intervals[i][0]<=end){
                //overlaps!! so extend interval range
                end = Math.max(end, intervals[i][1]);
            }else{
                //if not overlaps, store current interval
                ans.add(new int[]{start, end});
                //assign new start,end values 
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        //adding the last iteration interval in ans
        ans.add(new int[]{start,end});

        return ans.toArray(new int[ans.size()][]);
    }
}