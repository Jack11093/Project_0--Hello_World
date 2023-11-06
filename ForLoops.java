public class ForLoops {
    public static void main (String[] args){
        boolean pippo = true;
        for(int i=0; i<4; i++){
            System.out.println("Siamo i campioni del mondo");
            if(pippo && i==1){
                System.out.println("Qui finisce il ciclo for");
                break;
            }    
        }
        //Stampiamo tutti i numeri interi da 10 a 0
        for(int i=10; i>=0; i--){
            System.out.println(i);

        //Stampiamo tutti i numeri interi da 10 a 0 ma solo i numeri pari
        for(int i=10; i>=0; i=i-2){
            System.out.println(i);

        for(int i=10; i>=0; i-=2){ //si può scrivere anche così
           System.out.println(i);

        for(int i=10; i>=0; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
        //Output finale: interrogare se un numero è pari o dispari
        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i + "è pari");
            }else{
                System.out.println(i + "è dispari");
            }
        }
    }
}    