package piedrapapeltijera;
import java.util.Scanner;
public class PiedraPapelTijera
        
{
    public static void main(String args[])
    {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-PIEDRA PAPEL O TIJERAS-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Scanner teclado = new Scanner(System.in);
        int seleccionCompu = (int)(Math.random() * 3) + 1;
        System.out.println("LA MAQUINA YA ESCOGIO...");
        System.out.println("AHORA ES TU TURNO");
        System.out.println("");
        System.out.println("Indique su seleccion: ");
        System.out.println("1: Piedra");
        System.out.println("2: Papel");
        System.out.println("3: Tijera");
        System.out.println("4: Salir");
        int seleccionUsuario = teclado.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( seleccionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Felicitaciones Crack Ganaste!"); break;
                   case 3: System.out.println("Nimodo Rey Has Perdido!"); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Nimodo Rey Has Perdido!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Felicitaciones Crack Ganaste!"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Felicitaciones Crack Ganaste!"); break;
                   case 2: System.out.println("Nimodo Rey Has Perdido!"); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
        }
    }
}
    
