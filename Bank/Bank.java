public class Bank {     //nama class
    public static void main(String[] args){ //set pain
        Rekening r1 = new Rekening("Rudi", 122, 300000); //membuat objek
        System.out.println(r1.ambilUang(100000));     // ambil uang
        System.out.println(r1);           //cek
        System.out.println(r1.simpanUang(50000));   //simpan uang
        System.out.println(r1); //cek
        System.out.println(r1.ambilUang(800000)); // ambil uang
        System.out.println(r1);         //cek
        System.out.println(r1.getNama());      //cetak nama
        System.out.println(r1);     //cek
        
    }
}
