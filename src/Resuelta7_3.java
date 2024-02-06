public class Resuelta7_3 {
    public static void main(String[] ags){
        CuentaCorriente1 c;
        c = new CuentaCorriente1("12345678A","Pepe");
       // c.saldo = 2000; --> produce error poque esta en privado y no se puede ver desde fuera
        c.dni ="11111111-T";
        c.nombre="Antonio";

    }
}