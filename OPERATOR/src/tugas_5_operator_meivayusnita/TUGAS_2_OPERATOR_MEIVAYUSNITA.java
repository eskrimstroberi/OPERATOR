
package tugas_5_operator_meivayusnita;
public class TUGAS_2_OPERATOR_MEIVAYUSNITA {
    public static void main(String[] args) {
        
    boolean b = true;
    boolean s = false ;
    boolean z ;
    
    System.out.println("B ="+b);
    System.out.println("S="+s);    
    
    System.out.println("OPERATOR AND");    
    z = b&&b;
    System.out.println(z);
    z = b&&s;
    System.out.println(z);
    z = s&&b;
    System.out.println(z);
    z = s&&s;
    System.out.println(z);     
    
    System.out.println("OPERATOR OR");
    z = b||b;
    System.out.println(z);
    z = b||s;
    System.out.println(z);
    z = s||b;
    System.out.println(z);
    z = s||s;
    System.out.println(z);
        
    System.out.println("OPERATOR NOT");  
    z = !b;
    System.out.println(z);
    z = !s;
    System.out.println(z);
    }
}
