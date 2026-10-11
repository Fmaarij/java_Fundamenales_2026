void main() {
    /*Une entreprise de location de vØhicule loue ses vØhicules aux conditions suivantes :
    forfait journalier de 250 ¿.
    les 50 premiers kilomŁtres sont gratuits,
    les 450 km suivants sont 1,25 ¿ du km,
    les km suivants sont facturØs 1,25 ¿ du km majorØ de 10%.
    Calculez et a chez le montant payer pour une location de n jours et de x kilomŁtres parcourus,
    n et x Øtant entrØs par l’utilisateur.*/

    Scanner s = new Scanner(System.in);
    System.out.println("Pour combien des jours vous aimeriez loué la voiture? ");
    int n = s.nextInt();
    System.out.println("Combien des kilomètres allez vous parcourire? allé et rétour! ");
    double x = s.nextDouble();

    double prix_jour = 250;
    double facture = 0;
    double forfait = ((x - 500) * 10 / 100) * 1.25;

    if (x <= 50) {
        facture = (int) prix_jour * n;
        System.out.println("La location pour " + n + " jours et pour " + x + " kilométres à parcourir/parcouru vous côute " + facture+".");
    } else if (x > 50 && x <= 500) {
        facture = ((x - 50) * 1.25) + (n * prix_jour);
        System.out.println("La location pour " + n + " jours et pour " + x + " kilométres à parcourir/parcouru vous côute " + facture + ".");
    } else {
        facture = (((x - 50) * 1.25) + forfait + (n * prix_jour));
        System.out.println("La location pour " + n + " jours et pour " + x + " kilométres à parcourir/parcouru vous côute " + facture + ".");
    }
}