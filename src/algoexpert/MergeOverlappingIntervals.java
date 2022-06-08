package algoexpert;

import java.util.*;

class MergeOverlappingIntervals {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals,(int[]a,int[]b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals = new ArrayList<int[]>();
        int[] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);

        for(int[] nextInterval : sortedIntervals){
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart = nextInterval[0];
            int nextIntervalEnd = nextInterval[1];
            if(currentIntervalEnd >= nextIntervalStart){
                currentInterval[1] = Math.max(currentIntervalEnd,nextIntervalEnd);
            }else{
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);

    }

    public static void main(String[] args) {

        int[][] arr = { { 3, 5 },{ 1, 2 },{4,7},{6,8},{9,10} };
        arr = mergeOverlappingIntervals(arr);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);

    }
}