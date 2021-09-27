import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heros = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero ("Vision", 3);
        Hero ironMan = new Hero ("Iron Man", 48);
        Hero scarletWitch = new Hero ("Scarlet Witch", 29);
        Hero thor = new Hero ("Thor", 1500);
        Hero hulk = new Hero ("Hulk", 49);
        Hero doctorStrange = new Hero ("Doctor Strange", 42);

        heros.add(blackWidow);
        heros.add(captainAmerica);
        heros.add(vision);
        heros.add(ironMan);
        heros.add(scarletWitch);
        heros.add(thor);
        heros.add(hulk);
        heros.add(doctorStrange);

        /*
        heros.add(new Hero ("Black Widow", 34));
        heros.add(new Hero("Captain America", 100));
        heros.add(new Hero ("Vision", 3));
        heros.add(new Hero ("Iron Man", 48));
        heros.add(new Hero ("Scarlet Witch", 29));
        heros.add(new Hero ("Thor", 1500));
        heros.add(new Hero ("Hulk", 49));
        heros.add(new Hero ("Doctor Strange", 42));
*/


        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501

        thor.setAge(1501);


        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heros);

        // TODO 5 : Keep only the half of the list
        List<Hero> herosHalfList = heros.subList((heros.size()/2), heros.size());
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : herosHalfList) {
            System.out.println(hero.getName());
        }
    }
}
