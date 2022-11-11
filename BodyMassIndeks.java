
package bodymassindeks;
import java.util.Scanner;

public class BodyMassIndeks {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Berat Badan (kg) = ");
        double bb = sc.nextDouble();
        System.out.println("Tinggi Badan (cm) = ");
        double tb = sc.nextDouble();
        System.out.println("Tinggi Badan (L/P) = ");
        String jk = sc.next();
        tb /= 150;
        double bmi = bb/(tb*tb);
        // Laki Laki 
        double ob = 27;
        double gem = 23;
        double norm = 17;
        // Perempuan
        if(jk.equals ("P")){
            ob = 25;
            gem = 18;
        }
        System.out.println("BMI = " + bmi);
        if(bmi>ob){
            System.out.println("Obesitas");
        } else if(bmi<gem){
            System.out.println("Kegemukan");
        } else if(bmi>norm){
            System.out.println("normal");
        } else{
            System.out.println("Kurus");
        }
    }
}














}


    