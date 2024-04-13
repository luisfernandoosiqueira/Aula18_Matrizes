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
package ex2.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 12/04/2024
 * @brief Class Posicao
 */
public class Posicao {

    public Posicao() {
    }

    public void Position(int[][] matriz, int elemento) { // Cria o método recebendo a matriz completa como argumento e um número que o usuário irá informar.
        
        int M = matriz.length;      // Obtém o número de linhas da matriz
        int N = matriz[0].length;  // Obtém o número de colunas da matriz, assumindo que todas as linhas têm o mesmo tamanho

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                
                if (matriz[i][j] == elemento) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (j < N - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (i < M - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}
