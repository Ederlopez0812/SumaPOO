import java.util.Scanner;

public class MainSuma{
        public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
     System.out.println("Ingresa un numero");
        int a=n1.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b=n1.nextInt();
        Suma sm= new Suma();
         sm.setA(a);
         sm.setB(b);
        //  sm.sumar(a, b);
         System.out.println(sm.Sumar());
        System.out.println(n1.toString());
        
    }
}