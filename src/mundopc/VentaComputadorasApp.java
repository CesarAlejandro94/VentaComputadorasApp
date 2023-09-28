package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        //Creando objetos
        Raton ratonPrueba = new Raton("USB", "lenovo");
        Teclado tecladoPrueba = new Teclado("USB", "DELL");
        Monitor monitorPrueba = new Monitor("HP", 27.00);
        //System.out.println(ratonPrueba);
        //System.out.println(tecladoPrueba);
        //System.out.println(monitorPrueba);
        //Creando objeto de tipo Computadora
        Computadora computadoraPrueba = new Computadora("Hp", monitorPrueba, tecladoPrueba, ratonPrueba);
        //System.out.println(computadoraPrueba);
        //Creando otro objeto
        Monitor monitorPruebaDos = new Monitor("DELL",17.00);
        Teclado tecladoPruebaDos = new Teclado("USB", "DELL");
        Raton ratonPruebaDos = new Raton("Bluetooth", "DELL");
        Computadora computadoraPruebaDos = new Computadora("DELL", monitorPruebaDos,tecladoPruebaDos,ratonPruebaDos);
        //Creando un tercer objeto
        Monitor monitorPruebaTres = new Monitor("Apple", 50.00);
        Teclado tecladoPruebaTres = new Teclado("usb","Apple");
        Raton ratonPruebaTres = new Raton("usb", "Apple");
        Computadora computadoraPruebaTres = new Computadora("iMAC", monitorPruebaTres, tecladoPruebaTres, ratonPruebaTres);
        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraPrueba);
        orden1.agregarComputadora(computadoraPruebaDos);
        orden1.mostrarOrden();
        //Creamos una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraPruebaTres);
        orden2.agregarComputadora(computadoraPrueba);
        System.out.println();
        orden2.mostrarOrden();
    }
}