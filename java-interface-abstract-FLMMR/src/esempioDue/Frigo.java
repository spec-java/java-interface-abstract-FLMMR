package esempioDue;

public class Frigo implements Connettibile {

   

    private String marca;
    private String modello;
    private int anno;
    private int potenza;

    public Frigo(String marca, String modello, int anno, int potenza) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.potenza = potenza;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return this.modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return this.anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getPotenza() {
        return this.potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    @Override
    public void connetti() {
        System.out.println("Frigo connesso.");
    }

    @Override
    public void disconnetti() {
        System.out.println("Frigo disconnesso.");
    }
	
}
