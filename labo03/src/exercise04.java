void main() {
    /*Ecrire un programme qui détermine la plus grande valeur de n telle que la somme des n premiers
    entiers positifs soit inférieure à un nombre max (entier positif) entré par l'utilisateur. Par exemple
    si l'utilisateur entre la valeur 20, la réponse est 5 car 1 + 2 + 3 + 4 + 5 = 15 alors que 1 + 2 + 3
    + 4 + 5 + 6 = 21.*/
    Scanner s = new Scanner(System.in);
    System.out.println("Entrez le valeur de max : ");
    int max = s.nextInt();
    int cpt = 0;
    int somme = 0;
    int n = 0;
    while (somme < max) {
//        System.out.println("CPT = " + cpt);
//        System.out.println("SOMME = " + somme);
        n=cpt;
        cpt++;
        somme = somme + cpt;
    }
    System.out.println("Valeur entrée : "+max);
    System.out.println("La reponse : "+n);
}