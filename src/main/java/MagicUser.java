public interface MagicUser {
    // древний контракт связывающий всех существ с миром магии :3
    public int getCurrentMana();
    public boolean canCastSpell(int manaCost);
    public void restoreMana(int amount);
}
