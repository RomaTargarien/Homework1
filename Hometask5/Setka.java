package Hometask5;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Setka {
    public Set<String> go(String[] text){
        Set<String> warSet = new TreeSet<>(Arrays.asList(text));
        return warSet;
  }
}
