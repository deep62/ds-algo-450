package algoexpert;

import java.util.Arrays;
import java.util.List;

public class SubSequence {
    public static void main(String[] args){

        List<Integer> array = Arrays.asList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10});
        List<Integer> sequence = Arrays.asList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10, 12});
        isValidSubsequence(array,sequence);

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int subSeqIndex =0;
        for(int i=0; i< array.size(); i++)
        {
            if(subSeqIndex==sequence.size())
                break;
            if(array.get(i).equals(sequence.get(subSeqIndex)))
                subSeqIndex++;
        }
        return subSeqIndex==sequence.size()-1;
    }



}
