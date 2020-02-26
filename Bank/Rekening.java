public class Rekening {  //buat class
    // buat atribut
    
    private String nama;
    private int noRek;
    private int saldo;

    //buat constructor tanpa parameter
    public Rekening() {
    }

    // buat constructor dengan parameter
    public Rekening(String nama, int noRek, int saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
    }

    // buat getter nama
    public String getNama() {
        return nama;
    }
    
    // buat setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //buat getter norek
    public int getNoRek() {
        return noRek;
    }
    
    // buat setter norek
    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }
    
    // buat getter saldo
    public int getSaldo() {
        return saldo;
    }
    
    //buat setter saldo
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    //buat method ambiluang
    public boolean ambilUang(int n){
        if(n > this.saldo) {
            return false;
        } else {
            this.saldo -= n ;
                    return true ;
        }
    } 
       
    // buat method simpan uang
    public boolean simpanUang(int jml){
        this.saldo += jml;
        return true ;
    }    

    //buat method toString
    @Override
    public String toString() {
        return "Rekening{" + "nama=" + nama + ", noRek=" + noRek + ", saldo=" + saldo + '}';
    }
    
    
    
}
