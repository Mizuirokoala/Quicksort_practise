package pl.mizuirokoala;

public class TestQuickSort {

    public static void main(String[] args) {
       // Integer[] list = {34, 3, 53, 2, 23, 7, 14, 10};
        String[] list = {"a","q","a","da","ca","ca","qwqw","sx","sac","sa","aq","x","v","z","a"};
        Quick qs = new Quick();
        qs.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
