package Hometask4;

import java.util.Arrays;

public class MainContainer {
    public static void main(String[] args) {
        DataContainer<Integer> dataContainer = new DataContainer<>();
        dataContainer.data = new Integer[]{1,2,3,8,9,4};
        System.out.println(dataContainer.add(90));
        System.out.println(dataContainer.get(0));
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println(dataContainer.delete(6));
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println(dataContainer.delete(Integer.valueOf(8)));
        System.out.println(Arrays.toString(dataContainer.getItems()));

        dataContainer.sort(dataContainer);
        System.out.println(Arrays.toString(dataContainer.getItems()));

        dataContainer.data = new Integer[]{null,1,3,null,null,null,5,null,9,null};
        System.out.println(dataContainer.toString());

        DataContainer<String> dataContainer1 = new DataContainer<>();
        dataContainer1.data = new String[]{"Рома", "Полина", "Никита"};
        System.out.println(dataContainer1.add("Паша"));
        System.out.println(dataContainer1.get(0));
        System.out.println(Arrays.toString(dataContainer1.getItems()));
        System.out.println(dataContainer1.delete(2));
        System.out.println(Arrays.toString(dataContainer1.getItems()));
        System.out.println(dataContainer1.delete("Рома"));
        System.out.println(Arrays.toString(dataContainer1.getItems()));
        dataContainer1.sort(dataContainer1);
        System.out.println(Arrays.toString(dataContainer1.getItems()));
        dataContainer1.add(null);
        System.out.println(dataContainer1.toString());
    }
}
