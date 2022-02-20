package b15_xu_ly_ngoai_le_and_Debug.bai_tap.su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    private String message;
    public IllegalTriangleException(String message) {
        this.message = message ;
    }

    @Override
    public String toString() {
        return message;
    }
}
