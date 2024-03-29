class Solution {
    public boolean isAnagram(String s, String t) {
                if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }

        }
        System.out.println(map);
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) - 1);
            }

        }
        System.out.println(map);
        for (Character key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        
        return true;
    }
}