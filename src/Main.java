// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
     *
     * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
     *
     * Crear constructor vacío y con todos los parámetros para cada clase.
     *
     * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
     * @param args
     */
    public static void main(String[] args) {
        SmartPhone movil = new SmartPhone("720×1280 pixeles", "Smasung", true, "24MP", true);
        System.out.println("Este Smartphone tiene una pantalla con una resolucion de " + movil.resolucionPixeles);
        System.out.println("Smartphone de la marca " + movil.marca);
        if(movil.camara) {
            System.out.println("Este Smartphone dispone de camara con " + movil.megaPixelsCamara);
        }
        if(movil.gps) {
            System.out.println("Este Smartphone dispone de GPS integrado.");
        }
        SmartWatch relojInteligente = new SmartWatch("280x456 pixeles", "Apple", false, 80, true);
        System.out.println("Este Smartwatch tiene una pantalla con una resolucion de " + relojInteligente.resolucionPixeles);
        System.out.println("Smartwatch de la marca " + relojInteligente.marca);
        if(relojInteligente.camara){
            System.out.println("Incorpora camara");
        } else {
            System.out.println("Este Smartwatch no incorpora ninguna camara.");
        }
        System.out.println("Este Smartwatch calcula el ritmo cardiaco, la media actual es de " + relojInteligente.ritmoCardiaco);
        if(relojInteligente.wifi) {
            System.out.println("Este Smartwatch tiene funcionalidades con wifi");
        } else {
            System.out.println("Este Smartwatch no incorpora wifi.");
        }
    }
}