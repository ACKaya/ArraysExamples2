import java.util.Arrays;
import java.util.Scanner;
public class Ornek1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi= scan.nextInt();
        int[] list = new int[]{2, 4, 3, 16, 10, 18};
        int maksimum=list[1];
        int minimum=list[1];
        Arrays.sort(list);
       for(int i:list){
           if(i<sayi){
               minimum=i;
           }
           if(i>sayi){
               maksimum=i;
               break;
           }
       }
       System.out.println("En Yakin Buyuk Sayi:"+maksimum);
       System.out.println("En Yakin Kucuk Sayi" +minimum);


        }



    }

