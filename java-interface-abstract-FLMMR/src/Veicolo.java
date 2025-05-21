public abstract class Veicolo {

    private String marca;
    private String modello;
    private int anno;

    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", anno=" + anno +
                '}';
    }
    public abstract void muovi(); // Metodo astratto che deve essere implementato dalle classi figlie
    public abstract void ferma(); // Metodo astratto che deve essere implementato dalle classi figlie
    public abstract void parcheggia(); // Metodo astratto che deve essere implementato dalle classi figlie
    public abstract void rifornisci(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void carica(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void scarica(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decolla(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterra(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaAereo(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraAereo(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaAuto(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraAuto(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaVolante(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraVolante(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaAereoVolante(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraAereoVolante(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaAutoVolante(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraAutoVolante(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaVolanteAereo(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraVolanteAereo(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaVolanteAuto(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraVolanteAuto(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaVolanteAereoAuto(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void atterraVolanteAereoAuto(); // Metodo astratto che deve essere implementato dalle classi figlie
    // public abstract void decollaVolanteAereoAuto(); // Metodo astratto che deve essere implementato dalle classi figlie

    
}
