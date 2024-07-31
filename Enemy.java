class Enemy extends Npc {
  private int health;
  private int magicWeakness;
  private String attackName;
  // Otros métodos y variables

  public Enemy(String _name, String _description) {
      super(_name, _description);
      this.health = 100; // Valor por defecto
  }

  public void loseHealth(int h) {
      this.health -= h;
      if (this.health <= 0) {
          System.out.println(this.getName() + " has been defeated!");
      }
  }

  // Otros métodos
}