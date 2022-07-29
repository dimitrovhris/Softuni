package finalExamPreparation04;

import java.util.*;

public class Ex03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            String hero = input.split(" ")[0];
            int hp = Integer.parseInt(input.split(" ")[1]);
            int mp = Integer.parseInt(input.split(" ")[2]);
            heroes.put(hero, new ArrayList<>());
            heroes.get(hero).add(hp);
            heroes.get(hero).add(mp);
        }
        String input = sc.nextLine();
        while(!input.equals("End")){
            String command = input.split(" - ")[0];
            String heroName = input.split(" - ")[1];
            int currentHeroHp = heroes.get(heroName).get(0);
            int currentHeroMp = heroes.get(heroName).get(1);
            switch (command){
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(input.split(" - ")[2]);
                    String spellName = input.split(" - ")[3];
                    if(currentHeroMp >= mpNeeded){
                        heroes.get(heroName).set(1, currentHeroMp- mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                heroName, spellName, heroes.get(heroName).get(1));
                    }
                    else{
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(input.split(" - ")[2]);
                    String attacker = input.split(" - ")[3];
                    heroes.get(heroName).set(0, currentHeroHp - damage);
                    if(heroes.get(heroName).get(0) <= 0){
                        heroes.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    else{
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroName, damage, attacker, heroes.get(heroName).get(0));
                    }
                    break;
                case "Recharge":
                    int amountToRecharge = Integer.parseInt(input.split(" - ")[2]);
                    heroes.get(heroName).set(1, currentHeroMp + amountToRecharge);
                    if(heroes.get(heroName).get(1) > 200){
                        heroes.get(heroName).set(1, 200);
                        amountToRecharge = 200 - currentHeroMp;
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, amountToRecharge);
                    break;
                case "Heal":
                    int amountToHeal = Integer.parseInt(input.split(" - ")[2]);
                    heroes.get(heroName).set(0, currentHeroHp + amountToHeal);
                    if(heroes.get(heroName).get(0) > 100){
                        heroes.get(heroName).set(0, 100);
                        amountToHeal = 100 - currentHeroHp;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, amountToHeal);
                    break;
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : heroes.entrySet()) {
            System.out.println(entry.getKey());
            System.out.printf("  HP: %d%n", entry.getValue().get(0));
            System.out.printf("  MP: %d%n", entry.getValue().get(1));
        }

    }
}
