package engsoft.jogo.patos;

public class Pato_Atleta extends Pato {

    public Pato_Atleta() {
        setComportamentoPulavel(new Pulo_Alto());
    }

    @Override
    String mostrar() {
        return "Sou o pato atleta";
    }
}

