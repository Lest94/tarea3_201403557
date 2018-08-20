/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201403557;

import java.util.Scanner;

public class Tarea3_201403557 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre[] = new String[5];
        Scanner read = new Scanner(System.in);
        Scanner orden = new Scanner(System.in);
        Scanner cifra = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        int opcion = 0; //menu principal
        do {
            System.out.println("\n 1. usuarios");
            System.out.println("\n 2. contador de digitos");
            System.out.println("\n 3. numeros de mayor a menor");
            System.out.println("\n 4. calcular promedio");
            System.out.println("\n 5.salir");
            System.out.println("");
            System.out.print("ingrese opcion: ");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    int usuario = 0;
                    String auxiliar = new String();
                    do {
                        System.out.println("ingrese usuario");// menu de usuarios
                        System.out.println("\n 1. usuario");
                        System.out.println("\n 2. usuarios de forma ascendente");
                        System.out.println("\n 3. usuario de forma descendente");
                        System.out.println("\n 4  volver atras");
                        usuario = read.nextInt();
                        switch (usuario) {
                            case 1:
                                System.out.println("ingresar usuario");
                                nombre = name.nextInt;//...comparar nombre con los que estan almacenados en el arreglo
                                boolean bandera = false;

                                for (int N = 0; N < 5; N++) {
                                    ;//si no esta vacio que compare
                                    if (nombre[N].isEmpty()) {
                                        if (nombre[N].equals(auxiliar) == true) {
                                            System.out.println("el usuario ya existe");//esta repetido imprimir que el usuario exitste
                                            //guardar con bandera si esta repetido
                                            bandera = true;
                                            break;
                                        }

                                    }
                                }
                                //si bandera es falsa, entrar a recorrer ciclo para ingresar la cadena
                                if (bandera == false) {
                                    for (int N = 0; N < 5; N++) {
                                        //si no esta vacio que compare
                                        if (nombre[N].isEmpty() == true) {
                                            //ingresar el nombre al arreglo
                                            nombre[N] = auxiliar;
                                            System.out.println("el nombre se ingreso correctamente");//imprimir que se ingreso el nombre exitosamente
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Selecciono usaurios de forma ascendente");
                                break;
                            case 3:
                                System.out.println("Selecciono usaurios de forma descendente");
                                break;
                            default:
                                System.out.println("Selecciono Volver Atras.");
                        }
                    } while (usuario < 4);
                    break;
                case 2:
                    int numero = 0;
                    int[] cont = new int[10]; // candidad de veces que aparece un digito
                    int digito;
                    int n;
                    System.out.println("Ingreso a contador de digitos repetidos");// menu contador de digitos
                    do {
                        System.out.println("\n 1. ingrese numero.");
                        System.out.println("\n 2.ingrese numero a buscar");
                        System.out.println("\n 3.mostrar numero de digitos.");
                        System.out.println("\n 4. volver Atras.");
                        System.out.println("");
                        System.out.print("Ingrese Opción: ");
                        numero = read.nextInt();
                        switch (numero) {
                            case 1:
                                System.out.println("Selecciono ingresar numero.");
                                System.out.println("ingrese numero---");
                                n = cifra.nextInt();
                                while (n > 0) {
                                    digito = (int) (n % 10);
                                    cont[digito]++;//contador de digito
                                    n /= 10;
                                }
                                for (digito = 0; digito < 10; digito++) {
                                    if (cont[digito] > 1) {
                                        System.out.println("el digito  " + digito + " se repite  " + cont[digito] + "");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Selecciono Mostrar numero de digitos.");

                                break;
                            default:
                                System.out.println("salir");
                        }
                    } while (numero < 2);
                    break;

                case 3:
                    int num = 0;
                    int a,
                     b,
                     c;
                    int mayor,
                     menor,
                     medio;
                    System.out.println("Ingreso a contador de digitos repetidos");// menu numeros ordenados
                    do {
                        System.out.println("\n 1. ingrese numeros.");
                        System.out.println("\n 2. volver Atras.");
                        System.out.println("");
                        System.out.print("Ingrese Opción: ");
                        num = read.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("Selecciono ingresar numeros.");
                                System.out.println("ingrese primer numero");
                                a = orden.nextInt();
                                System.out.println("ingrese segundo numero");
                                b = orden.nextInt();
                                System.out.println("ingrese tercer numero");
                                c = orden.nextInt();
                                if ((a > b) && (b > c)) {// primera condicion 
                                    mayor = a;
                                    medio = b;
                                    menor = c;
                                    System.out.println("orden es " + mayor + " " + medio + " " + menor + "");
                                } else if ((b > a) && (a > c)) {//segunda condicion
                                    mayor = b;
                                    medio = a;
                                    menor = c;
                                    System.out.println("orden es " + mayor + " " + medio + " " + menor + "");
                                } else if ((c > a) && (a > b)) {// tercera condicion
                                    mayor = c;
                                    medio = a;
                                    menor = b;
                                    System.out.println("orden es " + mayor + " " + medio + " " + menor + "");
                                }
                                break;
                            default:
                                System.out.println("Saliendo...");
                        }
                    } while (num < 2);
                    break;

                case 4:
                    int nota = 0;
                    System.out.println("Ingreso a promedio de notas ");// menu promedio de notas 
                    do {
                        System.out.println("\n 1. ingrese estudiante.");
                        System.out.println("\n 2.ingrese nota");
                        System.out.println("\n 3.mostrar matriz.");
                        System.out.println("\n 4. volver Atras.");
                        System.out.println("");
                        System.out.print("Ingrese Opción: ");
                        nota = read.nextInt();
                        switch (nota) {
                            case 1:
                                System.out.println("Selecciono ingresar estudiante.");
                                break;
                            case 2:
                                System.out.println("Selecciono ingresar nota.");
                                break;
                            case 3:
                                System.out.println("Selecciono Mostrar matriz.");
                                break;
                            default:
                                System.out.println("Salir");
                        }
                    } while (nota < 4);
                    break;
            }
        } while (opcion < 5);
    }
}
