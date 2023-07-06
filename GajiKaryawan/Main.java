//Hernan Yudistira 227064516003
//Nur Setiaji Ramadhani 227064516018
package GajiKaryawan;
  class Karyawan {
     String NIP;
     String nama;
     String jenisKelamin;
     int jumlahHari;
     int totalGaji;
     
     void karyawan(){
         System.out.println("NIP\t\t\t: " + NIP);
         System.out.println("Nama\t\t\t: " + nama);
         System.out.println("Jenis Kelamin\t\t: " + jenisKelamin);   }
     
     void absenKerja(){
         System.out.println("Jumlah Hari Kerja\t: " + jumlahHari); }
     
     void hitungGaji(){
         System.out.println("Total Gaji\t\t: Rp." + (jumlahHari*50000));  }
}

  class Dosen extends Karyawan{
            String golongan;
            int jumlah_sks;
            int upah_per_sks;
          
      void hitungGaji(){
        System.out.println("Total Gaji\t\t: Rp." + 
                (upah_per_sks*jumlah_sks*jumlahHari));}
 }
 class Staff extends Karyawan{   
 } 



public class Main {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        karyawan1.NIP = "227064516003";
        karyawan1.nama = "Hernan";
        karyawan1.jenisKelamin = "Laki - Laki";
        karyawan1.jumlahHari = 17;
        karyawan1.karyawan();
        karyawan1.absenKerja();
        karyawan1.hitungGaji();    System.out.println();
        
        Dosen dosen1 = new Dosen();
        dosen1.NIP = "227064516018";
        dosen1.nama = "Nursetiaji";
        dosen1.jenisKelamin = "Laki - Laki";
        dosen1.jumlahHari = 15;
        dosen1.golongan = "2I";
        dosen1.jumlah_sks = 4;
        dosen1.upah_per_sks = 200000;
        dosen1.karyawan();
        dosen1.absenKerja();
        dosen1.hitungGaji();        System.out.println();
        
        Staff staff1 = new Staff();
        staff1.NIP = "227064516000";
        staff1.nama = "Violet";
        staff1.jenisKelamin = "Perempuan";
        staff1.jumlahHari = 20;
        staff1.karyawan();
        staff1.absenKerja();
        staff1.hitungGaji();    System.out.println(); 
    } 
}












