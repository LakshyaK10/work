class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int ans=0;

        while(left<=right){
            int rem=limit-people[right];
            right--;
            ans++;
            if(left<=right && rem>=people[left]){
                left++;
            }
        }
        return ans;
    }
}