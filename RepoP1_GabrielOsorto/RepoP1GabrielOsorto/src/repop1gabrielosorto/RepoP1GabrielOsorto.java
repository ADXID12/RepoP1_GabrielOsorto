/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repop1gabrielosorto;
import java.util.Scanner;
/**
 *
 * @author Jahir Corrales
 */
public class RepoP1GabrielOsorto {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         boolean seguir = true;
        while(seguir){
            System.out.println("-----Menu-----");
            System.out.println("1.Encriptación simple!");
            System.out.println("2.Tokens");
            System.out.println("3.Inicio de Sesión");
            System.out.println("4.Salir.");
            System.out.print("Escoja una opcion:");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("-----Encriptacion Simple!-----");
                    System.out.print("Ingrese la cadena que desea encriptar:");
                     String cadena = sc.next();
                    System.out.print("Ingrese la llave:");
                    int llave=sc.nextInt();
                    while ((llave<=0)||(llave>10)){
                         System.out.print("Ingres un numero dentro del rango (1 al 10):");
                    llave=sc.nextInt();
                    }//fin while}
                    char caracter = cadena.charAt(cadena1);
                    int cadena1 = (int) caracter;
                    for  ( int  i= 0 ; i<cadena.length();i++){
                        if (( int )cadena.charAt(i )%2==0){
                            int respPar = ( int )cadena.charAt(i )+llave;
                            String respP=Character.toString(respPar);
                            System.out.print(respP);
                        }//fin if
                        
                    //System.out.println( "Valor ASCII de: " +cadena.charAt(i) +  " es:" + ( int )cadena.charAt(i ) );
                    }
                    System.out.println("");
                }//fin case 1
                break;

                case 2:{
                    System.out.println("-----Tokens-----");
                }//fin case 2
                break;
                case 3:{
                 System.out.println("-----Inicio de Sesión-----");   
                }//fin case 3
                break;
                case 4:{
                    System.out.println("Se acaba de salir papu :(");

                    seguir = false;
                }//fin case 4
                break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }//fin switch
        }//fin while
        // TODO code application logic here
    }
    
}
