package it.multicoredev;

import java.util.ArrayList;
import java.util.List;

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
public class Lezione2 {
    private static int j = 74;

    public static void main(String[] args) {
        /*stampa(100);

        int i = 52;
        stampa(i);
        stampa(j);
        stampa2();

        int k = 0;
        stampaEIncrementa(k);
        stampaEIncrementa(k);

        Integer m = 1;
        stampaEIncrementa(m);
        stampaEIncrementa(m);*/

        /*List<String> lista = new ArrayList<String>();
        lista.add("Pinco");
        lista.add("Pallino");
        stampaLista(lista);
        System.out.println(lista);*/

        /*double i = 2;
        double j = 3;

        System.out.println(i + j);
        System.out.println(i * j);
        System.out.println(i - j);
        System.out.println(i / j);
        System.out.println(j % i);
        System.out.println(2 << 4);
        System.out.println(32 >> 4);

        i = i + 1;
        i += 1;
        i++;

        System.out.println("Ciao " + "a tutti! " + i);*/

        int volte = 0;
        while (volte < 5) {
            System.out.println("Ciao a tutti");
            volte++;
        }

        do {
            System.out.println("Ciao");
            volte++;
        } while (volte < 7);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        List<String> lista = new ArrayList<String>();
        lista.add("Ciao");
        lista.add("a");
        lista.add("tutti");
        lista.add("Come");
        lista.add("State");
        lista.add("?");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String stringa : lista) {
            System.out.println(stringa);
        }
    }

    public static void stampa(int numero) {
        System.out.println(numero);
    }

    public static void stampa2() {
        System.out.println(j);
    }

    public static void stampaEIncrementa(Integer numero) {
        System.out.println(numero);
        numero = numero + 1;
    }

    public static void stampaLista(List<String> lista) {
        System.out.println(lista);
        lista.add("Tizio");
    }
}
