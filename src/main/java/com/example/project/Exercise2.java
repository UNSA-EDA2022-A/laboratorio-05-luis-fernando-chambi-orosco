package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
        // Colocar codigo aqui
        // se lee caracter por caracter 
       for (int i = 0; i < str.length(); i++) {
           //se guarda  caracteres que sean diferentes a ')'
            if (str.charAt(i) !=')'){
                stack.push(str.charAt(i));
            }
           //si el caracter actual es un ')'
            else{ 
                //si el elemento superior de la pila es "(" retorna true con lo cual existe parentesis duplicados 
                if (stack.top()=='(' ) {
                    return true;
                }
                // eliminamos el ultimo elemento del la pila hasta que '(' se encuentre para el ')' actual
                while (stack.top()!='(' ){
                    stack.pop();
                }
                //eliminamos el ultimo elemento del la pila
                stack.pop();
            }
            
        }
        //retorna false si no hay parentesis duplicados
        return false;
    }
}
