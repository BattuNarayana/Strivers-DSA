class Solution {
    public static int[] lcmAndGcd(int a, int b) {
       // Finding GCD using an iterative approach
        int gcd = 1;
        for (int i = Math.min(a, b); i >= 1; i--) { // Iterate downwards to find GCD faster
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break; // Found GCD, exit loop early
            }
        }

        // Finding LCM using the formula (instead of brute force)
        int lcm = (a / gcd) * b; // More efficient way to compute LCM

        return new int[]{lcm, gcd}; // Return LCM first, then GCD
    }
}
