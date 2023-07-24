
package tugas_5_operator_meivayusnita;

public class TUGAS_7_OPERATOR_MEIVAYUSNITA {
    public static void main(String[] args) {
        
        int a = 60;    
        int b = 13;    
        System.out.println("nilai a="+a);
        System.out.println("nilai b="+b);
        
        
        ++a;
        ++b;
        System.out.println("nilai a kedua="+a);
        System.out.println("nilai b kedua="+b);
        
        int hasilA=a++;
        int hasilB=--b;
        System.out.println("nilai hasilA="+hasilA);
        System.out.println("nilai hasilB="+hasilB);
        
        hasilA= a++;
        hasilB=--b;
        System.out.println("nilai a ketiga="+a);
        System.out.println("nilai b ketiga="+b);
        System.out.println("nilai hasilA kedua="+hasilA);
        System.out.println("nilai hasilB kedua="+hasilB);

    }
}
