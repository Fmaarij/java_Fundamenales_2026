void main() {
    /*  Ecrire un programme qui reçoit 3 nombres en entrée et qui affiche les deux plus grands. identifiez
        d'éventuels cas particuliers. */

    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int max1 = 0;
    int max2 = 0;

    //operation
    if (a >= b && a >= c) {
        if (b >= c) {
            max1 = a;
            max2 = b;
        } else {
            max1 = a;
            max2 = c;
        }
    } else if (b >= a && b >= c) {
        if (a >= c) {
            max1 = b;
            max2 = a;
        } else {
            max1 = b;
            max2 = c;

        }
    } else { //(c >= a && c >= b)
        if (b > a) {
            max1 = c;
            max2 = b;

        } else {
            max1 = c;
            max2 = a;
        }
    }
    //affichage

    System.out.println(max1 + " et " + max2 + " sont le deux nombre les plus grande.");
}

