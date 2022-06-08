package algoexpert;

public class LongestPeak {

        public static int longestPeak(int[] array) {
            int i=1;
            int maxLen = 0;
            int peakLen = 0;
            while(i < array.length-1){
                boolean isPeak = array[i] > array[i-1] && array[i] > array[i+1];
                if(!isPeak){
                    i++;
                    continue;
                }
                int leftIdx = i-2;

                while(leftIdx >= 0 && array[leftIdx] < array[leftIdx+1]){
                    leftIdx--;
                }
                int rightIdx = i+2;
                while(rightIdx < array.length && array[rightIdx] < array[rightIdx-1]){
                    rightIdx++;
                }
                int currentPeakLen = rightIdx - leftIdx-1;
                if(currentPeakLen > maxLen){
                    maxLen = currentPeakLen;
                }
                i = rightIdx;
            }
            return maxLen;
        }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        longestPeak(array);
    }
    }

