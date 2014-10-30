package dicegame;

import player.Player;
import player.PlayerComp;
import player.PlayerHuman;
import java.util.Random;

/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (komputer lub człowiek) stara się odgadnąć liczbę
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Obiekt gracza trzymamy w zmiennej obiektowej typu Player.
           Dzięki temu, że zastosowaliśmy dziedziczenie, możemy przypisać tej
           zmiennej obiekt klasy PlayerComp lub PlayerHuman. Obiekty obu klas
           mają metodę guess(), a to jest dla poniższego kodu najważniejsze.
        */
        
        Player player = new PlayerComp("Waldek");    //obiekt komputerowego gracza
//        Player player = new PlayerHuman("Marian");   //obiekt gracza-człowieka
        
        // próbujemy ustawić puste, czyli niepoprawne imię
        // ponieważ w metodzie setName() klasy Player rzucamy wyjątek,
        // a tu go nie przechwytujemy, aplikacja się wysypuje
//        player.setName("");
        
        // tutaj podobnie - próbujemy ustawić niepoprawne imię, ale robimy to
        // w bloku try-catch, dzięki czemu wszystko jest pod kontrolą
      /*  try {
            player.setName("");
            
            //poniższy komunikat wyświetli się tylko wtedy, gdy uda się ustawić imię
            System.out.println("Imię zmienione na: " + player.getName());
            
        } catch (IllegalArgumentException e) {
            
            //wyświetlamy komunikat przekazany w wyjątku
            //(ustawiony w chwili tworzenia obiektu wyjątku)
            System.out.println("Błąd! " + e.getMessage());
        }
     */   
       Game g = new Game();
       g.AddPlayer(player);
       g.start();
    }
    
}