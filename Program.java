class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x, rev = 0, rem;
        
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        
        return x == rev;
    }
}
