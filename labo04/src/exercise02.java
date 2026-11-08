void main() {
/*) Ecrire un programme qui affiche la table de multiplication d’un nombre entrée par l’utilisateur. Par
    exemple si l’utilisateur entre : 5, l’ordinateur affiche :
    1 x 5 = 5
    2 x 5 = 10
    . . .
    10 x 5 = 50
 */
    Scanner s = new Scanner(System.in);
    System.out.println("Entrez un chiffre dont le table de multiplication vous voulez voir: ");
    int nbr = s.nextInt();
    int somme = 0;
    for (int i = 1; i <= 10; i++) {
        somme = i * nbr;
        System.out.println(i + " x " + nbr + " = " + somme);
    }
}