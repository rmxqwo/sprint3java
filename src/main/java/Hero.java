import java.util.Random;

public class Hero {
    private String name;
    protected int health;
    private int baseDamage;
    private final Random extraDamage = new Random();

    Hero(String name, int health, int baseDamage){
        this.name = name;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public String getName(){
        return this.name;
    }
    public int getBaseDamage(){
        return this.baseDamage;
    }

    public int attack(){
        System.out.println("Наносит удар мечом");
        return baseDamage;
    }

    public void introduce(){
        System.out.println("Меня зовут: " + this.name);
    }

    protected void takeDamage(int damage){
        System.out.println("Получен урон: " + damage);
        this.health -= damage;
    }

    public boolean isAlive(){
        return health > 0;
    }


}
