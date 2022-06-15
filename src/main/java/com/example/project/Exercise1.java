package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
        // Colocar codigo aqui
             MyStack<Character> stack = new LinkedListStack<>();
        // leemos letra por letra y guardamos los abiertos "("
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            //comparamos el elemento de la parte superior de la pila y verifica que sea del mismo tipo
            if (stack.top() == '(' && s.charAt(i) == ')' || stack.top() == '[' && s.charAt(i) == ']'
                    || stack.top() == '{' && s.charAt(i) == '}') {
                // eliminamos el ultimo elemento que se agrego
                stack.pop();
            }
        }
        // si la pila es vacia true 
        return stack.isEmpty();
    }
}
