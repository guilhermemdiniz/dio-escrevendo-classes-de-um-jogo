
package Hero;

public class Ninja extends Hero {
    public Ninja(String nome, int idade) {
        super(nome, idade, "ninja", 40);
    }

    @Override
    public int atacar() {
        System.out.println(this.getNome() + " (" + this.getTipo() + ", " +
                this.getIdade() + " anos) atacou usando shuriken!");

        return this.getDano();
    }
}
