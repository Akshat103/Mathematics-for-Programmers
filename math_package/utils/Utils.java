package math_package.utils;

import java.util.Arrays;

public class Utils {
    public int trailingZerosInFactorial(int num){
        int res = 0;
        for (int i = 5; i < num; i*=5) res+=(num/i);
        return res;
    }

    public boolean powerSet(int num){
        return Math.floor(Math.log(num)/Math.log(2))==Math.ceil(Math.log(num)/Math.log(2));
    }
    
    public boolean[] sieveOfEratos(int num){
        boolean[] isPrime = new boolean[num+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i*i < num; i++)
            for (int j = 2*i; j < num; j+=i)
                isPrime[j] = false;

        return isPrime;
    }

    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
