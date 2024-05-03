import java.util.*;

public class Anagram {
    public static List<String> sortAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) return new ArrayList<>(); // checking for null or an empty input


        Map<String, List<String>> map = new HashMap<>(); // using hashmap to pair anagrams by sorting characters as a key
        for (String s : strs) {

            char[] characters = s.toCharArray(); // a string into a character array
            Arrays.sort(characters);

            String sorted = new String(characters); // producing a sorting string from the previous chracter array

            if (!map.containsKey(sorted)) { // as the sorted key in not in the map, add key to the new list.
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(s); // adding the string to the matching list to its sorted key.
        }


        List<String> sortedAnagrams = new ArrayList<>(); // final list for the anagrams
        for (List<String> group : map.values()) {

            Collections.sort(group);
            sortedAnagrams.addAll(group);
        }

        return sortedAnagrams;
    }

    public static void main(String[] args) {
        // Example usage
        String[] strs_names = {"waleed", "haseeb", "naveed ", "attiq", "kit", "kat"};
        List<String> result = sortAnagrams(strs_names);
        System.out.println(result);
    }
}

// time complexity is   O(n* k log k), since sorting each string requires O (k log k), placing each string in an array goes O( n * k log k).
// space complexity is O(n/k).