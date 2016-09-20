/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratones.practices;

import java.util.Scanner;

/**
 *
 * @author Jeffer
 */
public class ACIS {
    
    public static double [] PuntoMedio(double x, double x1, double y, double y1){
        
    }

    public static void ACIS() {
        Scanner scan = new Scanner(System.in);
        int vertices, cont;
        vertices = scan.nextInt();
        while (vertices != '*') {            
            double radio = 0,r1=0,r2=0;
            double[] coordenadasX = new double[vertices];
            double[] coordenadasY = new double[vertices], centro = new double[2];
            centro[0] = scan.nextDouble();
            centro[1] = scan.nextDouble();
            int i, menorx=0,menory=0;
            for (i = 0; i < vertices; i++) {
                coordenadasX[i] = scan.nextDouble();
                coordenadasY[i] = scan.nextDouble();
                if (coordenadasX[i]<coordenadasX[i-1] && i>0) {
                    menorx = i;
                }else {
                    menorx = 0;
                }
                if (coordenadasY[i]<coordenadasY[i-1] && i>0) {
                    menory = i;
                }else {
                    menory = 0;
                }
            }
            r1 = Math.hypot(coordenadasX[menorx] -centro[0], coordenadasY[menorx] - centro[1]);
            r2 = Math.hypot(coordenadasX[menory]-centro[0], coordenadasY[menory] - centro[1]);
            if (r1 < r2) {
                System.out.println(r1);
            }else if(r1>r2){
                System.out.println(r2);
            }else{
                System.out.println((Math.hypot(coordenadasX[menorx], coordenadasY[menorx])/2));
            }
        }

    }

    public static void main(String[] args) {
        ACIS();
    }

}
