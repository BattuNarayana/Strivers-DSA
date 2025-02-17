class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int c = b;
        int d = a;
        // Find GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Calculate LCM using the formula
        int lcm = (d * c) / a;

        // Return both GCD and LCM in an array
        return new int[] { lcm,a };
    }
}
