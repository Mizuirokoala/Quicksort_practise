package pl.mizuirokoala;

import algs4.edu.princeton.cs.algs4.In;
import algs4.edu.princeton.cs.algs4.StdOut;
import algs4.edu.princeton.cs.algs4.StdRandom;


public class QuickSort {
    public static void sort(Comparable[] word) {
        StdRandom.shuffle(word);
        sort(word, 0, word.length - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);

    }

    private static int partition(Comparable[] a, int lo, int hi) {

        int i=lo,j=hi+1;
        Comparable comparable=a[lo];
        while (true){
            while (lessThan(a[++i], comparable)){
                if (i==hi){
                    break;
                }
            }
            while (lessThan(comparable, a[--j])){
                if (j==lo){
                    break;
                }
            }
            if (i>=j){
                break;
            }
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }
    private static boolean lessThan(Comparable comparable, Comparable comparableAfter){
        return comparable.compareTo(comparableAfter)<0;
    }

    private static void exch(Comparable[]a,int i,int j){
        Comparable com=a[i];
        a[i]=a[j];
        a[j]=com;
    }
    private static void show(Comparable[] a){
        for (int i=0;i<a.length;i++){
            StdOut.print(a[i]+ " ");
        }
        StdOut.println();
    }
    public static boolean isSorted(Comparable[] a){
        for (int i=0;i<a.length;i++){
            if (lessThan(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[]a=new In().readAllStrings();
        sort(a);
        assert  isSorted(a);
        show(a);
    }
}
