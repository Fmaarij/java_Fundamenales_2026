void main() {
/*  Réécrivez le même programme que pour l'exercice précédent, mais cette fois vous devez assurer que
    l'utilisateur entre un nombre (strictement) positif pour n. Vous devez l'obliger à recommencer si ce
    nombre n'est pas positif. */

    Scanner s = new Scanner(System.in);
    System.out.println("Combien de chifrer voulez vous inserer?");
    int n = s.nextByte();
    while (n<0){
        System.out.println("Vous avez entrez un chiffre negativ, veuillez entrez un chiffre positive!");
        n = s.nextByte();
    }

    int cpt = 0;
    int somme = 0;
    double moyenne = 0;

    while (n != cpt) {

        somme += s.nextInt();

        cpt++;
    }
    moyenne = somme / (double) n;
    System.out.println(moyenne);
}