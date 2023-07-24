package tugas_5_operator_meivayusnita;
public class TUGAS_8_OPERATOR_MEIVAYUSNITA {
    public static void main(String[] args) {
        int laptop=7, hardisk=11, mouse = 21;
        double hargaLaptop, hargaHardisk, hargaMouse;
        hargaLaptop = 10000000;
        hargaHardisk = 1500000;
        hargaMouse = 150000;
        double total, bayar;
        
        laptop-=5;
        hardisk-=8;
        mouse-=18;
        
        total=laptop+hardisk+mouse;
        
        System.out.println("jumlah barang yang tersedia="+laptop+"+"+hardisk+"+"+mouse+"="+total);
        bayar= (total*hargaLaptop)+(total*hargaHardisk)+(total*hargaMouse);
        
        System.out.println("total aset yang dimiliki= Rp"+bayar);
    }
}
