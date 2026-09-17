void main() {
    /* Ecrire un programme qui calcule et affiche la somme de 4 nombres entrés par l’utilisateur. Votre
       programme peut n’utiliser qu’une seule variable numérique. */

    int nombres;

    Scanner s = new Scanner(System.in);

    nombres = s.nextInt() + s.nextInt() + s.nextInt() + s.nextInt();
//    nombres += s.nextInt();
//    nombres += s.nextInt();
//    nombres += s.nextInt();

    //affichage
    System.out.println("Somme = " + nombres + ".");


}