package math_package.prefix_sum;

public class PrefixSum {

    public int[] getPrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public int PrefixSumRangeQueryAP(int[] arr, int l, int r) {
        int[] b = new int[arr.length];
        b[0] = 0;
        for (int i = 1; i < b.length; i++) {
            b[i] = arr[i] * i;
            b[i] = b[i - 1] + b[i];
        }
        int[] prefixSum = getPrefixSumArray(arr);
        int res;
        if (l != 0)
            res = (b[r] - b[l - 1]) + ((1 - l) * (prefixSum[r] - prefixSum[l - 1]));
        else
            res = (b[r]) + (prefixSum[r]);
        return res;
    }

    public int PrefixSumRangeQueryGP(int[] arr, int l, int r, int k) {
        int[] b = new int[arr.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i] * ((int) (Math.pow(k, i)));
        }

        int[] prefixsum = getPrefixSumArray(b);
        int res;
        
        if (l != 0)
            res = (int) ((Math.pow(k, -l)) * (prefixsum[r] - prefixsum[l - 1]));
        else
            res = (int) ((Math.pow(k, -l)) * prefixsum[r]);

        return res;
    }

}
