import java.util.HashMap;

public class Collection {
     public static int subArraySize(int[] arr, int M,int N){

         int maxUnique = 0;

         // Generate all subArrays of size M
         for (int i = 0; i < N - M; i++) {
             int currentUnique = 0;

             HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

             for (int k = i; k < i + M; k++) {

                 // if the key is new to the map,
                 // push the key in map and increment
                 // count for unique number
                 if (!map.containsKey(arr[k])) {
                     map.put(arr[i], 1);
                     currentUnique++;
                     continue;
                 }
             }

             if (currentUnique > maxUnique)
                 maxUnique = currentUnique;
         }

         return maxUnique;
     }
}
