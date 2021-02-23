package mx.gamasoft.metodos;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // Creamos un objeto de tipo aritmetica
        Aritmetica objAritmetica = new Aritmetica();

        int resultado = objAritmetica.sumar(3, 4);

        System.out.println("resultado = " + resultado);
    }
}
