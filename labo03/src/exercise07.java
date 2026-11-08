void main() {
    /*On suppose que l'utilisateur entre une suite d'entiers positifs, terminée par la valeur sentinelle -1.
    Votre programme doit acher le dernier nombre (hormis le -1) entré par l'utilisateur. Si l'utilisateur
    tape 5 3 4 1 6 3 -1, l'ordinateur ache : "Le dernier est : 3 ". Que fait votre programme si l'utilisateur
    tape uniquement -1 ?*/

    Scanner s = new Scanner(System.in);
    int n = 0;
    int cpt = 0;
    int dernierVal = 0;
    System.out.println("Entrer des valeur, pour arreter écrivez '-1' ");
    while (n != -1) {
        n = s.nextInt();
        cpt++;
        if (n != -1) {
            dernierVal = n;
        }
    }
    if (cpt == 1) {
        System.out.println("pas de valeur entrée.");
    } else {
        System.out.println("dernier valeur = " + dernierVal + ".");
    }

}