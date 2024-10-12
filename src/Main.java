public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(150, 20, "Flight");
        Hero hero2 = new Hero(120, 30, "Invisibility");
        Hero hero3 = new Hero(100, 25);

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
