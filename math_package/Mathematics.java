package math_package;

import math_package.prefix_sum.PrefixSum;

import java.util.Arrays;
import java.util.List;

import math_package.partial_sum.PartialSum;

public class Mathematics {
    public static void main(String[] args) {
        // PrefixSum prefixSum = new PrefixSum();
        // int[] arr = {3,2,9,4,1,-2};
        // int[] prefixsum = prefixSum.getPrefixSumArray(arr);
        // for (int i = 0; i < prefixsum.length; i++) System.out.print(prefixsum[i]+"
        // ");
        // System.out.println();
        // int sum = prefixSum.PrefixSumRangeQueryAP(arr, 0, 2);
        // System.out.println("Sum: "+sum);
        // int sum = prefixSum.PrefixSumRangeQueryGP(arr, 2, 4, 2);
        // System.out.println("Sum: "+sum);

        PartialSum partialSum = new PartialSum();
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(2,4,1),
                Arrays.asList(1,5,3),
                Arrays.asList(0,2,2));
        int[] arr = {0,0,0,0,0,0};
        int[] partial_sum = partialSum.getPartialSum(arr, pairs);
        for (int i = 0; i < partial_sum.length; i++) {
            System.out.print(partial_sum[i]+" ");
        }
        System.out.println();
        
    }
}
