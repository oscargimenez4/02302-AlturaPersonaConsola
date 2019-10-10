/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

//Instancia Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        double altura;
        //Cuarentena
        try {
            //Leer dato
            System.out.print("Introduzca su altura ......: ");
            altura = SCN.nextDouble();
            //Mensaje
            System.out.printf("Su altura es ..............: %.2f metros %n", altura);
        } catch (Exception e) {
            //Mensaje si hay error
            System.out.println("ERROR: Entrada incorrecta");
        } finally {
            //Borrar buffer
            SCN.nextLine();
        }
    }
}
