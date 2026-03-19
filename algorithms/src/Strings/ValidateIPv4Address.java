package Strings;

public class ValidateIPv4Address {
    public static boolean validate(String IPv4Address){

        return false;
    }
    public static boolean checkDot(String IPv4Address){
        int dotCount = 0;
        for (int check = 0; check < IPv4Address.length(); check ++){
            if (IPv4Address.charAt(check) == '.') dotCount++;
        }
        return dotCount >= 3;
    }
    private static boolean checkNumbers(String IPAddress){
        int[] arrayBoolean = new int[4];
        String number = "";
//        for (int loop = 0; loop < 4; loop++){
            for (int check = 0; check < IPAddress.length(); check++){
                if (IPAddress.charAt(check) != '.'){
                    number += IPAddress.charAt(check);
                }
                if (IPAddress.charAt(check) == '.'){
                    int tempVar = Integer.parseInt(number);
                    System.out.println(tempVar);
                }
            }
//        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(checkNumbers("125.16.100.1"));
    }
}
