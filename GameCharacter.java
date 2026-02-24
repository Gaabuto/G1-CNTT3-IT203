public abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;

    public static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục");
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}