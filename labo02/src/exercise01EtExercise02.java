void main() {
    //1.a
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > b)
            b = 2;
        System.out.println(a + b);
        //si a =5 b = 2 ça affiche 7
        //si a =1 b = 0 ça affiche 3
    }
    //1.b
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 2) {
            System.out.print("vive");
            if (b < 5) {
                System.out.print(" la");
            } else {
                System.out.print("ment");
            }
            System.out.println(" mariee");
            //si a = 5 b = 5 ça affiche  vivementmariee
            //si a = 5 b = 2 ça affiche  vivelamariee
            //si a = 1 b = 0 ça affiche  lamariee

        }
    }
//2.a
    {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        if (a > 0) {
//            if (a > 1) {
//                System.out.println("Beaucoup");
//            } else {
//                System.out.println("Un");
//            }
//        } else if (a > 1) {
//            System.out.print("Zut");
//        } else {
//            System.out.println("Peu");
//        }
        // Optimisation
        int a = 1;
        if (a > 1) {
            System.out.println("Beaucoup");
        } else if (a > 0 && a <= 1) { // on peut ecrire ça aussi a==1
            System.out.println("Un");
        } else if (a <= 0 && a > 1) {
            System.out.print("Zut");//Zut ne sera jamais affiché car a n'est pas être à la fois plus petit ou egal à 0 et à la fois plus grand de 1!
        } else {
            System.out.println("Peu");
        }
        //2.b
        {
/*
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
if (a > 0)
	if (b > 1)
		System.out.println("Bonjour");
	else
		System.out.println("Salut");
else
	if (b > 1)
		System.out.println("Coucou");
	else
		System.out.println("Salut");

*/

//Analyse
//a>0 && b>1 -> Bonjour
//a>0 && b<=1 -> Salut //a && b == 1
//a<=0 && b>1 -> Coucou
//a<=0 && b<=1 -> Salut
//Optimisation
            a = 1;
            int b = 2;
            if (a > 0 && b > 1) {
                System.out.println("Bonjour");
            } else if (b <= 1) {
                System.out.println("Salut");
            } else if (a <= 0 && b > 1) {
                System.out.println("Coucou");
            }
        }
    }

}
