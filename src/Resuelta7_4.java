public class Resuelta7_4 {
    public static void main(String[] args){
        CuentaCorriente1 c1,c2;
        c1 =new CuentaCorriente1("123456789-A", "PEPE");
        c2 = new CuentaCorriente1("999999999-P", "ANA");
        c1.mostrarInformacion();
        CuentaCorriente1.setBanco("Banco central");
        c1.mostrarInformacion();
        CuentaCorriente1.setBanco("Caja de ahorros do-while");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
    }
}
