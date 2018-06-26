import java.util.*;

class MinMax {
    public static int[] minMax(int[] arr) {
         Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
     public static int[] minMax_second(int[] arr) {
       return new int[]{Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }
}
