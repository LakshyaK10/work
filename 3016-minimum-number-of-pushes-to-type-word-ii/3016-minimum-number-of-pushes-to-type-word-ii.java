class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }

        int ans=0;
        int count=0;
        Arrays.sort(freq);
        for(int i=25;i>=0;i--){
            if(freq[i]==0){
                break;
            }
            ans=ans+freq[i]*(count/8+1);
            count++;

        }
        return ans;
    }
}