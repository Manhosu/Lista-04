package br.edu.up;

import br.edu.up.controller.ContatoController;
import br.edu.up.model.Agenda;
import br.edu.up.view.ContatoView;

public class Programa {
    public static void main(String[] args) {
        ContatoView view = new ContatoView();
        Agenda agenda = new Agenda();
        ContatoController controller = new ContatoController(view, agenda);
        controller.start();
    }
}