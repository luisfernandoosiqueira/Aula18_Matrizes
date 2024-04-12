/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package application;

import entities.Matrizes;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 12/04/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a ordem:");
        int tamanho = ler.nextInt();

        Matrizes[][] mat = new Matrizes[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {

                System.out.print("Informe um número: ");
                int numero = ler.nextInt();
                mat[i][j] = new Matrizes(numero);

            }
        }

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {

                Matrizes.numerosNegativos(mat[i][j].getNumero());

            }
        }

        System.out.println("----------------------------");

        for (int i = 0; i < tamanho; i++) {

            Matrizes.Diagonal(mat[i][i].getNumero());

        }

    }

}
