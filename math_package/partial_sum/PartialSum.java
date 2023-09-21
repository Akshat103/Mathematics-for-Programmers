package math_package.partial_sum;
import math_package.prefix_sum.PrefixSum;
import java.util.List;

public class PartialSum {
    public int[] getPartialSum(int[] arr, List<List<Integer>> pairs){
        for (List<Integer> pair: pairs) {
            arr[pair.get(0)]+=pair.get(2);
            if(pair.get(1)+1<arr.length)
                arr[pair.get(1)+1]-=pair.get(2);
        }
        PrefixSum  prefixSum = new PrefixSum();
        int[] prefixsum = prefixSum.getPrefixSumArray(arr);
        return prefixsum;
    }
}
