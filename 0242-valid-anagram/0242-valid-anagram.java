class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for(int i =0;i<s.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
        System.out.println(map);
        int count=0;
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            char key = (char) m.getKey();
            int value =(int)m.getValue();
            if(value != 0){
                count =count+1;
            }
        }
        System.out.println(map);
        return count == 0;      
    }
}