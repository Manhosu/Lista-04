package br.edu.up.controller;
import br.edu.up.model.*;
import br.edu.up.view.SeguroView;

import java.util.ArrayList;
import java.util.List;

public class SeguroController {
    private SeguroView view;
    private List<Seguro> seguros;

    public SeguroController(SeguroView view) {
        this.view = view;
        this.seguros = new ArrayList<>();
    }

    public void iniciar() {
        boolean executando = true;

        while (executando) {
            view.exibirMenu();
            int escolha = view.obterEscolhaUsuario();

            switch (escolha) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    executando = false;
                    view.exibirMensagem("Saindo do programa");
                    break;
                default:
                    view.exibirMensagem("Escolha inválid");
                    break;
            }
        }
    }

    private void incluirSeguro() {
        String apolice = view.obterEntrada("Digite o número da apólice: ");
        if (apoliceExiste(apolice)) {
            view.exibirMensagem("A apólice já existe");
            return;
        }

        String nome = view.obterEntrada("Digite o nome do segurado: ");
        String cpf = view.obterEntrada("Digite o CPF do segurado: ");
        String rg = view.obterEntrada("Digite o RG do segurado: ");
        String sexo = view.obterEntrada("Digite o sexo do segurado: ");
        String endereco = view.obterEntrada("Digite o endereço do segurado: ");
        String telefone = view.obterEntrada("Digite o telefone do segurado: ");
        String cep = view.obterEntrada("Digite o CEP do segurado: ");
        String cidade = view.obterEntrada("Digite a cidade do segurado: ");
        Segurado segurado = new Segurado(nome, cpf, rg, sexo, endereco, telefone, cep, cidade);

        String tipoSeguro = view.obterEntrada("Digite o tipo de seguro (vida/veiculo): ");

        if (tipoSeguro.equalsIgnoreCase("vida")) {
            boolean cobreDoenca = view.obterBoolean("O seguro cobre doença? (true/false): ");
            boolean cobreAcidente = view.obterBoolean("O seguro cobre acidente? (true/false): ");
            SeguroVida seguroVida = new SeguroVida(apolice, segurado, cobreDoenca, cobreAcidente);
            seguros.add(seguroVida);
            view.exibirMensagem("Seguro de vida incluído com sucesso.");
        } else if (tipoSeguro.equalsIgnoreCase("veiculo")) {
            double valorFranquia = view.obterDouble("Digite o valor da franquia: ");
            boolean temCarroReserva = view.obterBoolean("O seguro tem carro reserva? (true/false): ");
            boolean cobreVidro = view.obterBoolean("O seguro cobre vidro? (true/false): ");
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, segurado, valorFranquia, temCarroReserva, cobreVidro);
            seguros.add(seguroVeiculo);
            view.exibirMensagem("Seguro de veículo incluído com sucesso.");
        } else {
            view.exibirMensagem("Tipo de seguro inválido.");
        }
    }

    private void localizarSeguro() {
        String apolice = view.obterEntrada("Digite o número da apólice: ");
        Seguro seguro = buscarSeguro(apolice);
        if (seguro != null) {
            view.exibirDetalhesSeguro(seguro.toString());
        } else {
            view.exibirMensagem("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        String apolice = view.obterEntrada("Digite o número da apólice: ");
        Seguro seguro = buscarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            view.exibirMensagem("Seguro excluído com sucesso.");
        } else {
            view.exibirMensagem("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        if (view.confirmarExclusao()) {
            seguros.clear();
            view.exibirMensagem("Todos os seguros foram excluídos.");
        } else {
            view.exibirMensagem("Exclusão cancelada.");
        }
    }

    private void listarTodosSeguros() {
        for (Seguro seguro : seguros) {
            view.exibirDetalhesSeguro(seguro.toString());
        }
    }

    private void verQuantidadeSeguros() {
        view.exibirMensagem("Quantidade de seguros: " + seguros.size());
    }

    private boolean apoliceExiste(String apolice) {
        return seguros.stream().anyMatch(seguro -> seguro.getApolice().equals(apolice));
    }

    private Seguro buscarSeguro(String apolice) {
        return seguros.stream().filter(seguro -> seguro.getApolice().equals(apolice)).findFirst().orElse(null);
    }
}
