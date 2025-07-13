using System;
using System.Collections.Generic;

class VerificarBalance
{
    static bool EstaBalanceada(string expresion)
    {
        Stack<char> pila = new Stack<char>();

        foreach (char c in expresion)
        {
            if (c == '(' || c == '{' || c == '[')
            {
                pila.Push(c);
            }
            else if (c == ')' || c == '}' || c == ']')
            {
                if (pila.Count == 0)
                    return false;

                char top = pila.Pop();
                if (!Coinciden(top, c))
                    return false;
            }
        }
        return pila.Count == 0;
    }

    static bool Coinciden(char apertura, char cierre)
    {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }

    static void Main(string[] args)
    {
        string expresion = "{7 + (8 * 5) - [(9 - 7) + (4 + 1)]}";
        if (EstaBalanceada(expresion))
        {
            Console.WriteLine("Fórmula balanceada.");
        }
        else
        {
            Console.WriteLine("Fórmula no balanceada.");
        }
    }
}
