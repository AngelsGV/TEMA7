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
class CuentaCorriente1{
    String dni;
    String nombre;
    double saldo;
    CuentaCorriente1(String dni, String nombre){
        this.dni = dni; //passar el dni como parametro
        this.nombre = nombre;
        saldo = 0;
        //this(dni,nombre,0)
        //o
        //this(dni,saldo)
        //this(dni,0)
        //this.nombre=nombre;
    }
    CuentaCorriente1(String dni, double saldo){
        this.dni = dni; //passar el dni como parametro
        this.saldo = saldo;
        this.nombre = "Sin asignar";
        //this(dni,"Sin asignar", saldo);
    }
    CuentaCorriente1(String dni, String nombre, double saldo){
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    boolean egreso(double cant){
        //sacar dinero de la cuenta
        boolean operacionPosible;
        if (saldo >= cant ){
            saldo -= cant;
            operacionPosible = true;
        }else{
            //no hay saldo
            System.out.println("No hay saldo suficiente.");
            operacionPosible = false;
        }
        return (operacionPosible);
    }
    void ingreso(double cant){
        saldo += cant;
    }
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}

