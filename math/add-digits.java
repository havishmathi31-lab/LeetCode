class Solution {
    public int addDigits(int num) {
        // Outer Loop: Keep going as long as 'num' has 2 or more digits
        while (num >= 10) {
            int sum = 0;

            // Inner Loop: Pull off digits one by one until 'num' becomes 0
            while (num > 0) {
                int lastDigit = num % 10; // Get the last digit
                sum = sum + lastDigit;    // Add it to our total
                num = num / 10;           // Chop off the last digit
            }

            // Update num with the sum we just calculated
            num = sum;
        }

        return num; // Return the final single digit
    }
}