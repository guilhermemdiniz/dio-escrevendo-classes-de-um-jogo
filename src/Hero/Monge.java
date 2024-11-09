
package Hero;

public class Monge extends Hero {
    public Monge(String nome, int idade) {
        super(nome, idade, "monge", 60);
    }

    @Override
    public int atacar() {
        System.out.println(this.getNome() + "(" + this.getTipo() + ", " +
                this.getIdade() + " anos) atacou usando artes marciais!");

        return this.getDano();
    }
}
