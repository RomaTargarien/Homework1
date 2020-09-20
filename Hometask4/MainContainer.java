package Hometask4;

import java.util.Arrays;

public class MainContainer {
    public static void main(String[] args) {
        DataContainer<Integer> dataContainer = new DataContainer<>();
        dataContainer.data = new Integer[]{1,2,3,8,9,4};
        System.out.println(dataContainer.add(90));
        System.out.println(dataContainer.get(0));
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println(dataContainer.deleteIndex(6));
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println(dataContainer.deleteItem(8));
        System.out.println(Arrays.toString(dataContainer.getItems()));

        dataContainer.sort(dataContainer);
        System.out.println(Arrays.toString(dataContainer.getItems()));

        dataContainer.data = new Integer[]{null,1,3,null,null,5,null,9};
        System.out.println(dataContainer.toString());
    }
}
