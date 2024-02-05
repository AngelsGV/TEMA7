public class Resuelta7_1 {
    public static void main(String[] ags){
        CuentaCorriente c;
        c = new CuentaCorriente("12345678A","Pepe");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: " + c.egreso(700)); //quedan 0
        System.out.println("Puedo sacar 400 euros: " + c.egreso(400));

    }
}

class CuentaCorriente{
    String dni;
    String nombre;
    double saldo;
    CuentaCorriente(String dni, String nombre){
        this.dni = dni; //passar el dni como parametro
        this.nombre = nombre;
        saldo = 0;
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
