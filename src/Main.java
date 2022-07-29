import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, maks = 0, min = 0;

        int[] dizi = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(dizi);

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        sayi = scan.nextInt();
        System.out.println();

        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("********************************");
        System.out.println("Girilen Sayi : " + sayi);

        for (int i = 0; i < dizi.length; i++)
        {
            if (sayi == dizi[dizi.length - 8])
            {
                System.out.println("Girilen Sayidan Kucuk Sayi Yoktur.");
                System.out.println("Girilen Sayidan Buyuk Ilk Sayi : " + dizi[1]);
                break;
            }
            if (sayi < dizi[0])
            {
                System.out.println("Girilen Sayidan Kucuk Sayi Yoktur.");
                System.out.println("Girilen Sayidan Buyuk Ilk Sayi : " + dizi[1]);
                break;
            }
            if (sayi > dizi[dizi.length - 1])
            {
                System.out.println("Girilen Sayidan Kucuk Ilk Sayi : " + (dizi[dizi.length-1]));
                System.out.println("Girilen Sayidan Buyuk Sayi Yoktur.");
                break;
            }
            if (sayi == dizi[dizi.length -1])
            {
                System.out.println("Girilen Sayidan Kucuk Ilk Sayi : " + (dizi[dizi.length-2]));
                System.out.println("Girilen Sayidan Buyuk Sayi Yoktur.");
                break;
            }
            if (sayi == dizi[i])
            {
                System.out.println("Girilen Sayidan Kucuk Ilk Sayi : " + dizi[i-1]);
                System.out.println("Girilen Sayidan Buyuk Ilk Sayi : " + dizi[i+1]);
                break;
            }
            if (sayi < dizi[i])
            {
                System.out.println("Girilen Sayidan Kucuk Ilk Sayi : " + dizi[i-1]);
                System.out.println("Girilen Sayidan Buyuk Ilk Sayi : " + dizi[i]);
                break;
            }

        }

        System.out.println("====================================");
        System.out.println("\t\t\t\tEK");

        int enKucuktenBirBuyuk = dizi[1];
        int enBuyuktenBirKucuk = dizi[dizi.length - 2];

        System.out.println("En Kucuk Sayiya En Yakin Sayi : " + enKucuktenBirBuyuk);
        System.out.println("En Buyuk Sayiya En Yakin Sayi : " + enBuyuktenBirKucuk);
    }
}
