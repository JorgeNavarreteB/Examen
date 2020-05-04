import javax.swing.JOptionPane;

public class VerificadoDeEntradas {

    //metodo Main
    public static void main (String[]args) {
        String nombreAceptado = "Carlos";
        String claveAceptada = "jh2";
        String nombreEntrado="";
        String claveEntrada="";
        while(nombreEntrado.equals(nombreAceptado) == false || claveEntrada.equals(claveAceptada) == false) {
            nombreEntrado = JOptionPane.showInputDialog ( "Introduzca nombre de usuario:" );
            claveEntrada = JOptionPane.showInputDialog ( "Introduzca su contraseña:" );
        }
        JOptionPane.showInputDialog ( "Usted ha accedido con datos de usuario y password correctos. Bienvenido" );     
    }//cierre de main
}//cierre de clase