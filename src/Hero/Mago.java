
package Hero;

public class Mago extends Hero {
    public Mago(String nome, int idade) {
        super(nome, idade, "mago", 50);
    }

    @Override
    public int atacar() {
        System.out.println(this.getNome() + " (" + this.getTipo() + ", " +
                this.getIdade() + " anos) atacou usando magia!");

        return this.getDano();
    }
}
