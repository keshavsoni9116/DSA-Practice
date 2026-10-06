class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i: s1.toCharArray()){
            count1[i - 'a']++;
        }

        for(int i = 0; i < s1.length(); i++){
            count2[s2.charAt(i) - 'a']++;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            boolean match = true;
            for(int j = 0; j < count1.length; j++){
                if(count1[j] != count2[j]){
                    match = false;
                }
            }
            if(match){
                return true;
            } else{
                count2[s2.charAt(i - s1.length()) - 'a']--;
                count2[s2.charAt(i) - 'a']++;
            }
        }
        for(int i = 0; i < count1.length; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
}