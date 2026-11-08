void main() {
/* Considérons que l'utilisateur entre une suite de nombres strictement positifs terminée par la valeur
        sentinelle -1.

        1.On suppose, que la suite comporte au moins deux nombres (avant la sentinelle). Il
            est inutile de le vérier.
        2.Ecrire un programme qui détermine si, oui ou non, la suite est strictement
          croissante. Faut-il forcément attendre la sentinelle ou peut-on parfois répondre avant ?
    */

    Scanner s = new Scanner(System.in);
    int n = 0;
    int cpt = 0;
    int pVal = 0;
    boolean bool = false;
    System.out.println("Entrer des valeur, pour arreter écrivez '-1' ");
    while (n != -1) {
        n = s.nextInt();
        cpt++;
        if (n != -1) {
            if (cpt == 1) {//premier valeur
                pVal = n;
            } else if (pVal <= n) {
                pVal = n;
                bool = true;//prof dit pas le mettre en true!!!!!!!!! à voir
            } else {
                bool = false;
            }
        }

    }
    if (pVal == 0) {
        System.out.printf("Pas de valeur entrée");
    } else {
        System.out.printf("boolean = " + bool);
    }
}