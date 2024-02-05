public class Resuelta7_2 {
}
class CuentaCorriente1{
    String dni;
    String nombre;
    double saldo;
    CuentaCorriente1(String dni, String nombre){
        this.dni = dni; //passar el dni como parametro
        this.nombre = nombre;
        saldo = 0;
    }
    CuentaCorriente1(String dni, double saldo){
        this.dni = dni; //passar el dni como parametro
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }
}
