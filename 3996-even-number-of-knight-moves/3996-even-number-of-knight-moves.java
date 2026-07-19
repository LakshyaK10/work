class Solution {
    public boolean canReach(int[] start, int[] target) {
        int i1=start[0];
        int j1=start[1];

        int i2=target[0];
        int j2=target[1];

        return ((i1+j1)%2==(i2+j2)%2);
    }
}