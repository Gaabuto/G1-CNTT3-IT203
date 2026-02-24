public class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        if (mana >= 5) {
            System.out.println(name + " bắn phép!");
            target.takeDamage(attackPower);
            mana -= 5;
        } else {
            System.out.println(name + " hết mana, đánh thường yếu!");
            target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            System.out.println(name + " tung HỎA CẦU!");
            mana -= 50;
            target.takeDamage(attackPower * 3);
        } else {
            System.out.println(name + " không đủ mana để dùng Hỏa Cầu!");
        }
    }

    public int getMana() {
        return mana;
    }
}