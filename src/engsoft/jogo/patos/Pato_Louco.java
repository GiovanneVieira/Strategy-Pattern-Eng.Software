package engsoft.jogo.patos;

public class Pato_Louco extends Pato<Padrao_Pulaveis> {

    public Pato_Louco() {
        setComportamento(new Pulo_Desordenado());
    }

    @Override
    String mostrar() {
        return "Eu sou o pato louco";
    }
}
