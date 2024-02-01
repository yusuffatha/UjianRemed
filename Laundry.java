import java.util.Scanner;

abstract class Laundry {
    String namaLaundry;
    String Kasir;
    Scanner scan = new Scanner(System.in); 

    Laundry(String nama, String kasir){
        namaLaundry = nama;
        Kasir = kasir;
    }

    void displayLaundryInfo(){
        System.out.println("--------LAUNDRY KITA--------");
        System.out.println("=====================");
        System.out.println("Kasir : ");
        Kasir = scan.nextLine();
        System.out.println("=====================");
    }
}
