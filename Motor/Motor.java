public class Motor {                    //nama class Motor
    private String noPlat;              //buat atribut noPlat
    private int gigi;                   //buat atribut gigi
    private int kecepatan;              //buat atribut kecepatan
                                        //biar rapi
    public Motor() {                    //buat constructor tanpa parameter
    }                                   //cosing constructor
                                        //biar rapi
    public Motor(String noPlat) {       //buat constructor dengan parameter noPlat
        this.noPlat = noPlat;           //biar kenal
    }                                   //closing constructor
    
    public Motor(String noPlat, int gigi, int kecepatan) {      //buat constructor dengan parameter noPlat, gigi, kecepatan
        this.noPlat = noPlat;           // biar kenal
        this.gigi = gigi;               // biar kenal
        this.kecepatan = kecepatan;     // biar kenal
    }                                   // closing constructor
                                        // biar rapi
    public String getNoPlat() {         // buat getter noPlat
        return noPlat;                  // mengembalikan nilai
    }                                   // closing getter
                                        // biar rapi
    public void setNoPlat(String noPlat) {  //buat setter noPlat
        this.noPlat = noPlat;               //biar kenal
    }                                       // closing
                                            // biar rapi
    public int getGigi() {                  // buat getter
        return gigi;                        // mengembalikan nilai
    }                                       // closing
                                            // biar rapi
    public void setGigi(int gigi) {         // 
        this.gigi = gigi;
    }
    // membuat getter kecepatan
    public int getKecepatan() {
        return kecepatan;
    }
    // membuat setter kecepatan
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // membuat method toString
    @Override
    public String toString() {
        return "Motor{" + "noPlat=" + noPlat + ", gigi=" + gigi + ", kecepatan=" + kecepatan + '}';
    }
    
    // melakukan method gas
    void gas(int n){
        kecepatan += n ;
    }
    
    // melakukan method mengerem
    public int rem(int n){
        if (n > this.kecepatan) {
            return kecepatan ;
        } else {
            this.kecepatan -= n ;
            return kecepatan ;
        }
    }
    // melakukan method menaikan gigi 
    public int naikanGigi() {
        if (kecepatan == 0 && gigi== 4) {
            gigi = 0 ;
            return gigi ;
        } else if (kecepatan > 0 && gigi == 4) {
         
            return gigi;
        } else{
            gigi ++  ;
            return gigi;
        }
    }
    // melakukan method turun gigi
    public int turunkanGigi(){
        if(kecepatan == 0 && gigi == 0 ) {
           gigi = 4 ;
           return gigi;
        } else {
            gigi-- ;
            return gigi;
        }
    }  
}
