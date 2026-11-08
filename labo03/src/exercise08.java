void main() {
/* On suppose que l'utilisateur entre une suite d'entiers positifs, terminée par la valeur sentinelle -1.
Votre programme doit comparer le premier et le dernier élément de la suite et acher l'un des
messages suivants :
 Le premier est inférieur au dernier
 Le premier est égal au dernier
 Le premier est supérieur au dernier
 La suite est vide
La suite est vide si le premier nombre entré est -1. Si la suite ne compte qu'un élément, on considère
que le premier est égal au dernier.
*/
    Scanner s = new Scanner(System.in);
    int n = 0;
    int cpt = 0;
    int pVal = 0;
    int dVal = 0;
    System.out.println("Entrer des valeur, pour arreter écrivez '-1' ");
    while (n != -1) {
        n = s.nextInt();
        cpt++;
        if (n != -1) {
            if (cpt == 1) {//premier valeur
                pVal = n;
            }
            dVal = n;
        }
    }

    System.out.println("premier valeur = " + pVal);
    System.out.println("dernier valeur = " + dVal);

    if (pVal == dVal) {
        System.out.printf("Le premier valeur  " + pVal + " est égal au dernier valeur " + dVal);
    } else if (pVal > dVal) {
        System.out.printf("Premier Valeur " + pVal + " est supérieur au dernier valeur " + dVal);
    } else {
        System.out.printf("Le premier valeur  " + pVal + " est inférieur au dernier valeur " + dVal);
    }
}