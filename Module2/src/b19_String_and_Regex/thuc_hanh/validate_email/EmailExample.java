package b19_String_and_Regex.thuc_hanh.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
     public  boolean validate(String regex) {

        return Pattern.matches("^[A-z0-9]+[A-z0-9]*@[A-z0-9]+(\\.[A-z0-9]+)$",regex) ;
    }

        private static EmailExample emailExample;
        public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        public static void main(String args[]) {
            emailExample = new EmailExample();
            for (String email : validEmail) {
                boolean isvalid = emailExample.validate(email);
                System.out.println("Email is " + email +" is valid: "+ isvalid);
            }
            for (String email : invalidEmail) {
                boolean isvalid = emailExample.validate(email);
                System.out.println("Email is " + email +" is valid: "+ isvalid);
            }
        }
    }

