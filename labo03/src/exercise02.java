void main() {
   /* Ecrire un programme qui calcule la moyenne d'une série de n nombres entrés par l'utilisateur. La
    valeur de n est fournie en préambule par l'utilisateur. Par exemple si l'utilisateur veut calculer la
    moyenne de 8 nombres, il entre d'abord 8 et ensuite, les 8 nombres :
    8
    5 9 -1 0 12 -7 -4 3
    l'ordinateur affiche : 2.125 */

    Scanner s = new Scanner(System.in);
    System.out.println("Combien de chifrer voulez vous inserer?");
    int n = s.nextByte();
    int cpt = 0;
    int somme = 0;
    double moyenne = 0;

    while (n != cpt) {//n != cpt ok mais les developpeur font comme cpt<n

        somme += s.nextInt();

        cpt++;
    }
    moyenne = somme / (double) n;
    System.out.println(moyenne);
}