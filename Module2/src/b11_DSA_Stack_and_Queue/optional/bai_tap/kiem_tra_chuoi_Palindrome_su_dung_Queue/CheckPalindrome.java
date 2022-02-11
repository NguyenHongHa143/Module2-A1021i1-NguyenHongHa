package b11_DSA_Stack_and_Queue.optional.bai_tap.kiem_tra_chuoi_Palindrome_su_dung_Queue;

import java.util.*;

public class CheckPalindrome {
    public static void checkPalindrome(String[] string){
        Queue<String> queueStrings = new LinkedList<>();
        Stack<String> stackStrings = new Stack<>();
        for (String s:string){
            queueStrings.add(s);
            stackStrings.add(s);
        }
        int count =0;
        while (!stackStrings.isEmpty()){
            if (stackStrings.peek().equals(queueStrings.peek())){
                stackStrings.pop();
                queueStrings.remove();
                count++;
            }
            else break;
        }
        if (count==string.length){
            System.out.println("It is Palindrome!!");
        }else {
            System.out.println("It is not Palindrome!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can kiem tra: ");
        String s = sc.nextLine();
        s = s.toLowerCase(Locale.ROOT);
        String[] sm = s.split("");
        checkPalindrome(sm);
    }
}

