package Aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Entidade.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        
        Pessoa pessoa1 = new Pessoa("Danillo", 19);
        Pessoa pessoa2 = new Pessoa("Anne", 17);
        Pessoa pessoa3 = new Pessoa("Yan", 18);
        
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(Arrays.asList(pessoa1, pessoa2, pessoa3));


        System.out.println("Digite o nome da Pessoa q deseja cadastrar");
        String name = sc.nextLine();
        
        System.out.println("Digite a idade da Pessoa q deseja cadastrar");
        int age = sc.nextInt();

        
        Pessoa newPessoa = new Pessoa(name, age);
      
        pessoas.add(newPessoa);
        System.out.println(pessoas);

        sc.close();
    }
}
