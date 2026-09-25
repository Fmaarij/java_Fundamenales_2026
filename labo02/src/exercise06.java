void main() {
    /* Ecrire un programme qui vérifie qu’un nombre posséde une valeur de 1 à 10 */
    Scanner s = new Scanner(System.in);
    System.out.println("Veuillez entrer un nombre: ");
    int nbr = s.nextInt();
    boolean bool = false;
    //operation et affichage
    if (nbr >= 1 && nbr <= 10) {
        bool = true;
    }

    //affichage
    System.out.println("Est-ce que le nombre " + nbr + " est permis 1 à 10? " + bool + ".");
}