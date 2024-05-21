package br.edu.up.models;



public class Passageiro extends Pessoa {

    private Pessoa[] pessoas;
    private int idBagagem;
    private Passagem[] passagens = new Passagem[6];

    

    public Passageiro(String nome ,int rg, int idBagagem) {
        super(nome,rg);
        this.idBagagem = idBagagem;
       
    }
    public String registrarPassagem(String nome, String acento, String classe){
        for(int i =0;i < 6; i++){
            if (passagens[i] == null) {
                passagens[i] = new Passagem(nome, acento, classe);
                return "ok";
            }
}
     return "null";  }

    public int getIdBagagem() {
        return idBagagem;
    }
    public void setIdBagagem(int idBagagem) {
        this.idBagagem = idBagagem;
    }

    public int listarPassagens(String nome){
        for(int i =0; i < passagens.length; i++){
            if (passagens[i] != null && passagens[i].getNomePassageiro().equals(nome)) {
                return i;
            }
        }
        return 0;
    }
    @Override
    public String toString() {
        super.getNome();
        super.getRg();
        return "Passageiro [Nome = "+ super.getNome()
        +", RG = " + super.getRg()
        + ", Id da Bagagem = "+ getIdBagagem()
        + ", "+ passagens[listarPassagens(super.getNome())].toString() + " ]";
    
  }}

