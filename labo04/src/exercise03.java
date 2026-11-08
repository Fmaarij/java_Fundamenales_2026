void main() {
/*Récrire un programme qui calcule la moyenne d’une série de n nombres entrées par l’utilisateur.
La valeur de n est fournie en préambule par l’utilisateur (cf. boucle while).*/

    Scanner s = new Scanner(System.in);

    System.out.println("Combien des nombre vous voulez entrer? ");
    int nbr = s.nextInt();
    int somme = 0;
    double moyenne = 0;


    for (int i = 1; i <= nbr; i++) {
        System.out.println("Veuillez entrer les nomres : ");
        somme += s.nextInt();
    }
    moyenne = (double) somme / nbr;
    System.out.println("Voila la moyene : " + moyenne);
}