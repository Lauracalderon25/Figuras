package com.lauracalderon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0,figura=0, forma=0;
        boolean salir = false;

        while (!salir) {

            System.out.println("Escriba el numero de su opcion");
            System.out.println("Seleccionar propiedad a calcular: 1.área o 2.perímetro.");
            System.out.println("Seleccionar la figura: 3. Circulo, 4.Cuadrado, 5.Triangulo, 6.Rombo");
            System.out.println("7.Solicitar los atributos de la figura");
            System.out.println("0 Salir");

            try {
                opcion = scanner.nextInt();


                switch (opcion) {



                    case 1: figura = 1;
                        System.out.println("Ya se eligio");
                        break;

                    case 2: figura= 2;
                        System.out.println("Ya se eligio");
                        break;

                    case 3: Circle circulo = new Circle();
                        forma = 1;
                        if (figura==1){
                            System.out.println("El area es: "+circulo.area());
                        }else
                            System.out.println("el perimetro es: "+circulo.perimeter());
                        break;

                    case 4:  Square cuadrado = new Square();
                        forma= 2;
                        if (figura==1){
                            System.out.println("El area es: "+cuadrado.area());
                        }else
                            System.out.println("el perimetro es: "+cuadrado.perimeter());

                        break;

                    case 5: Triangle triangulo = new Triangle();
                        forma= 3;
                        if (figura==1){
                            System.out.println("El area es: "+triangulo.area());
                        }else
                            System.out.println("el perimetro es: "+triangulo.perimeter());

                        break;

                    case 6: Rombo rombo = new Rombo();
                        forma= 4;
                        if (figura==1){
                            System.out.println("El area es: "+rombo.area());
                        }else
                            System.out.println("el perimetro es: "+rombo.perimeter());

                        break;
                    case 7:
                        if (forma==1){
                            Circle circulo1 = new Circle();
                        }else
                            if (forma == 2){
                                Square cuadrado1 = new Square();
                            }else if (forma == 3) {
                                Triangle triangulo1 = new Triangle();
                            }else if (forma == 4) {
                                Rombo rombo1 = new Rombo();
                            }
                        break;

                    case 0:
                        salir = true;
                        System.out.println("Saliste. Adios");
                        break;
                    default:
                        throw new IllegalStateException("Opcion invalida: " + opcion);
                }
            }catch (InputMismatchException e) {
                System.out.println("Opcion no valida");
                scanner.next();
            }
        }
    }
}