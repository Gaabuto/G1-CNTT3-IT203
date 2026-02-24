public class Warrior extends GameCharacter implements ISkill {

    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " chém kiếm!");
        target.takeDamage(attackPower);
    }

    @Override
    public void takeDamage(int damage) {
        int realDamage = damage - armor;
        if (realDamage < 0) realDamage = 0;
        super.takeDamage(realDamage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " dùng chiêu ĐẤM NGÀN CÂN!");
        target.takeDamage(attackPower * 2);
        hp -= hp * 0.1; // mất 10% HP
    }

    public int getArmor() {
        return armor;
    }
}
