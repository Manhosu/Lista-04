package br.edu.up;
import br.edu.up.controller.SeguroController;
import br.edu.up.view.SeguroView;

public class Programa {
    public static void main(String[] args) {
        SeguroView view = new SeguroView();
        SeguroController controller = new SeguroController(view);
        controller.iniciar();
    }
}
