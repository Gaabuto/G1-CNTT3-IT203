public class ArenaOfHeroes {
    public static void main(String[] args) {

        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = new Warrior("Thor", 200, 30, 10);
        characters[1] = new Mage("Merlin", 150, 25, 100);

        // Anonymous Class - Goblin
        characters[2] = new GameCharacter("Goblin", 100, 0) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm...");
                target.takeDamage(10);
            }
        };

        // Simulation loop
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == null) continue;

            GameCharacter attacker = characters[i];
            GameCharacter target = characters[(i + 1) % characters.length];

            attacker.attack(target);

            if (attacker instanceof ISkill) {
                ((ISkill) attacker).useUltimate(target);
            }
        }

        // Thống kê
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Tổng số nhân vật: " + GameCharacter.count);

        for (GameCharacter c : characters) {
            if (c == null) continue;

            System.out.println("Tên: " + c.getName());
            System.out.println("HP: " + c.getHp());

            if (c instanceof Mage) {
                System.out.println("Mana: " + ((Mage) c).getMana());
            }
            if (c instanceof Warrior) {
                System.out.println("Armor: " + ((Warrior) c).getArmor());
            }
            System.out.println("-------------------");
        }
    }
}