class Solution {
    public int partitionString(String s) {
        HashSet<Character> set=new HashSet<>();
        int count=1;
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (set.contains(c)) {
                count++;
                set.clear();
            }

            set.add(c);
        }

        return count;
    }
}