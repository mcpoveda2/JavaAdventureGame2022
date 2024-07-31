
import java.util.Random;
import java.util.Scanner;


class GameFacade {
    private Room currentRoom;
    private Enemy enemy;
    private Random rng;
    public static boolean isGameWon = false;

    // Constructor inicializa todas las dependencias internas del subsistema
    public GameFacade() {
        this.currentRoom = new Room("Main Hall");
        this.enemy = new Enemy("Goblin", "A scary goblin");
        this.rng = new Random();
    }

    // Método de alto nivel para iniciar el juego
    public void startGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the game!");

        while (!isGameWon) {
            System.out.print("Enter command: ");
            String command = input.nextLine();
            handleCommand(command);
        }
    }

    // Método para manejar comandos
    private void handleCommand(String command) {
        if (command.equals("look")) {
            System.out.println(currentRoom);
        } else if (command.equals("fight")) {
            fightEnemy();
        } else {
            System.out.println("Unknown command");
        }
    }

    // Método encapsulado para manejar la lógica de combate
    private void fightEnemy() {
        int attack = rng.nextInt(10) + 1;
        System.out.println("You attack the " + enemy.getName() + " for " + attack + " damage.");
        enemy.loseHealth(attack);
    }
}