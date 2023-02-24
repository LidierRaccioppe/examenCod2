import javax.swing.*;
public class Main {
        public static void main(String[] args) {
                JOptionPane.showInputDialog("INGRESE SU ALMA");
                String opcion;
                Float num1, num2;
                Float rechult;
                opcion = EntradaSalida.entradaString(
                        "sumar --> SUMAR" +
                                "\nrestar --> RESTAR" +
                                "\nmultiplicar --> MULTIPLICAR" +
                                "\ndivir --> DIVIDR\nCUALQUIER OTRA COSA --> CIERRE DEL POGRAMA"
                );
                num1 = EntradaSalida.entradaFloat("Ingrese el numerador o el numero mas a la izquierda en la escriba occidental");
                num2 = EntradaSalida.entradaFloat("Ingrese el denominador o el numero mas a la derecha en la escriba occidental");
                if(num1 == null || num2==null){ //no funciona el "" para indicar nullo como en bases pd: recontrarecuerdalomaximo
                        EntradaSalida.salida("Debe Ingresar Algo", EntradaSalida.SALIDA_CONSOLA);
                }
                if (opcion == "restar" || opcion == "sumar" || opcion == "multiplicar" || opcion == "dividir") {
                        rechult = cuantioche.calculameEsta(num1, num2,opcion );
                        if (Float.isNaN(rechult)) {
                                EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                        } else {
                                EntradaSalida.salida(("O resultado da operación é " + rechult), EntradaSalida.SALIDA_WINDOW);
                        }
                }
        }
}