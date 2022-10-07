/*
Enemy extends Npc (8 tasks)
 dibs LB - private instance vars for health, int magicWeakness, attackName
 dibs LB + NoArgsConstructor
 dibs LB + Enemy(String _name, String _description)
 dibs LB + String getAttackName()
 dibs AC + int getHealth
 dibs AC + int getMagicWeakness()
 dibs AC + void loseHealth(int h)
 dibs AC + void setAttackName()
*/
public class Enemy extends Npc
{
  // class variables
  private static int enemyCounter = 0;
  
  // class methods
  public static int getEnemyCounter()
  {
    return enemyCounter;
  }
  
  // instance variables
  // constructors
  // methods
  
}
