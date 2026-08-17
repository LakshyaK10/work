// class Solution {
//     public List<Integer> findSubstring(String s, String[] words) {
//         int n=s.length();
//         int window=words[0].length()* words.length;
//         List<Integer> ans=new ArrayList<>();
//         HashMap<String, Integer> map=new HashMap<>();
//         for(String w:words){
//             map.put(w,map.getOrDefault(w,0)+1);
//         }

//         int i=0;
//         while(i+window<=n){
//             if(solve(s.substring(i,i+window), map,words[0].length())){
//                 ans.add(i);
//             }
//             i++;
//         }
//         return ans;
//     }
//     public boolean solve(String s1, HashMap<String,Integer> map, int len){
//         HashMap<String, Integer> temp=new HashMap<>(map);
        
//         for(int j=0;j<s1.length();j+=len){
//             String word=s1.substring(j,j+len);
//             if(temp.containsKey(word)){
//                 if(temp.get(word)==0){
//                     return false;
//                 }else{
//                     temp.put(word,temp.get(word)-1);
//                 }
//             }else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// class Solution {
//     public List<Integer> findSubstring(String s, String[] words) {
//         int n = s.length();
//         int wordLen = words[0].length();
//         int window = words.length * wordLen;

//         List<Integer> ans = new ArrayList<>();

//         HashMap<String, Integer> map = new HashMap<>();

//         for (String word : words) {
//             map.put(word,map.getOrDefault(word, 0) + 1);
//         }

//         int i = 0;
//         while (i+window <= n) {

//             String sub = s.substring(i, i + window);
//             if (checkSubstr(map, sub, wordLen)) {
//                 ans.add(i);
//             }
//             i++;
//         }
//         return ans;
//     }
//     public boolean checkSubstr(HashMap<String, Integer> map,String s, int wordLen) {

//         HashMap<String, Integer> temp = new HashMap<>(map);
//         for (int j = 0; j < s.length(); j += wordLen) {

//             String w = s.substring(j, j + wordLen);
//             if (temp.containsKey(w)) {

//                 temp.put(w, temp.get(w) - 1);
//                 if (temp.get(w) == -1) {
//                     return false;
//                 }

//             } else {
//                 return false;
//             }
//         }

//         return true;
//     }
// }



//CHATGPT SOLUTION
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen) {
            return ans;
        }

        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < wordLen; offset++) {

            int left = offset;
            int right = offset;

            HashMap<String, Integer> current = new HashMap<>();

            int count = 0;

            while (right + wordLen <= s.length()) {

                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (!required.containsKey(word)) {
                    current.clear();
                    count = 0;
                    left = right;
                    continue;
                }

                current.put(word, current.getOrDefault(word, 0) + 1);
                count++;

                while (current.get(word) > required.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);

                    current.put(
                        leftWord,
                        current.get(leftWord) - 1
                    );

                    left += wordLen;
                    count--;
                }

                if (count == wordCount) {
                    ans.add(left);

                    String leftWord = s.substring(left, left + wordLen);

                    current.put(
                        leftWord,
                        current.get(leftWord) - 1
                    );

                    left += wordLen;
                    count--;
                }
            }
        }

        return ans;
    }
}