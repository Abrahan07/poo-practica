//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("A");
        Cuenta cuenta_2 = new Cuenta("B", 300);

        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);

        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
}