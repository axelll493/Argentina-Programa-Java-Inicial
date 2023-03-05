/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introducciónalgoritmosjava;
import java.util.Scanner;
/**
 *
 * @author axel
 */




public class IntroducciónAlgoritmosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logSic here
        Scanner leer = new Scanner(System.in);
        int resultado = 0, numeroIni, numeroFin;
        
        OUTHER:
        while(true){
            System.out.println("\n     ¿COMO ESTAS?, PROFESORA, ELIJA QUE CORREGIRA");
            System.out.println("""
                               1 - Primer Ejercicio
                               2 - Segundo Ejercicio 
                               3 - CERRAR EL PROGRAMA 
                               """);
            System.out.println("INGRESE UNA OPCION");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                     do{
                        System.out.println("INGRESE UN NUMERO INICIAL");
                        numeroIni = leer.nextInt();
                        System.out.println("\nINGRESE UN NUMERO FINAL");
                        numeroFin = leer.nextInt();
        
                        if(numeroFin<numeroIni){
                            System.out.println("\n El NUMERO INICIAL ES MAYOR AL FINAL \n POR FAVOR INGRESALOS CORRECTAMENTE \n");
                        }
                        }while(numeroFin <numeroIni);{
                             System.out.println("\n LOS NUMEROS FUERON INGRESADOS CORRECTAMENTE");
                        }
                        System.out.println("\n NUMEROS PARES Y IMPARES");
                        ParImpar(numeroIni, numeroFin);
                        System.out.println("\n \n NUMEROS PARES");
                        Pares(numeroIni, numeroFin);
                        System.out.println("\n \n NUMEROS PARES INVERTIDOS");
                        ParesInvertido(numeroIni, numeroFin);
                        break;
                case 2:
                    System.out.println("\n     Resoibde a las siguientes preguntas si perteneces a los ingresos altos \n \n");
                    
                    System.out.println("\n     ¿De cuanto es tu ingreso Mensual?\n");
                    int ingresoMensual = leer.nextInt();
                    System.out.println("\n     ¿Cuantos vehiculos tiene?\n");
                    int vehiculos = leer.nextInt();
                    System.out.println("\n     ¿Cuantos muebles tiene?\n");
                    int muebles = leer.nextInt();
                   System.out.println("""
                                          ¿Posees una embarcación, una aeronave de lujo 
                                          o eres titular de activos societarios que 
                                          demuestren capacidad económica plena?. 
                                       """);
                    
                    System.out.println("""
                                          1 - SI POSEO
                                          2 - NO POSEO
                                       """);
                    System.out.println("INGRESE UNA OPCION");
                    int opcionn = leer.nextInt();
                    //(3,5 canastas básicas para un hogar tipo 2 según el INDEC//
                    //$489.083/3.5 =$139.738+ $489.083=$628.821
                    if(ingresoMensual>=628.821 && vehiculos>=3 && muebles>=3 && opcionn==1){
                        System.out.println("\nsi perteneces a los segmento de ingresos altos\n");
                    }else{
                        System.out.println("\nno perteneces a los segmento de ingresos altos\n");
                    }
                
                    break;
                case 3:
                    System.out.println("\nCerrar El Programa\n");
                    break OUTHER;
                default:
                    System.out.println("\nOPCION INCORRECTA\n");
            } 
        }
      
        
        
        
        
        
    
       
    }
    
    static void ParImpar(int numeroIni, int numeroFin){
        //String NumerosPares = "";
        
        
        while( numeroIni <= numeroFin){
     
        if(numeroIni !=0){
            if(numeroIni>0){
                if(numeroIni % 2==0){
                    System.out.printf("El numero %d es PAR \n", numeroIni);
                    
                }else{
                    System.out.printf("El numero %d es IMPAR \n", numeroIni);
                }
            }
        }else{
            System.out.printf("El numero es neutro \n", numeroIni);
        }
        numeroIni++;
        
        }
        
       
    }
      static void Pares(int numeroIni, int numeroFin){
        //String NumerosPares = "";
        
        
        while( numeroIni <= numeroFin){
     
        if(numeroIni !=0){
            if(numeroIni>0){
                if(numeroIni % 2==0){
                    System.out.printf("El numero %d es PAR\n", numeroIni);
            }
        }else{
            System.out.printf("El numero es neutro \n", numeroIni);
        }
        numeroIni++;
        
        }
        
        }
    }    
      static void ParesInvertido(int numeroIni, int numeroFin){
        //String NumerosPares = "";
        
        
        
     for(int i=numeroFin; i>0; i--){
       
       
                if(i % 2==0){
                    System.out.printf("El numero  %d es PAR Positivo \n", i);
            }
        }
        
        
        
     
     }
       
        
        
    }    
      

