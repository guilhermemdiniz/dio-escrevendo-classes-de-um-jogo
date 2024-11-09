
package Hero;

public class HeroFactory {
    public static Hero createHero(String nome, int idade, String tipo) throws Exception {
        if (idade < 0) throw new Exception("Idade negativa? Esse exagerou na porção de rejuvenescimento");
        else if (idade <= 5) throw new Exception("Um bebê deveria estar na creche a essa hora.");

        return switch (tipo.toLowerCase()) {
            case "mago" -> new Mago(nome, idade);
            case "guerreiro" -> new Guerreiro(nome, idade);
            case "monge" -> new Monge(nome, idade);
            case "ninja" -> new Ninja(nome, idade);
            default -> throw new Exception("Tipo de herói inválido.");
        };
    }
}
