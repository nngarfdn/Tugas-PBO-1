public class Main {                                 // nama class untuk menjalankan
    public static void main(String[] args) {        // set class menjadi main
        Motor bebek = new Motor("Motor Bebek");     // membuat object
        bebek.naikanGigi();                         // menaikan gigi
        System.out.println(bebek);                  // mengecek apakah gigi sudah naik
        bebek.gas(20);                              // menambah kecepatan motor
        System.out.println(bebek);                  // cek kecepatan
        bebek.rem(10);                              // melakukan rem
        System.out.println(bebek);                  // ngecek
        bebek.naikanGigi();                         // naik gigi
        System.out.println(bebek);                  // ngecek
        bebek.turunkanGigi();                       // turun gigi
        System.out.println(bebek);                  // ngecek lagi
    }                                               // closing public void
}                                                   // closing class
