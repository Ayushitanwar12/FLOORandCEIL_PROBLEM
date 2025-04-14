

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int floor = -1;
        int ceil = -1;
        
        // Iterate through the array to find the floor and ceil
        for (int i = 0; i < n; i++) {
            // Update floor if the current element is <= x and greater than the current floor
            if (a[i] <= x ) {
                floor=Math.max(floor, a[i]);
                
            }
            // Update ceil if the current element is >= x and less than the current ceil
            if (a[i] >= x && (ceil==-1||a[i] < ceil)) {
                ceil = a[i];
            }
            
        }
        
        return new int[]{floor, ceil};
    }
    
    public static void main(String[] args) {
        int[] a = { 3, 4, 4, 7, 8, 10};
        int n = a.length;
        int x = 2;
        
        int[] result = getFloorAndCeil(a, n, x);
        
        // Output the result
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }
}
