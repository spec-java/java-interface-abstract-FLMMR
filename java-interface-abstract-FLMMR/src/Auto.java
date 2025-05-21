public class Auto extends Veicolo {
    private int numeroPorte;
    private String tipoCarburante;

    
    public Auto(String marca, String modello, int anno, int numeroPorte, String tipoCarburante) {
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
        this.tipoCarburante = tipoCarburante;
    }
    
    public int getNumeroPorte() {
        return numeroPorte;
    }
    
    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
    
    public String getTipoCarburante() {
        return tipoCarburante;
    }
    
    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }
    
    @Override
    public void ferma() {
        System.out.println("L'auto si è fermata.");
    }

    @Override
    public void muovi() {
        System.out.println("L'auto si sta muovendo.");
    }

    @Override
    public void rifornisci() {
        System.out.println("L'auto è stata rifornita.");
    }

    @Override
    public void parcheggia() {
        System.out.println("L'auto è stata parcheggiata.");
    }

    
    
}
