class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pToS = new HashMap<>();
        HashMap<String, Character> sToP = new HashMap<>();
        String[] words = s.split("\\s+");

        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(pToS.containsKey(ch) && !(pToS.get(ch).equals(words[i]))){
                return false;
            } else if(sToP.containsKey(words[i]) && sToP.get(words[i]) != ch){
                return false;
            }

            pToS.put(ch, words[i]);
            sToP.put(words[i], ch);
        }
        return true;
    }
}