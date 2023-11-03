package tesss;

import java.util.Scanner;

public class AOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while (true){
        System.out.println();
        System.out.println("Pilihlah Konversi yang diinginkan");
        System.out.println( "1. Biner ke Desimal\n" +
                            "2. Desimal ke Biner\n" +
                            "3. Biner ke Hexa\n" +
                            "4. Hexa ke Biner\n" +
                            "5. Desimal ke Hexa\n" +
                            "6. Hexa ke Desimal\n" +
                            "0. Keluar Program");

        String pilihan = sc.next();
        switch(pilihan){
            case ("1"):{
                try{
                    System.out.print("Masukkan Angka Biner : ");
                    String Biner = sc.next();
                    int desimal = Integer.parseInt(Biner,2);
                    System.out.println("Angka Binernya adalah : " + desimal);
                }catch (Exception e){
                    System.out.println("Silahkan masukkan angka yang tepat");
                }
                break;
            }case("2"):{
                try {
                    System.out.print("Masukkan angka desimal : ");
                    String des = sc.next();
                    des = des.replaceAll(" ", "");
                    int decimal = Integer.parseInt(des);
                    String binary = Integer.toBinaryString(decimal);
                    binary = binary.replaceAll(" ", "0"); 
                    System.out.println("Angka Binernya adalah : " + binary);
                }catch (Exception e) {
                    System.out.println("Silahkan masukkan angka yang tepat");
                }break;
            }case ("3"):{
                try{
                    System.out.print("Masukkan Angka Biner : ");
                    String desimal = sc.next();
                    int dec = Integer.parseInt(desimal, 2);
                    System.out.println("Angka Hexadesimalnya adalah : " + Integer.toHexString(dec));
                }catch (Exception e){
                    System.out.println("Silahkan masukkan angka yang tepat");
                }break;
            }case ("4"): {
                try {
                    System.out.print("Masukkan angka hexadesimal : ");
                    String angka = sc.next();
                    angka = angka.replaceAll(" ", "");
                    int d = Integer.parseInt(angka, 16);
                    String x = String.format("%" + (angka.length() * 4) + "s", Integer.toBinaryString(d)).replace(' ', '0');
                    System.out.println("Angka Binernya adalah : " + x);
                }catch (Exception e) {
                    System.out.println("Silahkan masukkan angka yang tepat");
                }break;
            }case ("5"):{
                try{
                    System.out.print("Masukkan angka desimal : ");
                    int x = sc.nextInt();
                    System.out.println("Angka Hexadesimalnya adalah : " + Integer.toHexString(x));
                }catch (Exception e){
                    System.out.println("Silahkan masukkan angka yang tepat");
                }break;
            }case ("6"):{
                try{
                    System.out.print("Masukkan angka hexadesimal : ");
                    String c = sc.next();
                    int d = Integer.parseInt(c, 16);
                    System.out.println("Angka Desimalnya adalah : " + d);
                }catch (Exception e){
                    System.out.println("Silahkan masukkan angka yang tepat");
                }break;
            }case ("0"):{
                System.out.println();
                System.out.println("Sampai Jumpa!");
            }   System.exit(0);
            default : 
                System.out.println("Silahkan Masukkan Angka Yang Tepat!");
                System.out.println();
            }
        }
    }
}
