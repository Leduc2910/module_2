package SearchAlgorithm;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // LinearSearch
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
//        System.out.println(linearSearch(array, 7));
//        System.out.println(sentinelSearch(array, 10));
        System.out.println(binarySearch(array, 4));
    }

    public static int binarySearch(ArrayList<Integer> arr, int K) {
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr.get(mid) == K) {
                return mid;
            }
            if(arr.get(mid) < K){
                left = mid + 1;
            }
            if(arr.get(mid) > K) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(ArrayList<Integer> array, int K) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == K) {
                return i;
            }
        }
        return -1;
    }

    public static int sentinelSearch(ArrayList<Integer> array, int K) {
        int n = array.size();
        array.add(K);
        int i = 0;
        while (array.get(i) != K) {
            i++;
        }
        if (i == n) {
            return -1;
        } else {
            return i;
        }
    }
}
