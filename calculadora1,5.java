package javaapplication1;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class JavaApplication1 {
    public static float somar(float a, float b){
        return a + b;
    }
    
    public static float subtrair(float a, float b){
        return a - b;
    }
    
    public static float multiplicar(float a, float b){
        return a * b;
    }
    
    public static float dividir(float a, float b){
        return a / b;
    }
    public static double potencia(float a, float b){
        return pow(a, b);
    }
    public static double raizq(float a){
        return sqrt(a);
    }
    public static double cosseno(float a){
        return cos(a);
    }
    public static double tangente(float a){
        return tan(a);
    }
    public static double seno(float a){
        return sin(a);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora JAVA\n");
        
        System.out.println("Digite o valor de A: ");
        float a = sc.nextFloat();
        System.out.println("Digite o valor de B: ");
        float b = sc.nextFloat();
        System.out.println("Digite a operacao: ");
        String operacao = sc.next();
        
        switch (operacao){
            case "+":
                System.out.println("\n" + a + " + " + b + " = " + somar(a,b));
                break;
                
            case "-":
                System.out.println("\n" + a + " - " + b + " = " + subtrair(a,b));
                break;
                
            case "*":
                System.out.println("\n" + a + " * " + b + " = " + multiplicar(a,b));
                break;
                
            case "/":
                System.out.println("\n" + a + " / " + b + " = " + dividir(a,b));
                break;
            case "^":
                System.out.println("\n" + a + " ^ " + b + " = " + potencia(a,b));
                break;
            case "sqrt":
                System.out.println("\n" + "sqrt(" + a + ") = " + raizq(a));
                break;
            case "cos":
                System.out.println("\n" + "cos(" + a + ") = " + cosseno(a));
                break;
            case "tan":
                System.out.println("\n" + "tan(" + a + ") = " + tangente(a));
                break;
            case "sin":
                System.out.println("\n" + "sin(" + a + ") = " + seno(a));
                break;
        }
        
    }
    
}
