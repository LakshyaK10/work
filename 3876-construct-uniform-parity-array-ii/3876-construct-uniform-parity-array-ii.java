class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                odd++;
            }
        }
        if(odd==nums1.length || odd==0){
            return true;
        }
        
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            mini=Math.min(mini,nums1[i]);
        }
        if(mini%2!=0){
            return true;
        }
        return false;

        // int[] num2=new int[nums1.length];

        // for(int i=0;i<nums1.length;i++){
        //     if(nums1[i]%2!=0){
        //         nums2[i]=nums1[i];
        //     }else{
        //         for(int j=i+1;j<nums1.length;j++){
        //             if((nums1[i]-nums1[j])>=1){
        //                 nums2[i]=nums1[i];
        //             }
        //         }
        //     }
        // }


        // return false;
    }
}