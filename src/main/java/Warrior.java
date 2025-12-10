import java.util.Random;
public class Warrior extends Hero implements Tank{
    private int armor;
    private final Random extraDamage = new Random();
    Warrior(String name, int health, int baseDamage, int armor) {
        super(name, health, baseDamage);
        this.armor = armor;
    }
    @Override
    public int attack(){
        int calculatedDamage = getBaseDamage() + extraDamage.nextInt(1, 70);
         System.out.println("Делает удар огромным двуручным мечом");
        return calculatedDamage;
    }
    @Override
    public int getArmor(){
        return this.armor;
    }

    @Override
    public void fortify() {
        armor += 30;
    }

    @Override
    public boolean canBlock() {
        return armor > 0;
    }
}
