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

    public static void ACIS() {
        Scanner scan = new Scanner(System.in);
        int vertices, cont;
        vertices = scan.nextInt();
        while (vertices != '*') {            
            double radio = 0, r=0,r1=0;
            double[] coordenadasX = new double[vertices];
            double[] coordenadasY = new double[vertices], centro = new double[2];
            centro[0] = scan.nextDouble();
            centro[1] = scan.nextDouble();
            for (int i = 0; i < vertices; i++) {
                coordenadasX[i] = scan.nextDouble();
                coordenadasY[i] = scan.nextDouble();
                r = coordenadasX[i] - centro[0];
                r1 = coordenadasY[i] - centro[1];
                if (r < r1) {
                    radio = r;
                } else if (r > r1) {
                    radio = r1;
                }else{
                    
                }
            }

        }

    }

    public static void main(String[] args) {
        ACIS();
    }

}
