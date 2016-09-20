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
public class ToogleString {

    public static void main(String[] args) {
        Scanner flow = new Scanner(System.in);
        String S = flow.nextLine();
        String S1 = "";
        if (S.length()  <= 100) {
            for (int i = 0; i < S.length(); i++) {
                if ((S.charAt(i) >= 'A') && (S.charAt(i) <= 'Z')) {
                    S1 = S1 + (char) (((int) S.charAt(i)) + 32);
                } else if ((S.charAt(i) >= 'a') && (S.charAt(i) <= 'z')) {
                    S1 = S1 + (char) (((int) S.charAt(i)) - 32);
                } else {
                    S1 = S1 + S.charAt(i);
                }
            }
        }
        System.out.println(S1);
    }

}
