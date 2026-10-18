class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] arr=new int[n][3];

        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=sum(nums[i]);
            arr[i][2]=i;
        }

        Arrays.sort(arr,(a,b)-> {
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }else{
                return a[0]-b[0];
            }
        });

        boolean[] vis=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i][2]==i){
                continue;
            }

            int size=0;
            int temp=i;
            while(!vis[temp]){
                vis[temp]=true;
                temp=arr[temp][2];
                size++;
            }

            if(size>1){
                count+=size-1;
            }
        }
        return count;

    }
    public int sum(int n){
        int total=0;
        while(n>0){
            total+=n%10;
            n/=10;
        }
        return total;
    }
}