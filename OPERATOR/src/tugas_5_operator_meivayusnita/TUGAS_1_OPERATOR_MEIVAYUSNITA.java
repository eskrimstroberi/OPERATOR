package tugas_5_operator_meivayusnita;

import java.util.Scanner;

public class TUGAS_1_OPERATOR_MEIVAYUSNITA {
    
static Scanner masukkan = new Scanner(System.in);
    
public static void main(String[] args) {
    
     int x;
     int y;   
     boolean c;
     
    System.out.println("Masukkan nilai X = ");
    x = masukkan . nextInt();
        
    System.out.println("Masukkan nilai Y = ");
    y = masukkan . nextInt();
           
    c = x<y;
    System.out.println(c);
    c = x>y;
    System.out.println(c);
    c = x==y;
    System.out.println(c);
        
    }
    
}
