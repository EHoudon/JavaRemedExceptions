public class Main {
    public static void main(String[] args) {

        // Remed exception
        // On va voir:
        // 1 - Comment attraper une exception qui ne vient pas de notre code
        // 2 - Comprendre et analyser la cause d'une exception
        // 4 - Les conséquences de ne pas attraper une exception
        // 5 - Les conséquences du déclenchement d'une exception sur l'ordre d'exécution de notre programme
        // 5 - Déclencher nous même une exception et l'attraper

        Game leJeu = new Game();

        leJeu.avancerSurLePlateauEtAfficherContenuCase();
        leJeu.avancerSurLePlateauEtAfficherContenuCase();
        leJeu.avancerSurLePlateauEtAfficherContenuCase();
        leJeu.avancerSurLePlateauEtAfficherContenuCase();
    }
}