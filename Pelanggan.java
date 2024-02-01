import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
//Buat program penjualan Laundry dengan bayaran per kain bukan perkilo
public class Pelanggan extends Laundry implements iPelangganData{
    String nama;
    String alamat;
    Scanner scanner = new Scanner(System.in);

    //Buat constructor untuk mengisi nama pelanggan, alamat pelanggan, dan berapa kain yang ia bayar
    Pelanggan(String nama, String alamat, String namaLaundry, String kasir){
        super(namaLaundry, kasir);
        this.nama = nama;
        this.alamat = alamat;
    }

    @Override
    public void inputPelangganData(){
        System.out.println("Nama Pelanggan : " + this.nama);
        nama = scanner.nextLine();
        System.out.println("Alamat \t: " + this.alamat);
        alamat = scanner.nextLine();
    }

    private void displayWaktu(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm;ss");
        String currentDateandTime = dateFormat.format(new Date());
        System.out.println("\nLogin pada : " + currentDateandTime);
    }

}
