void main() {
    /* Écrire un programme qui ache tous les nombres entiers strictement positifs dont le carré est
        inférieur à un nombre entier n entré par l'utilisateur. Si l'utilisateur entre 20, l'ordinateur affiche 1
        2 3 4 */

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int cpt = 1;//3,
    while (cpt * cpt < n) {
        System.out.print(cpt + " ");
        cpt++;

    }
}
