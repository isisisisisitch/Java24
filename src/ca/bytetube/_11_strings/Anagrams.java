package ca.bytetube._11_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = anagrams(strs);
        System.out.println(lists);
    }


    public static List<List<String>> anagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);//aet
            String newStr = new String(arr);

            if (map.containsKey(newStr)) {
                map.get(newStr).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);//eat
                map.put(newStr, list);// map : entry[ aet :{"eat","tea","ate"} ], entry[ant:{"tan","nat"} ],entry[abt:{"bat"} ]
            }
        }

        List<List<String>> result = new ArrayList<>();
        result.addAll(map.values());
        return result;
    }
}
