import java.util.InputMismatchException;
import java.util.Scanner;

public class Pembayaran extends Laundry implements iDataPembayaran{
    String jenisProduk;
    String kodeProduk;
    int jumlahKain;
    int kuantitas = 5000;
    int totalPembayaran;
    boolean input = true;
    Scanner scanner = new Scanner(System.in);

    Pembayaran(String namaLaundry, String kasir){
        super(namaLaundry, kasir);
    }

    public void inputPerhitungan(){

        System.out.println("Kode Pakaian : ");
        kodeProduk = scanner.nextLine();
        System.out.println("Nama Produk : ");
        jenisProduk = scanner.nextLine();

        do {
            try {
                System.out.print("Jumlah kain  : ");
                jumlahKain = scanner.nextInt();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("bukanlah angka, coba lagi");
                scanner.next();
            }
        } while (input);

        // Menghitung total bayar
        totalPembayaran = jumlahKain * kuantitas;
        scanner.close();
    }

    public void displayDataPembayaran(){
        System.out.println("===================");
        System.out.println("TOTAL BAYAR = " + totalPembayaran);
        System.out.println("===================");
    }

}
