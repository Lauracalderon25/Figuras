package com.lauracalderon;

import java.util.Scanner;

public class Rombo implements Shape{
    private  double lado;
    private double diagonalmayor;
    private double diagonalmenor;

    public Rombo(double lado, double diagonalmayor, double diagonalmenor){
        this.lado = lado;
        this.diagonalmenor = diagonalmenor;
        this.diagonalmayor = diagonalmayor;
    }

    public Rombo() {
        System.out.println("Ingresa el valor del lado: ");
        Scanner sn = new Scanner(System.in);
        lado = sn.nextInt();

        System.out.println("Ingresa el valor de la diagonal menor: ");
        Scanner sn1 = new Scanner(System.in);
        diagonalmenor = sn1.nextInt();

        System.out.println("Ingresa el valor de la diagonal mayor: ");
        Scanner sn2 = new Scanner(System.in);
        diagonalmayor = sn2.nextInt();
    }

    public void setLado(double lado ){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public void setDiagonalmenor(double diagonalmenor ){
        this.diagonalmenor = diagonalmenor;
    }
    public double getDiagonalmenor(){
        return diagonalmenor;
    }
    public void setDiagonalmayor(double diagonalmayor ){
        this.diagonalmayor = diagonalmayor;
    }
    public double getDiagonalmayor(){
        return diagonalmayor;
    }
    @Override
    public double area() {
        return diagonalmayor * diagonalmenor / 2;
    }

    @Override
    public double perimeter() {
        return lado * 4;
    }
}
