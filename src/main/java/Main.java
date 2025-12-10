public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("John", 200, 40);

        Warrior warrior = new Warrior("Mario", 300, 100, 25);

        warrior.fortify();
        System.out.println(warrior.getArmor());

    }
}
