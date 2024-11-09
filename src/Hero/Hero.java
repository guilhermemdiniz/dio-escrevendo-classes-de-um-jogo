
package Hero;

// Classe mãe para  Mago, Guerreiro, Monge e Ninja
public abstract class Hero {
    private String nome, tipo;
    private int idade, dano;

    public Hero(String nome, int idade, String tipo, int dano) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.dano = dano;
    }

    //Será implementada nas classes filhas
    public abstract int atacar();


    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
