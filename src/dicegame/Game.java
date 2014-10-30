package dicegame;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import player.Player;

public class Game {
    //ArrayList
   // private Player Player;
    
   private List<Player> players = new ArrayList<Player>();
   
    public void AddPlayer(Player player)
    {
        this.Player = player;
    }
    
   public void start()
   {
        Random dice = new Random();     //obiekt losujący (kostka)
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane (number): " + number);

            guess = Player.guess();     //wywołujemy metodę guess() obiektu gracza (klasy PlayerComp lub PlayerHuman)
            
            System.out.println("Gracz " + Player.getName() + ": " + guess); //wyświetlamy informację zawierającą imię gracza i jego propozycję
            
            if (number == guess) {
                System.out.println("BRAWO!");
            } else {
                System.out.println("PUDŁO!");
            }
            
            System.out.println("---------------------------------------------");
        
        } while (number != guess);
   }
   
   public void AddPlayer()
   {
       
   }
    
}
