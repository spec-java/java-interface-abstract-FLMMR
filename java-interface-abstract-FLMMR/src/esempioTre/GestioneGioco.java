package esempioTre;

public interface GestioneGioco {

    public static void iniziaGioco() {
        System.out.println("Inizio del gioco");
    };
    
    public static void terminaGioco() {
        System.out.println("Fine del gioco");
    };
    
    public static void aggiornaStatoGioco(int idGiocatore, int levelGame) {
        System.out.println("Aggiornamento dello stato del gioco");
    };
    
    public static void mostraRisultati() {
        System.out.println("Mostra i risultati del gioco");
    };
    
}
