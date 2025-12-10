public class Mage extends Hero implements MagicUser{
    private int mana;
    private final int MAX_MANA;
    Mage(String name, int health, int baseDamage, int maxMana) {
        super(name, health, baseDamage);
        this.MAX_MANA = maxMana;
    }

    @Override
    public void introduce(){
        System.out.println("Мое имя: " + this.getName() + "Всемогущий, я умею кастовать фаерболы разной величины в зависимости от маны :3");
    }
    @Override
    public int attack(){
        int calculatedDamage;
        if(mana > 50){
            mana -= 50;
            calculatedDamage = getBaseDamage() + 150;
            System.out.println("атака огромным фаерболом!!!");
            return calculatedDamage;
        } else if(mana > 20){
            mana -= 20;
            calculatedDamage = getBaseDamage() + 50;
            System.out.println("атака огненным шаром!");
            return calculatedDamage;
        } else {
            System.out.println("Недостаточно МАНЫ, нет МАНЫ. не хватает МАНЫ");
            return 0;
        }
    }

    @Override
    public int getCurrentMana() {
        return mana;
    }

    @Override
    public boolean canCastSpell(int manaCost) {
        return mana >= manaCost;
    }

    @Override
    public void restoreMana(int amount) {
        mana += amount;

    }
}
