package b2_vong_lap_trong_JaVa.bai_tap.b3;

public class hien_thi_cac_SNT_nho_hon_100 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Các số NT bé hơn 100 là: ");
        if (number==2)
            System.out.println(number);
        while (number<100){
            boolean check = true;
            number++;
            for (int i=2;i<number;i++){
                if (number%i==0){
                    check=false;
                    break;
                }
            }
            if (check)
                System.out.println(number);
        }
    }
}
