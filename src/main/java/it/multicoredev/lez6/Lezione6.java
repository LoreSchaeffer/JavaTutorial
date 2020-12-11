package it.multicoredev.lez6;

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
public class Lezione6 {

    public static void main(String[] args) {
        Triangolo t1 = new Triangolo(1, 2, 3, 5);
//        System.out.println(t1.perimetro());
//        System.out.println(t1.area());

        Rettangolo r1 = new Rettangolo(1, 3);
//        System.out.println(r1.perimetro());
//        System.out.println(r1.area());

        Quadrato q1 = new Quadrato(2);
//        System.out.println(q1.perimetro());
//        System.out.println(q1.area());

        Poligono p1 = new Triangolo(1, 2, 3, 4);
        Poligono p2 = new Rettangolo(12, 2);
        Poligono p3 = new Quadrato(5);

//        System.out.println(p1.perimetro());
//        System.out.println(p2.area());
//        System.out.println(p3.perimetro());

        Poligono[] poligoni = new Poligono[]{
                new Triangolo(1, 4, 56, 3),
                new Quadrato(2),
                new Rettangolo(2, 7),
                new Triangolo(9, 3, 4, 2),
                new Quadrato(5),
                new Rettangolo(6, 7)
        };

        for (Poligono p : poligoni) {
            System.out.println(p.getClass().getSimpleName() + " " + p.perimetro());
        }


        System.out.println(Triangolo.getLati());
    }
}
