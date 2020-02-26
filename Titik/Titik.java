public class Titik {  // buat class
   // buat atribut
    private double x; 
    private double y;
    
    //buat constructor tanpa parameter
    public Titik() {
    }
    
    //buat constructor dengan parameter
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    // buat getter x
    public double getX() {
        return x;
    }
    // buat setter x
    public void setX(double x) {
        this.x = x;
    }
    //buat getter y
    public double getY() {
        return y;
    }
    
    // buat setter y
    public void setY(double y) {
        this.y = y;
    }

    
   // buat method naik gak pake return
    void naik() {
        y++ ;
    }
    //buat method turun gak pake return
    void turun (){
        y-- ;
    }
    //buat method kanan gak pake return
    void kanan(){
        x++ ;
    }
    //buat method kiri gak pake return
    void kiri() {
        x--;
    }
    //buat method njumbul gak pake return
    void njumbul(double tinggi){
        y += tinggi ;
    }
    // buat method toString
    @Override
    public String toString() {
        return "Titik{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
