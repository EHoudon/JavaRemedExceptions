public class Game {

    private Plateau lePlateauDeJeu;

    public Game(){

        lePlateauDeJeu = new Plateau();
        lePlateauDeJeu.initializePlateau(50);
    }

    public void avancerSurLePlateauEtAfficherContenuCase(){

        try{
            String contenudeLaCaseCourante = lePlateauDeJeu.avancerEtRetournerLeContenuDeLaCase(15);
            System.out.println(contenudeLaCaseCourante);
        } catch (MonException e){
            System.out.println(e.getMessage());
        }
    }
}
