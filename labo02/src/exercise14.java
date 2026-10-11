void main() {
//    a)
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0)
            if (a > 1)
                if (a > 2)
                    System.out.println(3);//si a>0 et a>1 et a>2
                else
                    System.out.println(2);//si a>0 et a>1 et a<=2
            else
                System.out.println(1);//si a>0 et a<=1
        else
            System.out.println("Erreur");//si a<=0

    //b)
    if(a > 2)
        System.out.println(3);//si a>2
    else if(a > 1)
        System.out.println(2);//si a<=2 et a>1
    else if(a > 0)
        System.out.println(1);//si a<=2 et a<=1 et a>0
    else
        System.out.println("Erreur");//si a<=0

    //c)

    if(a != 0) {
        if(a > 0)
            System.out.println("C’est bien");//si a!=0 et a>0
    }
    else
        System.out.println("C’est \"nul\"");//si a=0

    //d)
    if(a != 0)
        if(a > 0)
            System.out.println("C’est bien");//si a!=0 et a>0
        else
            System.out.println("C’est \"nul\"");//si a==0 Ou a<=0

    }











