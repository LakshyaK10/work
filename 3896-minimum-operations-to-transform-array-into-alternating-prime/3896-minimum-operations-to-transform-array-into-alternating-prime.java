class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                int x = nums[i];

                while (!isPrime(x)) {
                    x++;
                    ans++;
                }
            } else {
                int x = nums[i];
                while (isPrime(x)) {
                    x++;
                    ans++;
                }
            }
        }
        return ans;
    }
    public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}