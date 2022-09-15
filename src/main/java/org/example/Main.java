package org.example;

import clases.Cliente;
import clases.Empanada;

import java.time.LocalDateTime;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Empanada empanada= new Empanada("Empanada de Papa y Carne","papa, carne",1200,5000);
        Cliente cliente= new Cliente();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // Pidiendo datos

        int opcion = 100;

        Scanner entradaTeclado= new Scanner(System.in);
        System.out.println("***MENU***");
        System.out.println("1. Agregar Empanadas");
        System.out.println("2. Ver la Empanada");
        System.out.println("3. Editar precio Empanada");
        System.out.println("5. Salir");


        while (opcion!=5){
            System.out.println("Digite una opcion: ");

            opcion=entradaTeclado.nextInt();

            if (opcion==1){

                System.out.println("Ingrese su saldo disponible: ");
                cliente.setSaldoDisponible(entradaTeclado.nextInt());
                if (cliente.getSaldoDisponible()>5000){

                    System.out.println("El ingrediente de la empanada es " + empanada.getIngrediente());
                    System.out.println("El precio de la empanada es " + empanada.getPrecioVenta());
                    System.out.println("Digite la cantidad de empanadas deciadas: ");
                    empanada.setCantidad(entradaTeclado.nextInt());

                    if (empanada.calcularVenta()>cliente.getSaldoDisponible()){

                        System.out.println("Saldo insuficiente");

                        System.out.println("Ingrese una cantidad menor: ");
                        empanada.setCantidad(entradaTeclado.nextInt());

                    }else {

                        cliente.setSaldoDisponible(cliente.getSaldoDisponible()-empanada.calcularVenta());
                        System.out.println("Gracias por tu compra");
                        System.out.println("Su nuevo saldo es: " + cliente.getSaldoDisponible());

                    }

                } else {

                    System.out.println("No tenes plata");
                    break;
                };

            }else if (opcion==2){

                System.out.println("***"+empanada.getNombre()+"***");
                System.out.println("-Regimen Comun-");
                System.out.println(dtf.format(LocalDateTime.now()));
                System.out.println("Producto: Empanada de "+ empanada.getIngrediente());
                System.out.println("Valor unitario: " + empanada.getPrecioVenta());
                System.out.println("La cantidad de empanadas compradas: " + empanada.getCantidad());
                System.out.println("El valor total: "+ empanada.calcularVenta());
                System.out.println("GRACIAS POR SU COMPRA");

            }else if (opcion==3){



            }else if (opcion==5){

                break;

            }else {



            }

        }
    }
}