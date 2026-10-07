class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // if(strs.length == 0){
        //     return new ArrayList<>();
        // }
        // List<String> str = new ArrayList<>(List.of(strs));
        // List<List<String>> result = new ArrayList<>();

        // while(str.size() > 0){
        //     HashMap<Character, Integer> map = new HashMap<>();
        //     ArrayList<String> list = new ArrayList<>();
        //     list.add(str.get(0));
        //     for(int j = 0; j < str.get(0).length(); j++){
        //         map.put(str.get(0).charAt(j), map.getOrDefault(str.get(0).charAt(j), 0)+1);
        //     }
        //     for(int j = 1; j < str.size(); j++){
        //         if(str.get(0).length() != str.get(j).length()){
        //             continue;
        //         }
        //         HashMap<Character, Integer> temp = new HashMap<>();
        //         for(int k = 0; k < str.get(j).length(); k++){
        //             temp.put(str.get(j).charAt(k), temp.getOrDefault(str.get(j).charAt(k), 0)+1);
        //         }
        //         if(map.equals(temp)){
        //             list.add(str.get(j));
        //             str.remove(j);
        //             j--;
        //         }
        //     }
        //     result.add(list);
        // }
        // return result;

        HashMap<HashMap<Character, Integer>, ArrayList<String>> grouping = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> temp = new HashMap<>();
            for(int j = 0; j < strs[i].length(); j++){
                temp.put(strs[i].charAt(j), temp.getOrDefault(strs[i].charAt(j), 0)+1);
            }

            if(!grouping.containsKey(temp)){
                grouping.put(temp, new ArrayList());
                grouping.get(temp).add(strs[i]);
            } else if(grouping.containsKey(temp)){
                grouping.get(temp).add(strs[i]);
            }
        }

        return new ArrayList(grouping.values());
    }
}