void main() {
    /* Chercher l’erreur*/
    //8.a
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    //if (x = 0) {//x=0 initialise le variable x , il le ne compare pas, pour comparer il faut x==0!
        System.out.println("x est nul");
    //} else {
        System.out.println("x est non nul");
    }

//8.b
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();
    //if (x < y < z)//x<y && y<z
        //System.out.println("En ordre croissants");
//}