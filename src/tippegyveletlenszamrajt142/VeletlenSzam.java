/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tippegyveletlenszamrajt142;

import java.util.Random;

/**
 *
 * @author Verosffy
 */
public class VeletlenSzam {

    int tol;
    int ig;

    public VeletlenSzam(int tol, int ig) {
        if (tol > ig) {
            int fiok = tol;
            tol = ig;
            ig = fiok;
        }

        this.tol = tol;
        this.ig = ig;

    }

    public int veletlenszam() {
        Random rd = new Random();

        return rd.nextInt((ig - tol) + 1) + tol;
    }

}
