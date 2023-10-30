import java.util.ArrayList;

public class Plateau {

    private ArrayList<Case> monPlateau;

    private int positionSurLePlateau;

    public Plateau(){
        monPlateau = new ArrayList<Case>();
    }

    public void initializePlateau(int nbCases){

        for(int i = 0; i!=nbCases; ++i){
            monPlateau.add(new Case());
        }
    }

    public String avancerEtRetournerLeContenuDeLaCase(int distance) throws MonException {

        positionSurLePlateau += distance;

        if (positionSurLePlateau > 49){
            throw new MonException();
        }

        Case caseCourante = monPlateau.get(positionSurLePlateau);
        return caseCourante.getCaseContent();
    }
}
