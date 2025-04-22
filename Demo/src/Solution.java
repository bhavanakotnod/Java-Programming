
class Solution {
    public int reverse(int x) {
        int rev = 0;
        int rem;
        
        // Loop until x is 0
        while (x != 0) {
            rem = x % 10;         // Get the last digit of x
            rev = rev * 10 + rem; // Append the digit to rev
            x = x / 10;           // Remove the last digit from x
        }
        
        return rev;  // Return the reversed number
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.reverse(105);  // Call reverse method
        System.out.println(result);  // Print the reversed number
    }
}

