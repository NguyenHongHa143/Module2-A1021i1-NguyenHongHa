package b2_vong_lap_trong_JaVa.bai_tap.b2;

public class hien_thi_20_SNT_dau_tien {
    public static void main(String[] args) {
        int number =2;
        int count =0;
            if (number==2){
                System.out.println(number);
                count++;
            }
            while (count<20){
                boolean check = true;
                number++;
                for (int i = 2;i<number;i++){
                    if(number%i==0){
                        check=false;
                        break;
                    }
                }
                if(check){
                    System.out.println(number);
                    count++;
                }

            }
    }
}
