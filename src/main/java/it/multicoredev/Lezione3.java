package it.multicoredev;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Copyright © 2020 by Lorenzo Magni
 * This file is part of JavaTutorial.
 * JavaTutorial is under "The 3-Clause BSD License", you can find a copy <a href="https://opensource.org/licenses/BSD-3-Clause">here</a>.
 * <p>
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
public class Lezione3 {

    public static void main(String[] args) throws Exception {
        /*int i = 10;
        int j = 20;
        int k = 5;*/


        /*
        AND -> &&
        P1  P2  R
        1   1   1
        1   0   0
        0   1   0
        0   0   0

        P1  P2  P3  R
        1   1   1   1
        1   0   0   0
        0   0   1   0
        0   1   0   0
        1   1   0   0
        1   0   1   0
        0   0   0   0

        OR -> ||
        P1  P2  R
        1   1   1
        1   0   1
        0   1   1
        0   0   0
         */

        /*if (i < j && i < k) {
            System.out.println("i < j e i < k");
        }*/

        /*boolean b = false;

        if (b) {
            System.out.println("Vero!");
        } else {
            System.out.println("Falso!");
        }*/

        /*if (i < 1) {
            System.out.println("< 1");
        } else if (i < 5) {
            System.out.println("< 5");
        } else if (i <= 10) {
            System.out.println("< 10");
        } else if (i < 20) {
            System.out.println("< 20");
        } else {
            System.out.println("Altro");
        }*/

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = reader.readLine()) != null) {
                /*if (line.equals("ciao")) {
                    System.out.println("Hello World!");
                } else if (line.equals("numero")) {
                    System.out.println(new Random().nextInt());
                } else if (line.equals("addio")) {
                    System.exit(0);
                } else {
                    System.out.println("Comando non valido");
                }*/

                switch (line.toLowerCase()) {
                    case "ciao":
                        System.out.println("Hello World");
                        break;
                    case "numero":
                        System.out.println(new Random().nextInt());
                        break;
                    case "addio":
                    case "bye":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Comando non valido");
                        break;
                }
            }
        }
    }
}
