class Solution {
    public boolean isAnagram(String s, String t) {
       
        if(s.length()!=t.length()){
            return false;
        }
         HashMap<Character,Integer> hash1=populateHashMap(s);
         HashMap<Character,Integer> hash2=populateHashMap(t);


       return hash1.equals(hash2);

        
    }
     public static HashMap<Character, Integer> populateHashMap(String str) {
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {                        //.toCharArray iterate c for every character in string eg-"literal"-> ['l','i','t','e','r','a','l']
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);  //.put(stores the value of character in hashmap)
        }                                                                      //.getOrdefault(get character value in string or default(0) if not found)+1
        
        return charFrequencyMap;
    }
 
}