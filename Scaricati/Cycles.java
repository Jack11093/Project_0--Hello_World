public class Cycles {
    public static void main(String[] args)
    {
        // for(i = 0; i < 4; i++)
        // {
        //     System.out.println("ciclo for n. " + (i + 1));
        //     if(i == 1)
        //     {
        //         break;
        //     }
        // }

        //Stampiamo i numeri da 10 a 0 pari

        // for(i = 10; i >= 0; i--)
        // {
        //     if(i % 2 == 0)
        //     {
        //         System.out.println(i);
        //     }
        // }

        System.out.println();
        System.out.println();

        // Stampiamo i numeri da 1 a 10 specificando se sono pari o dispari

        // for(i = 1;i <= 10; i++)
        // {
        //     if(i % 2 == 0)
        //     {
        //         System.out.println(i + " e' pari");
        //     }
        //     else
        //     {
        //         System.out.println(i + " e' dispari");
        //     }
        // }

        // while(j < 4)
        // {
        //     System.out.println("ciclo while n. " + (++j));
        // }

        //generare un numero casuale maggiore di 0.5 e stamparlo

        // double random = Math.random();

        // while(random <= 0.5)
        // {
        //     System.out.println(random);

        //     random = Math.random();
        // }
        // System.out.println(random);

        double random;
        do{
            random = Math.random();
        }while(random >= 0.5);
        
        System.out.println(random);
    }
}
