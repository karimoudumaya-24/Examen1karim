public class Examen {
    public static void main(String[] args) {
        double precio1 = 12.5;
        double unidades1 = 4;
        double total1 = getTotal(precio1, unidades1);
        double descuento1 = getDescuento(total1);
        double preciof1 = getpreciof(total1, descuento1);
        System.out.println("Pedido 1: " + preciof1 + " euros");
        double precio2 = 8.0;
        double unidades2 = 5;
        double total2 = getTotal(precio2, unidades2);
        double descuento2 = getDescuento(total2);
        double preciof2 = getpreciof(total2, descuento2);
        System.out.println("Pedido 2: " + preciof2 + " euros");
        double plazo = (preciof1 + preciof2) / 3;
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        double m = (unidades1 + unidades2) / 2;
        System.out.println("Media de unidades por pedido: " + m);
    }

    private static double getpreciof(double total1, double descuento1) {
        return total1 - descuento1;
    }

    private static double getDescuento(double total1) {
        return total1 * 10 / 100;
    }

    private static double getTotal(double precio1, double unidades1) {
        return precio1 * unidades1;
    }
}

//Los errores del ejercicio eran que el  "p2 * u2" estaba sumando en vez de multiplicar, las unidades estaban en int y las cambie a double para que cuando se divide salgan decimales y por ultimo el en el pago de los plazos habia que poner parentesis a las sumas porque en las matematicas se prioriza las divisiones y multiplicaciones.
