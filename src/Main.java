public class Main {
    public static void main(String args[]){

        int resultado = 0;
        resultado = sumar(1,2,3);
        System.out.println("El resultado es: " + resultado);

        Coche coche = new Coche();
        coche.numeroDePuertas = 2;
        coche.aumentarPuertas(1);
        System.out.println("El numero de puertas es: " + coche.numeroDePuertas);

    }
    public static int sumar(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
