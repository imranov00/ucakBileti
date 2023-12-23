import java.util.Scanner;



public class ucakbileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Mesafe (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi: \n1: Tek Yön, \n2: Gidiş-Dönüş ");
        int yolculukTipi = scanner.nextInt();


        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Giriş Yaptınız!");
            return;
        }


        double birimUcret = 0.10;
        double toplamUcret = mesafe * birimUcret;


        switch (yas) {
            case 0:
            case 1:
            case 2:
                toplamUcret *= 0.5;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                if (yolculukTipi == 2) {
                    toplamUcret *= 0.8;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                toplamUcret *= 0.9;
                break;
            default:
                if (yas >= 65) {
                    toplamUcret *= 0.7;
                }
        }


        System.out.println("Toplam Ücret: " + toplamUcret + " TL");
    }
}