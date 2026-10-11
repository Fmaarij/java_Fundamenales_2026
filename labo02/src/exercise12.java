void main() {
    /*crire un programme qui recoit 3 nombres en entrØe et qui, si deux d’entre eux ont la mŒme valeur,
    affiche cette valeur (le programme n’affiche rien dans le cas contraire).*/
    Scanner s = new Scanner(System.in);
    System.out.println("Veuillez entrez 3 chiffres un après l'autre: ");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();

    //operation et affichage
    if (a == b) {
        System.out.println(a);
    } else if (a == c) {
        System.out.println(a);
    } else if (b == c) {
        System.out.println(b);
    }

}