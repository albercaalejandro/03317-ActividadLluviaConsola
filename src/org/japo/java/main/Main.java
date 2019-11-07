/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final int lluviaMax = 500;
        final int lluviaMin = 0;
        int media = 0;
        int cantMax = 0;
        int cantMin = 0;
        int diaMax = 0;
        int diaMin = 0;
        for (int i = 1; i <= 7; i++) {
            int lluviaAleatoria = RND.nextInt(lluviaMax - lluviaMin + 1) + lluviaMin;
            System.out.println("Hoy dia " + i + " a llovido: " + lluviaAleatoria + " l/m²");
            media = lluviaAleatoria + media;
            if (i == 1) {
                cantMax = lluviaAleatoria;
                diaMax = i; 
            }
                else if(lluviaAleatoria > cantMax) {
                cantMax = lluviaAleatoria;
                diaMax = i;
            }
            if (i == 1) {
                cantMin = lluviaAleatoria;
                diaMin = i;
            } else if (lluviaAleatoria < cantMin) {
                cantMin = lluviaAleatoria;
                diaMin = i;
            }

        }
        int mediaTotal = media / 7;
        System.out.println("La media total a sido: " + mediaTotal + " l/m²");
        System.out.println("La cantidad maxima a ocurrido el dia "+diaMax+" a sido: "+cantMax + " l/m²" );
        System.out.println("La cantidad minima a ocurrido el dia "+diaMin+" a sido: " + cantMin + "l/m²");
        System.out.println("La cantidad total a sido: "+media+ " l/m².");
    }

}
