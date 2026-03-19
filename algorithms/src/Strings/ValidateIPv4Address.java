package Strings;

import java.util.ArrayList;

public class ValidateIPv4Address {
    public static boolean validate(String IPv4Address){
        boolean finalResult = false;
        if (checkDot(IPv4Address)){
            finalResult = checkNumbers(IPv4Address);
            return finalResult;
        }
        return false;
    }
    private static boolean checkDot(String IPv4Address){
        int dotCount = 0;
        for (int check = 0; check < IPv4Address.length(); check ++){
            if (IPv4Address.charAt(check) == '.') dotCount++;
        }
        return dotCount >= 3;
    }
    private static boolean checkNumbers(String IPAddress){
        ArrayList<Boolean> arrayBoolean = new ArrayList<>(); boolean finalResult = true;
        String number = "";
        for (int check = 0; check < IPAddress.length(); check++){
            if (IPAddress.charAt(check) != '.'){
                number += IPAddress.charAt(check);
            }
            else{
                if (Integer.parseInt(number) >= 0 && Integer.parseInt(number) <= 255)
                    arrayBoolean.add(true);
                else arrayBoolean.add(false);
                number = "";
            }
        }
        number="";
        for (int check = IPAddress.length()-1; check >= 0; check--){
            if(IPAddress.charAt(check) != '.') {
                number += IPAddress.charAt(check);
            }else break;
        }
        String tempVar = number; number = "";
        for (int reverse = tempVar.length()-1; reverse >= 0; reverse--){
            number += tempVar.charAt(reverse);
        }
        if (Integer.parseInt(number) >= 0 && Integer.parseInt(number) <= 255) arrayBoolean.add(true);
        else arrayBoolean.add(false);
        for (boolean option: arrayBoolean){
            if (!option) {
                finalResult = false;
                break;
            }
        }
        return finalResult;
    }
}
