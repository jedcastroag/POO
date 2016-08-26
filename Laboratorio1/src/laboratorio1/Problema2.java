/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.Scanner;

/**
 *
 * @author Jeffer
 */
public class Problema2 {

    static int[] positions(int numpositions, int[] age, String interval, int numpersons) {
        int[] positions = new int[numpositions];
        switch (interval) {
            case "<20":
                for (int i = 0; i < numpositions; i++) {
                    for (int j = 0; j < numpersons; j++) {
                        if (age[i] < 20) {
                            positions[i] = j;
                        }
                    }
                }
                break;
            case "20-29":
                for (int i = 0; i < numpositions; i++) {
                    for (int j = 0; j < numpersons; j++) {
                        if ((age[i] > 19) && (age[i] < 30)) {
                            positions[i] = j;
                        }
                    }
                }
                break;
            case "30-39":
                for (int i = 0; i < numpositions; i++) {
                    for (int j = 0; j < numpersons; j++) {
                        if ((age[i] > 29) && (age[i] < 40)) {
                            positions[i] = j;
                        }
                    }
                }
                break;
            case "40-49":
                for (int i = 0; i < numpositions; i++) {
                    for (int j = 0; j < numpersons; j++) {
                        if ((age[i] > 39) && (age[i] < 50)) {
                            positions[i] = j;
                        }
                    }
                }
                break;
            case "50<":
                for (int i = 0; i < numpositions; i++) {
                    for (int j = 0; j < numpersons; j++) {
                        if (age[i] > 49) {
                            positions[i] = j;
                        }
                    }
                }
                break;
            default:
                break;
        }
        return positions;
    }

    static void incomesCount(int[] incomes, int numpersons) {
        int under30 = 0, thirtytill49 = 0, fiftytill69 = 0, more70 = 0;
        for (int i = 0; i < numpersons; i++) {
            if (incomes[i] < 30000) {
                under30++;
            }
            if ((incomes[i] > 29999) && (incomes[i] < 50000)) {
                thirtytill49++;
            }
            if ((incomes[i] > 49999) && (incomes[i] < 70000)) {
                fiftytill69++;
            }
            if ((incomes[i] > 69999)) {
                more70++;
            }
        }
        System.out.println("There are " + under30 + " persons with incomes under $30.000");
        System.out.println("There are " + thirtytill49 + " persons with incomes betwen $30.000 ande $49.999");
        System.out.println("There are " + fiftytill69 + " persosns with incomes betwen $50.000 ande $69.999");
        System.out.println("There are " + more70 + " persons with incomes over $70.000");
    }

    static int ageGenderCount(int[] Positions, int[] gender, int numpositions, int gendertype) {
        int agegendercount = 0;
        for (int i = 0; i < numpositions; i++) {
            if (gender[Positions[i]] == gendertype) {
                agegendercount++;
            }
        }
        return agegendercount;

    }

    static void dataCount(int[] age, int[] maritalStatus, int[] gender, int numpersons) {
        int under20 = 0, twentytill29 = 0, thirtytill39 = 0, fortytill49 = 0, older = 0;
        for (int i = 0; i < numpersons; i++) {
            if (age[i] < 20) {
                under20++;
            }
            if ((age[i] > 19) && (age[i] < 30)) {
                twentytill29++;
            }
            if ((age[i] > 29) && (age[i] < 40)) {
                thirtytill39++;
            }
            if ((age[i] > 39) && (age[i] < 50)) {
                fortytill49++;
            }
            if (age[i] > 49) {
                older++;
            } else {

            }
        }
        System.out.println("There are " + under20 + " persons under 20 years old");
        System.out.println("There are " + twentytill29 + " persons between 20 and 29 years old");
        System.out.println("There are " + thirtytill39 + " persons between 30 and 39 years old");
        System.out.println("There are " + fortytill49 + " persons between 40 and 49 years old");
        System.out.println("There are " + older + " more than 50 years old");
        int[] under20pos = positions(under20, age, "<20", numpersons);
        int[] twentytill29pos = positions(twentytill29, age, "20-29", numpersons);
        int[] thirtytill39pos = positions(thirtytill39, age, "30-39", numpersons);
        int[] fortytill49pos = positions(fortytill49, age, "40-49", numpersons);
        int[] olderpos = positions(older, age, "50<", numpersons);
        System.out.println("There are " + ageGenderCount(under20pos, gender, under20, 1) + " men under 20 years old");
        System.out.println("There are " + ageGenderCount(under20pos, gender, under20, 2) + " women under 20 years old");
        System.out.println("There are " + ageGenderCount(twentytill29pos, gender, twentytill29, 1) + " men between 20 and 29 years old");
        System.out.println("There are " + ageGenderCount(twentytill29pos, gender, twentytill29, 2) + " women between 30 and 39 years old");
        System.out.println("There are " + ageGenderCount(thirtytill39pos, gender, thirtytill39, 1) + " men between 30 and 39 years old");
        System.out.println("There are " + ageGenderCount(thirtytill39pos, gender, thirtytill39, 2) + " women between 30 and 39 years old");
        System.out.println("There are " + ageGenderCount(fortytill49pos, gender, fortytill49, 1) + " men between 40 and 49 years old");
        System.out.println("There are " + ageGenderCount(thirtytill39pos, gender, thirtytill39, 2) + " women between 40 and 49 years old");
        System.out.println("There are " + ageGenderCount(olderpos, gender, older, 1) + " men older than 50 years old");
        System.out.println("There are " + ageGenderCount(olderpos, gender, older, 2) + " women older than 50 years old");

    }

    static void entryData(int[] age, int[] gender, int[] maritalStatus, int[] incomes, int numpersons) {
        Scanner teclado = new Scanner(System.in);
        int numage, numgender, nummaritalstatus, numincomes;

        for (int i = 0; i < numpersons; i++) {
            System.out.println("\nReader's data number " + (i + 1) + " :");
            System.out.println("¿Age?");
            numage = teclado.nextInt();
            age[i] = numage;
            System.out.println("¿Gender? 1. Male  2. Female");
            numgender = teclado.nextInt();
            gender[i] = numgender;
            System.out.println("¿Marital Status? 1. Single  2. Married");
            nummaritalstatus = teclado.nextInt();
            maritalStatus[i] = nummaritalstatus;
            System.out.println("How many is the annual incomes?");
            numincomes = teclado.nextInt();
            incomes[i] = numincomes;
        }

    }

    static void dailyLiveMagazine() {
        System.out.println("How many reader's data are you goind to introduce?");
        Scanner teclado = new Scanner(System.in);
        int numpersons = teclado.nextInt();
        int[] age = new int[numpersons];
        int[] gender = new int[numpersons];
        int[] maritalStatus = new int[numpersons];
        int[] incomes = new int[numpersons];
        entryData(age, gender, maritalStatus, incomes, numpersons);
        dataCount(age, maritalStatus, gender, numpersons);
        incomesCount(incomes, numpersons);
    }

    static void diceGamePig() {
        int Score1 = 0, Score2 = 0, turntotal = 0, dice1, dice2, machine;
        boolean turn = true;
        Scanner teclado = new Scanner(System.in);
        while ((Score1 <= 100) && (Score2 <= 100)) {
            turntotal = 0;
            System.out.println("Tu:");
            while (turn == true) {
                char respuesta;
                System.out.println("¿Quieres lanzar ahora o pasas? (l / p)");
                respuesta = teclado.next().charAt(0);
                if (respuesta == 'l') {
                    dice1 = (int) Math.floor(Math.random() * 6 + 1);
                    dice2 = (int) Math.floor(Math.random() * 6 + 1);
                    if ((dice1 == 1) && (dice2 == 1)) {
                        turntotal = 0;
                        Score1 = 0;
                        turn = false;
                        System.out.println("Has perdido todo");
                    } else if ((dice1 == 1) || (dice2 == 1)) {
                        turntotal = 0;
                        turn = false;
                        System.out.println("Has perdido este turno");
                    } else {
                        turntotal = turntotal + dice1 + dice2;
                        System.out.println("Has ganado: " + turntotal + " en este turno");
                    }
                } else {
                    Score1 = Score1 + turntotal;
                    turn = false;
                    System.out.println("Tu acumulado es: " + Score1 + "  puntos");
                }
            }
            turntotal = 0;
            System.out.println("Maquina:");
            while (turn == false) {
                machine = (int) Math.floor((Math.random()) * 2 + 1);
                if (machine == 1) {
                    dice1 = (int) Math.floor(Math.random() * 6 + 1);
                    dice2 = (int) Math.floor(Math.random() * 6 + 1);
                    if ((dice1 == 1) && (dice2 == 1)) {
                        turntotal = 0;
                        Score2 = 0;
                        turn = true;
                        System.out.println("He perdido todo");
                    } else if ((dice1 == 1) || (dice2 == 1)) {
                        turntotal = 0;
                        turn = true;
                        System.out.println("He perdido este turno");
                    } else {
                        turntotal = turntotal + dice1 + dice2;
                        System.out.println("He ganado: " + turntotal + " en este turno");
                    }
                } else {
                    Score2 = Score2 + turntotal;
                    turn = true;
                    System.out.println("Mi acumulado es: " + Score2 + "  puntos");
                }
            }
        }
        System.out.println("Jugador: " + Score1);
        System.out.println("Maquina: " + Score2);
        if (Score1 < Score2) {
            System.out.println("Perdiste");
        } else {
            System.out.println("Ganaste");
        }
    }

    static void LotteryGame() {
        int[] Answer = new int[3];
        int[] Guess = new int[3];
        int Award = 0, i, j, cont = 0, reserva = 0, cont1 = 0;
        Scanner flujo = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            Answer[i] = (int) Math.floor(Math.random() * 10);
        }

        for (i = 0; i < 3; i++) {
            System.out.print(Answer[i]);
        }
        for (i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("¿Cuál es el primer digito?");
                    Guess[i] = flujo.nextInt();
                    break;
                case 1:
                    System.out.println("¿Cuál es el segundo digito?");
                    Guess[i] = flujo.nextInt();
                    break;
                default:
                    System.out.println("¿Cuál es el tercer digito?");
                    Guess[i] = flujo.nextInt();
                    break;
            }
        }
        for (i = 0; i < 3; i++) {
            if (Answer[i] == Guess[i]) {
                ++cont;
            } else {
                for (j = 0; j < 3; j++) {
                    if (Answer[i] == Guess[j]) {
                        reserva = Guess[j];
                    }
                }
            }
            if (Answer[i] == reserva) {
                ++cont1;
            }
        }
        if (cont == 3) {
            Award = 1000000;
        } else if (cont1 == 3) {
            Award = 1000;
        } else if ((cont == 2) || (cont1 == 2)) {
            Award = 100;
        } else if ((cont == 1) || (cont1 == 1)) {
            Award = 10;
        } else {
            Award = 0;
        }
        System.out.println("Has ganado: " + Award);
    }

    public static void main(String[] args) {
        /*  Parte a
        System.out.println("Bienvenido a Lottery Game");
        LotteryGame();
            Parte b
        System.out.println("Bienvenido a Dice Game Pig");
        diceGamePig();
         */ //Parte c;
        System.out.println("Reader Survey Records starting");
        dailyLiveMagazine();
    }

}
