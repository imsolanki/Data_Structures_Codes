class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] charArr= strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = String.valueOf(charArr);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }else{
                List<String> list =new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}