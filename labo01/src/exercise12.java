void main() {
    /* 12) Ecrire un programme qui calcule la durée d’un certain événement. Votre programme doit recevoir
en entrée l’instant du début de l’événement (en heure et minute) et l’instant de fin de l’événement
(aussi en heure et minute). Le programme doit alors calculer et afficher la durée (le temps écoulé
entre le début et la fin) de cet événement. On suppose que ces deux instants se situent durant la
même journée. Pouvez-vous exprimer cette durée en heure et en minutes? */

    int hDebut, minDebut, hFin, minFin, resH, resM;

    Scanner s = new Scanner(System.in);
    System.out.println("Quel est l'instant du début de l’événement en heure?");
    hDebut = s.nextInt();
    System.out.println("Quel est l'instant du début de l’événement en minute?");
    minDebut = s.nextInt();
    System.out.println("Quel est  l’instant de fin de l’événement en heure?");
    hFin = s.nextInt();
    System.out.println("Quel est  l’instant de fin de l’événement en minute?");
    minFin = s.nextInt();

    //operation
    resH = hFin - hDebut;
    resM = minFin - minDebut;

    //affichage
    System.out.println("ça donne " + resH + " heures et " + resM + " minutes comme durée.");

}