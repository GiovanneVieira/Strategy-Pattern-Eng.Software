package engsoft.jogo.patos;

public class Pato_Atleta extends Pato<Padrao_Pulaveis> {

    public Pato_Atleta() {
        setComportamento(new Pulo_Alto());
    }

    @Override
    String mostrar() {
        return "Sou o pato atleta";
    }
}
