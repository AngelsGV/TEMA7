public class Resuelta7_2 {
    public static void main(String[] ags){
        CuentaCorriente1 c;
        c = new CuentaCorriente1("12345678A","Pepe");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: " + c.egreso(700)); //quedan 0
        System.out.println("Puedo sacar 500 euros: " + c.egreso(500));
        //CUANDO SE REFERENCIA UN NUEVO OBJETO EL ANTERIOR QUEDA SIN REFERENCIA --> RECOLECTOR DE BASURA.
        c = new CuentaCorriente1("986543F",2000);
        c.mostrarInformacion();

    }
}

