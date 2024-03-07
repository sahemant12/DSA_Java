package com.Hemantsah._7.MathsForDSA;

public class _13_sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n=1000;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }

    public static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <=n ; i++) {
            for(int j=i*2; j<=n; j+=i){
                primes[j]=true;  //true means not prime
            }
        }
        for (int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
