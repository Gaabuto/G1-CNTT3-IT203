interface ISkill {
    void useUltimate(GameCharacter target);
}

abstract class GameCharacter {
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

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println(name + " nhận " + damage + " sát thương.");

        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục!");
        }
    }

    public void showStatus() {
        System.out.println("Tên: " + name + " | HP: " + hp);
    }
}

// ======================= WARRIOR =========================
class Warrior extends GameCharacter implements ISkill {

    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " tấn công thường!");
        target.takeDamage(attackPower);
    }

    @Override
    public void takeDamage(int damage) {
        int realDamage = damage - armor;
        if (realDamage < 0) {
            realDamage = 0;
        }

        hp -= realDamage;
        System.out.println(name + " nhận " + realDamage + " sát thương (đã trừ giáp).");

        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục!");
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " sử dụng chiêu cuối: Đấm ngàn cân!");
        int damage = attackPower * 2;

        target.takeDamage(damage);

        int selfDamage = (int)(hp * 0.1);
        hp -= selfDamage;
        System.out.println(name + " mất " + selfDamage + " HP do tác dụng phụ.");
    }

    @Override
    public void showStatus() {
        System.out.println("Tên: " + name +
                " | HP: " + hp +
                " | Armor: " + armor);
    }
}

// ======================= MAGE =========================
class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void attack(GameCharacter target) {
        if (mana >= 5) {
            System.out.println(name + " tung đòn phép!");
            target.takeDamage(attackPower);
            mana -= 5;
        } else {
            System.out.println(name + " cạn mana, đánh yếu!");
            target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " sử dụng chiêu cuối: Hỏa cầu!");

        if (mana >= 50) {
            mana -= 50;
            int damage = attackPower * 3;
            target.takeDamage(damage);
        } else {
            System.out.println("Không đủ mana để dùng chiêu cuối!");
        }
    }

    @Override
    public void showStatus() {
        System.out.println("Tên: " + name +
                " | HP: " + hp +
                " | Mana: " + mana);
    }
}

// ======================= MAIN =========================
public class project {

    public static void main(String[] args) {

        // Tạo nhân vật
        Warrior warrior = new Warrior("Thor", 150, 30, 10);
        Mage mage = new Mage("Merlin", 100, 25, 80);

        // Anonymous Class - Goblin
        GameCharacter goblin = new GameCharacter("Goblin", 80, 0) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm...");
                target.takeDamage(10);
            }
        };

        // Mảng nhân vật
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = warrior;
        characters[1] = mage;
        characters[2] = goblin;

        System.out.println("===== BẮT ĐẦU TRẬN ĐẤU =====");

        // Giả lập chiến đấu
        if (characters[0] != null && characters[1] != null) {
            characters[0].attack(characters[2]);
            characters[1].attack(characters[2]);
        }

        if (characters[2] != null) {
            characters[2].attack(characters[0]);
        }

        // Dùng chiêu cuối
        if (warrior instanceof ISkill) {
            ((ISkill) warrior).useUltimate(goblin);
        }

        if (mage instanceof ISkill) {
            ((ISkill) mage).useUltimate(goblin);
        }

        System.out.println("\n===== KẾT THÚC TRẬN ĐẤU =====");

        System.out.println("Tổng số nhân vật đã tạo: " + GameCharacter.count);

        System.out.println("\nTrạng thái cuối cùng:");
        for (GameCharacter character : characters) {
            if (character != null) {
                character.showStatus();
            }
        }
    }
}