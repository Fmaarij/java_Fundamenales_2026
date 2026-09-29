void main() {
    /* Ecrire un programme qui calcule le maximum de trois nombres.*/
    int a = 10;
    int b = 30;
    int c = 20;

    //analyse
    //pourque a soit le max,  il faut que a > b et a>c
    //pourque b soit le max,  il faut que a<b et b>c
    //pourque c soit le max,  il faut que c>b et c>a

    //opertion et l'affichage
    if (a > b && a > c) {
        System.out.printf(a + " est la maximum.");
    } else if (b > c) { //a<b && a<c
        System.out.println(b + " est la maximum.");
    } else { //a<b && a<c && b<c
        System.out.printf(c + " est la maximum.");
    }
}