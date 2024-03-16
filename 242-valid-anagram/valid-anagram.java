class Solution {
    public boolean isAnagram(String s, String t) {
                if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> stringOne = new HashMap<>();
        for(int i =0;i<s.length();i++) {
            if (stringOne.containsKey(s.charAt(i))) {
                stringOne.put(s.charAt(i), stringOne.get(s.charAt(i)) + 1);
            } else {
                stringOne.put(s.charAt(i), 1);
            }
        }

        HashMap<Character,Integer> stringTwo = new HashMap<>();
        for(int i =0;i<t.length();i++){
            if(stringTwo.containsKey(t.charAt(i))){
                stringTwo.put(t.charAt(i),stringTwo.get(t.charAt(i))+1);
            }
            else{
                stringTwo.put(t.charAt(i),1);
            }
        }

        if(stringOne.equals(stringTwo)){
            return true;
        }
        return false;
    }
}