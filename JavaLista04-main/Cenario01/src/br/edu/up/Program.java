package br.edu.up;

import br.edu.up.controls.LivroController;
import br.edu.up.models.Livro;
import br.edu.up.view.LivroView;


        public class Program {
            public static void main(String[] args){
                Livro livro1 = new Livro();
                livro1.setCodigo("1598FHK");




























                
                livro1.setTitulo("Core Java 2");
                livro1.setAutores("Cay S. Horstmann e Gary Cornell");
                livro1.setIsbn("0130819336");
                livro1.setAno(2005);
        
                LivroView livroView1 = new LivroView();
                LivroController livroController1 = new LivroController(livro1, livroView1);
        
                Livro livro2 = new Livro();
                
                livro2.setCodigo("9865PLO");
                livro2.setTitulo("Java, How to Program");
                livro2.setAutores("Harvey Deitel");
                livro2.setIsbn("0130341517");
                livro2.setAno(2001);
        
                LivroView livroView2 = new LivroView();
                LivroController livroController2 = new LivroController(livro2, livroView2);
        
                livroController1.atualizarView();
                livroController2.atualizarView(); 
        
            }
        }
    

