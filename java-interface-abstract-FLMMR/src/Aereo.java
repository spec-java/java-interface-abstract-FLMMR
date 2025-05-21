public class Aereo extends Veicolo implements Volante {
    private int numeroMotori;
    private String tipoAereo;

    
    public Aereo(String marca, String modello, int anno, int numeroMotori, String tipoAereo) {
        super(marca, modello, anno);
        this.numeroMotori = numeroMotori;
        this.tipoAereo = tipoAereo;
    }
    
    public int getNumeroMotori() {
        return numeroMotori;
    }
    
    public void setNumeroMotori(int numeroMotori) {
        this.numeroMotori = numeroMotori;
    }
    
    public String getTipoAereo() {
        return tipoAereo;
    }
    
    public void setTipoAereo(String tipoAereo) {
        this.tipoAereo = tipoAereo;
    }
    
    @Override
    public void ferma() {
        System.out.println("L'aereo si sta fermando.");
    }
    
    @Override
    public void muovi() {
        System.out.println("L'aereo si sta muovendo.");
    }
    
    @Override
    public void rifornisci() {
        System.out.println("L'aereo sta facendo rifornimento.");
    }
    
    @Override
    public void parcheggia() {
        System.out.println("L'aereo è parcheggiato.");
    }
    
    // volante
    @Override
    public void atterra() {
        System.out.println("L'aereo sta atterrando.");
    }

    @Override
    public void vola() {
        System.out.println("L'aereo sta volando.");
    }

    @Override
    public void decolla() {
        System.out.println("L'aereo sta decollando.");
    }



    
}
