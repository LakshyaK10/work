class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=s.length();
        int[] last=new int[26];
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
        }

        int start=0;
        int end=0;
        int count=0;

        for(int i=0;i<n;i++){
            end=Math.max(end,last[s.charAt(i)-'a']);

            if(i==end){
                ans.add(end-start+1);
                start=end+1;
            }
        }
        return ans;
    }
}