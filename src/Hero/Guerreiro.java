
package Hero;

public class Guerreiro extends Hero {
    public Guerreiro(String nome, int idade) {
        super(nome, idade, "guerreiro", 70);
    }

    @Override
    public int atacar() {
        System.out.println(this.getNome() + " (" + this.getTipo() + ", " +
                this.getIdade() + " anos) atacou usando espada!");

        return this.getDano();
    }
}
