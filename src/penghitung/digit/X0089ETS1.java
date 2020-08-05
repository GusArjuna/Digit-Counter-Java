// Copyright M. Taufan Ma'ruf 1461900089
package penghitung.digit;
import java.util.Scanner;
public class X0089ETS1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int digit=0;
        String bilangan;
        char[] bil=new char[30];
        System.out.print("Masukkan Bilangan : ");
        bilangan=in.nextLine();
        bil=bilangan.toCharArray();
        for(int a=0;a<bil.length;a++){
            if((bil[a]>=48)&&(bil[a]<=57)){
                digit++;
            }
        }
        System.out.println("Jumlah Digit pada "+bilangan+" ada "+digit);
    }
}// Copyright M. Taufan Ma'ruf 1461900089