package tugas_5_operator_meivayusnita;
public class TUGAS_4_OPERATOR_MEIVAYUSNITA {
    public static void main(String[] args) {
        int mawar=10, melati=2;
        double harga;
        harga = 4500.5;
        double total, bayar;
        
        /*operator penugasan*/
        melati+=2;
        /* Operator Aritmatika */
        total=mawar+melati;
        bayar=total*harga;
        
        System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"="+total);
        System.out.println("total yang dibayar  = Rp"+bayar);        
    }
    

}
