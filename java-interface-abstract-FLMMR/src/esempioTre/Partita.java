package esempioTre;

public class Partita implements GestioneGioco {

    private int idGiocatore;
    private int levelGame;
    private String statoGioco;

    public Partita(int idGiocatore, int levelGame, String statoGioco) {
        this.idGiocatore = idGiocatore;
        this.levelGame = levelGame;
        this.statoGioco = statoGioco;
    }
    

    public int getIdGiocatore() {
        return idGiocatore;
    }

    public void setIdGiocatore(int idGiocatore) {
        this.idGiocatore = idGiocatore;
    }

    public int getLevelGame() {
        return levelGame;
    }

    public void setLevelGame(int levelGame) {
        this.levelGame = levelGame;
    }

    public String getStatoGioco() {
        return statoGioco;
    }

    public void setStatoGioco(String statoGioco) {
        this.statoGioco = statoGioco;
    }
    
}
