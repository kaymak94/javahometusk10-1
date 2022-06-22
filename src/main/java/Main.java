import ru.netology.manager.FilmsManager;
import ru.netology.domain.FilmsList;

public class Main {


    public static void main(String[] args) {
        FilmsList one = new FilmsList("Kill Bill");
        FilmsList two = new FilmsList("1+1");
        FilmsList three = new FilmsList("Titanic");
        FilmsList four = new FilmsList("Avatar");
        FilmsList five = new FilmsList("Godfather");
        FilmsList six = new FilmsList("K-pax");
        FilmsList seven = new FilmsList("Calvary");
        FilmsList eight = new FilmsList("Mortal Kombat");
        FilmsList nine = new FilmsList("Professor");
        FilmsList ten = new FilmsList("Her");
        FilmsList eleven = new FilmsList("Penelope");

        FilmsManager manager = new FilmsManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        FilmsList[] findAll = manager.findAll();
        FilmsList[] findLast = manager.findLast();
    }

}

