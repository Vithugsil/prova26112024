public class Encomenda {

    Integer altura;
    Integer largura;
    Boolean internacional;
    private iTransporte strategy;

    public Encomenda(Integer altura, Integer largura, Boolean internacional) {
        this.altura = altura;
        this.largura = largura;
        this.internacional = internacional;
    }

    public void setStrategy() {
        if (internacional) {
            this.strategy = new TransporteMaritmo();
        } else if (altura * largura < 15) {
            this.strategy = new TransporteAereo();
        } else if (altura * largura > 15) {
            this.strategy = new TransporteDrone();
        } else {
            this.strategy = new TransporteTerrestre();
        }
    }

    public void entregar(){
        this.strategy.entregar();
    }
}
