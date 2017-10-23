/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MillerRobin;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Lety
 */
public class MRValidacion {

    public String resultado = null;

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String res) {
        this.resultado = res;
    }

    /**
     * Checar si es primo o no *
     */
    public boolean isPrime(long n, int iteration, long a) {
        /**
         * base case *
         */
        if (n == 0 || n == 1) {
            return false;
        }
        /**
         * base case - 2 is prime *
         */
        if (n == 2) {
            return true;
        }
        /**
         * an even number other than 2 is composite *
         */
        if (n % 2 == 0) {
            return false;
        }

        long s = n - 1;
        while (s % 2 == 0) {
            s /= 2;
        }

        Random rand = new Random();
        for (int i = 0; i < iteration; i++) {
            long r = Math.abs(rand.nextLong());
            //long a = r % (n - 1) + 1;
            long temp = s;
            long mod = modPow(a, temp, n);
            while (temp != n - 1 && mod != 1 && mod != n - 1) {
                mod = mulMod(mod, mod, n);
                temp *= 2;
            }

            if (mod != n - 1 && temp % 2 == 0) {
                resultado = "n = " + n
                        + "\nn-1 = " + (n - 1)
                        + "\nk = " + iteration
                        + "\nm = " + s
                        + "\na = " + a
                        + "\nb = " + a + "^" + s + " modulo " + n
                        + "\nb = " + mod;
                return false;
            }
            resultado = "n = " + n
                    + "\nn-1 = " + (n - 1)
                    + "\nk = " + iteration
                    + "\nm = " + s
                    + "\na = " + a
                    + "\nb = " + a + "^" + s + " modulo " + n
                    + "\nb = " + mod;
        }

        return true;
    }

    /**
     * Funcion a calcular (a ^ b) % c *
     */
    public long modPow(long a, long b, long c) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
            res %= c;
        }
        return res % c;
    }

    /**
     * Funcion a calcular (a * b) % c *
     */
    public long mulMod(long a, long b, long mod) {
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).longValue();
    }

}
