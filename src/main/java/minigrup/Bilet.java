package minigrup;

import java.util.Scanner;

public class Bilet {


    public static void main(String[] args) {
        Scanner input =new Scanner(
                System.in
        );
        Scanner scan = new Scanner(System.in);
        System.out.println("Hosgeldiniz...");
        double kiloMetre;
        String yon;
        int yas;
        boolean karar= true;
       /* int counter=0;
        do {
        System.out.println("Lütfen kac km gideceğinizi giriniz😊;

        kiloMetre = input.nextDouble();
        if (kiloMetre<0){
            System.out.println("Km sıfırdan buyuk olmalıdır");
        }else{
            System.out.println("Km basarılı bir sekilde girilmiştir");
            counter++;
        }

        }while(counter!=0);
        */

        do {
            System.out.println("Lütfen kac km gideceğinizi giriniz😊");

                    kiloMetre = input.nextDouble();
            if (kiloMetre<0){
                System.out.println("Km sıfırdan buyuk olmalıdır");
            }else{
                System.out.println("Km basarılı bir sekilde girilmiştir");
                break;
            }

        }while(true);







        input.nextLine();
        do{
            System.out.println("Tek yon icin 1 girin. Gidis donus icin 2 Girin");
             yon = scan.nextLine();

             if(yon.equals("1")||yon.equals("2")){
                 System.out.println("Yon seciminz basarili");

                 break;
             }else{
                 System.out.println("Yanlis!!!!!!!!!!!   Tekrar girin ");
             }



        }while (true);


        do {
            System.out.println("yas indirimden faydalanmak icin lütfen yasınızı giriniz😊");
                    yas =input.nextInt();
            if (yas <0){
                System.out.println("yas sıfırdan buyuk olmalıdır");
            }else{
                System.out.println("yas basarılı bir sekilde girilmiştir");
                break;
            }

        }while(true);
        ucretHesapla(kiloMetre,yon,yas);

//        input.nextLine();
//        do {
//            System.out.println("cikmak   icin A girin .");
//              String cevap=input.nextLine();
//            if(cevap.equalsIgnoreCase("A")){
//                karar=false;
//            }
//        }while (karar);
//
//        System.out.println("cikisiniz gerceklesti");



        /*
        1- Kişi "Yolculuk Tipini" gidiş dönüş
seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

2-Yaş indirimi:
Kişi 12 yaşından küçükse bilet fiyatı üzerinden
%50 indirim uygulanır.

Kişi 12-24 yaşları arasında ise bilet fiyatı
üzerinden %10 indirim uygulanır.

Kişi 65 yaşından büyük ise bilet fiyatı üzerinden
%30 indirim uygulanır.

Mesafe başına ücret 0.1 TL / km olarak alın.
(Gidiş-Dönüş için *2)
         */


    }
    public static void ucretHesapla(double kilometre, String yon, int yas) {
        double toplamFiyatTekYon=kilometre*0.1;
        double toplamFiyatCiftYon =kilometre*0.2;

        switch (yon){

            case "1":
                toplamFiyatCiftYon=toplamFiyatCiftYon*0.8;
                if (yas<12){
                    toplamFiyatCiftYon=toplamFiyatCiftYon*0.5;
                } else if (yas<24) {
                    toplamFiyatCiftYon=toplamFiyatCiftYon*0.9;
                } else if (yas>65){
                    toplamFiyatCiftYon=toplamFiyatCiftYon*0.7;
                }else {

                }
                System.out.println("Bilet Tutarınız="+toplamFiyatCiftYon);
                break;
            case "2":
                toplamFiyatTekYon=toplamFiyatTekYon*1;
                if (yas<12){
                    toplamFiyatTekYon=toplamFiyatTekYon*0.5;
                } else if (yas<24) {
                    toplamFiyatTekYon=toplamFiyatTekYon*0.9;
                } else if (yas>65){
                    toplamFiyatTekYon=toplamFiyatTekYon*0.7;
                }else {

                }
                System.out.println("Bilet Tutarınız="+toplamFiyatTekYon);
                break;
        }



    }
}
