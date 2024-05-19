package br.edu.up;
import br.edu.up.models.*;
import br.edu.up.views.*;


public class Program {
    public static void main(String[] args) {
     
       MenuInicial menu = new MenuInicial();
       menu.mostrar();


        Ano ano = new Ano(2024);
        ano.listarCompromissosAgendados();
       
        

    }
}
