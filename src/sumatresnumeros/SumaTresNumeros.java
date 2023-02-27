
package sumatresnumeros;


public class SumaTresNumeros {
    
     public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int resultado = suma(num1, num2, num3);
        System.out.println("La suma de los tres números es: " + resultado);
    }
    
}
