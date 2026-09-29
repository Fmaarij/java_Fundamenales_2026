void main() {
    /*  Ecrire un programme qui reçoit 3 nombres en entrée et qui affiche les deux plus grands. identifiez
        d'éventuels cas particuliers. */

    int a = 2;
    int b = 3;
    int c = 1;
    int max1 = 0;
    int max2 = 0;

    if (a > b) {
        if (b > c) {
            max1 = a;
            max2 = b;
            System.out.println(max1 + " " + max2);
        } else {
            max1 = a;
            max2 = c;
            System.out.println(max1 + " " + max2);
        }

    } else {///erreur here to be continued
        max1 = b;
        max2 = c;
        System.out.println(max1 + " " + max2);
    }
}

//System.out.println(a + " et " + b + " sont le deux nombre les plus grande.");