package tugas_5_operator_meivayusnita;
public class TUGAS_5_OPERATOR_MEIVAYUSNITA {
    public static void main(String[] args) {
        //barang
        int mawar=7, melati=3, matahari=5;
        double harga, total,  bayar,e;
            harga = 4500.5;      
    /*operator penugasan */  
    mawar*=3;   
    /* Operator Aritmatika */
    total=mawar+melati+matahari;
    //System.out.println("jumlah barang yang dibeli =" +total);
    System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari+"="+total);
         bayar= (total*harga);
         //total bayar  
        System.out.println("total yang dibayar = Rp"+bayar);        
    //operator pembanding
    boolean d;
    boolean h;
    boolean f;
    d=mawar>melati;
    System.out.println("mawar>melati="+d);
    h=melati>matahari;
    System.out.println("melati>matahari="+h); 
    f=matahari>melati;
    System.out.println("mawar>matahari="+f);
    
    System.out.println("peminat lebih banyak adalah MAWAR dari pada melati dan matahari");
    }
}
