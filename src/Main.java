
public class Main {
    public static void main(String[] args) {

        Encomenda encomendaInternacional = new Encomenda(10, 10, true);
        encomendaInternacional.setStrategy();
        encomendaInternacional.entregar();

        Encomenda encomendaAerea = new Encomenda(3, 4, false);
        encomendaAerea.setStrategy();
        encomendaAerea.entregar();

        Encomenda encomendaDrone = new Encomenda(20, 20, false);
        encomendaDrone.setStrategy();
        encomendaDrone.entregar();


    }
}

