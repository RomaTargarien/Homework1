package Hometask1;

public class Task6 {
    public static void main(String[] args) {
        int[] phonenumber = new int[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(phonenumber));

    }
    public static String createPhoneNumber(int[] massiv){
        String phone = "";
        for (int i = 0; i < 3; i++){
            phone += massiv[i];
        }
        phone = "(" + phone + ") ";
        for (int i = 3; i < 6; i++){
            phone += massiv[i];
        }
        phone = phone + "-";
        for (int i = 6; i < massiv.length; i++){
            phone += massiv[i];
        }
        return phone;
    }
}
