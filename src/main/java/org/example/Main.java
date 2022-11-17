package org.example;

import jdk.swing.interop.SwingInterOpUtils;
import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("****** GRAN FIESTA GRUPO URIBE********");
        System.out.println("**************************************");

        System.out.println("Digita el aforo del lugar de la fiesta: ");
        objetoLugar.setAforo(entradaPorTeclado.nextInt());
        int aforoGlobal=objetoLugar.getAforo();
        Invitado [] invitados = new Invitado[objetoLugar.getAforo()];


        //CICLO PARA UBICAR INVITADOS DENTRO DEL AFORO
        int variableDeControl=0;
        System.out.println("Menu del programa");
        System.out.println("******************");
        System.out.println("0. SALIR");
        System.out.println("1. Registro del lugar");
        System.out.println("2. Registro de la fiesta");
        System.out.println("3. Registro de invitado");
        System.out.println("4. ver invitados");
        do{
            System.out.println("Digita una opcion del menu: ");
            variableDeControl=entradaPorTeclado.nextInt();

            switch (variableDeControl){

                case 1:
                    System.out.print("Digita el aforo: ");
                    objetoLugar.setAforo(entradaPorTeclado.nextInt());
                    System.out.print("Digita la direccion: ");
                    objetoLugar.setDireccion(entradaPorTeclado.next());
                    break;
                case 2:
                    System.out.print("Fecha: ");
                    objetoFiesta.setFecha(entradaPorTeclado.nextLine());
                    System.out.print("Costos de alimentos: ");
                    objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de bebidas: ");
                    objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de lugar: ");
                    objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de equipos: ");
                    objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
                    break;
                case 3:

                    int contadorDeInvitado=aforoGlobal-objetoLugar.getAforo();
                    System.out.print("Digita el nombre del invitado: ");
                    invitados[contadorDeInvitado]=new Invitado();
                    invitados[contadorDeInvitado].setNombres(entradaPorTeclado.next());

                    objetoLugar.setAforo(objetoLugar.getAforo()-1);

                    break;
                case 4:
                    for(int i=0; i<invitados.length; i++){
                        System.out.println(invitados[i].getNombres());

                    }

                default:
                    System.out.println("Selecciona una opcion valida");
                    break;

            }


        }while(variableDeControl != 0);











    }
}