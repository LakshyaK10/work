class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        int[] freq=new int[10];
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }

        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<9;k+=2){
                    freq[i]--;
                    freq[j]--;
                    freq[k]--;
                    if(freq[i]>=0 && freq[j]>=0 && freq[k]>=0){
                        count++;
                    }
                    freq[i]++;
                    freq[j]++;
                    freq[k]++;
                }
            }
        }
        return count;



    }
}