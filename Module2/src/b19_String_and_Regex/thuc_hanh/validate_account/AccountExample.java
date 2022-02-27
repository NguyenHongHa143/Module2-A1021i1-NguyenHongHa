package b19_String_and_Regex.thuc_hanh.validate_account;

import java.util.regex.Pattern;

public  class AccountExample {
    public static boolean validate(String regex) {
        return Pattern.matches("^[_a-z0-9]{6,}$",regex);
    }
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        for (String account : validAccount) {
            boolean isvalid = validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
    }

