import java.sql.*;

public class LaundryApp{
    public static void main(String []args){
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            Statement myStatement = myConn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery("select * from employees");

            while (myResultSet.next()) {
                System.out.println(myResultSet.getString("Username")+ ","+myResultSet.getString("Password"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        Pelanggan pelanggan = new Pelanggan("", "", "LaundryKita", "");
        pelanggan.displayLaundryInfo();
        System.out.println("-----DATA PELANGGAN-----");

        pelanggan.inputPelangganData();

        Pembayaran pembayaran = new Pembayaran("SuperMart", "John");
        System.out.println("--DATA PEMBELIAN LAUNDRY-");
        pembayaran.inputPerhitungan();

        pembayaran.displayDataPembayaran();
    }
}