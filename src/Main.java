public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setWeapon(WeaponType.STEEL);
        boss.setDamage(20);
        boss.setHealth(200);

        System.out.println("Boss Weapon: " + boss.getWeapon() + "; " + "Boss damage:" + " " + boss.getDamage() + "; " + "Boss health: " + boss.health + ".");
    }
}