package Hometask5;

import java.util.*;

public class Mapka {
    public Map<String, Integer> go(String[] text, int num){
        Map<String, Integer> map = new HashMap<>();
        Set<String> warSet = new TreeSet<>(Arrays.asList(text));
        List<String> warCopy = new ArrayList<>(warSet);
        for (String s : warCopy) {
            int count = 0;
            for (String word : text) {
                if (s.equals(word)) {
                    count++;
                }
            }
            map.put(s, count);
        }
        Map<String, Integer> copy = new HashMap<>();
        int i = 0;
        for(Map.Entry<String, Integer> entry: sortByValues(map).entrySet()) {
            if (i == num){
                break;
            }
            String key = entry.getKey();
            Integer value = entry.getValue();
            copy.put(key,value);
            i++;
        }
        return sortByValues(copy);
    }
    public static <K, V extends Comparable<V>> Map<K, V> sortByValues( Map<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}
