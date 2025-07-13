using System;
using System.Collections.Generic;

class TorresDeHanoiConPilas
{
    static void MoverDiscos(int n, Stack<int> origen, Stack<int> destino, Stack<int> auxiliar, 
                            string nombreOrigen, string nombreDestino, string nombreAuxiliar)
    {
        if (n == 1)
        {
            int disco = origen.Pop();
            destino.Push(disco);
            Console.WriteLine($"Mover disco {disco} de {nombreOrigen} a {nombreDestino}");
            return;
        }

        MoverDiscos(n - 1, origen, auxiliar, destino, nombreOrigen, nombreAuxiliar, nombreDestino);

        int discoActual = origen.Pop();
        destino.Push(discoActual);
        Console.WriteLine($"Mover disco {discoActual} de {nombreOrigen} a {nombreDestino}");

        MoverDiscos(n - 1, auxiliar, destino, origen, nombreAuxiliar, nombreDestino, nombreOrigen);
    }

    static void Main(string[] args)
    {
        int n = 3; // Número de discos

        Stack<int> torreA = new Stack<int>();
        Stack<int> torreB = new Stack<int>();
        Stack<int> torreC = new Stack<int>();

        // Llenar torre A (mayor abajo)
        for (int i = n; i >= 1; i--)
        {
            torreA.Push(i);
        }

        MoverDiscos(n, torreA, torreC, torreB, "A", "C", "B");
    }
}
