package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerecheNumere {
    @JsonProperty("a")
    private int a;
    @JsonProperty("b")
    private int b;

    public PerecheNumere() {}
    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "a= " + a + "; b= " + b;
    }

    public boolean isFibonacci() {
        int aux;
        int x = a;
        int y = b;
        if (x < y) {
            aux=x;
            x=y;
            y=aux;
        }
        while(x>1) {
            x=x-y;
            aux=x;
            x=y;
            y=aux;
        }
        if(x==1 && y==1)
            return true;
        else return false;
    }


    public int getCMMMC() {
        int cmmdc = getCMMDC(a, b);
        return Math.abs(a * b) / cmmdc;
    }

    public static int getCMMDC(int c, int d) {
        if (d == 0)
            return c;
        else
            return getCMMDC(d, c % d);
    }

    public boolean sumaCifrelor() {
        int s1 = 0, s2 = 0, aux1 = a, aux2 = b;
        while (aux1 > 0) {
            s1 =s1+ aux1 % 10;
            aux1 /= 10;
        }
        while (aux2 > 0) {
            s2 = s2+ aux2 % 10;
            aux2 /= 10;
        }
        return s1 == s2;
    }

    public boolean nrCifrePare() {
        int s1 = 0, s2 = 0, aux1 = a, aux2 = b;
        while (aux1 > 0) {
            if (aux1 % 2 == 0)
                s1=s1+1;
            aux1 /= 10;
        }
        while (aux2 > 0) {
            if (aux2 % 2 == 0)
                s2++;
            aux2 /= 10;
        }
        return s1 == s2;
    }
}