import java.util.Random;

public class MagicHat {
   public static void main (String[] args){
    String[] students=new String [] {
        "Paolo Lauria",
        "Luigi Palladino",
        "Francesca Daniele",
        "Giovanni Rinaldi",
        "Sara Sessa",
        "Francesco Moxedano",
        "Alessandro Esposito",
        "Giorgia Melillo",
        "Fabio Manna",
        "Bryan Augustin",
        "Salvatore Orecchio",
        "Gianluca Marano",
        "Marco Suriano",
        "Ciro Matarese",
        "Valentina Issich",
        "Michelangelo Muscatiello",
        "Giacomo Santi",
        "Karim",
        "Martina Casucci",
        "Alessio Del Punta",
        "Tommaso Mugnai",
        "Nicola Piacquaddio",
        "Bechir Labidi",
        "Mario Reda",
        "Federico Quai",
        "Donato Dipalma";
        "Alberto Cenni";
        "Renato Eva",
        "Daniele Schiavo"
        
    };

    final int NUM_HOUSES=4;
    final int DIM_HOUSES= students.length/NUME_HOUSES+1;

    String[] gryffindor=new String [DIM_HOUSES];
    String[] slytherin=new String [DIM_HOUSES];
    String[] hufflepuff=new String [DIM_HOUSES];
    String[] ravenclaw=new String [DIM_HOUSES];
    int iG=0, iS=0, iH=0, iR=0;

    
    Random hat=new Random();
    int destiny;

    for(int i=0; i<students.length; i++){
        boolean assigned=false
        do{

            destiny=hat.nextInt(NUM_HOUSES);

            switch(destiny){
                case 0:{        //if(destiny==){}
                    if(iG<DIM_HOUSES){
                        gryffindor[iG]=students[i];
                        iG++;
                        assigned=true;
                    }                 
                    break;
                
                case 1:{        //else if(destiny==1){}
                    if(iS<DIM_HOUSES){
                        slytherin[iS]=students[i];
                        iS++;
                        assigned=true;
                    }
                    break;
                
                case 2:{        //else if(destiny==2){}
                    if(iH<DIM_HOUSES){
                    hufflePuff[iH]=students[i];
                    iH++;
                    assigned=true;
                    }    
                    break;
                
                case 3:{       //else if(destiny==3){}
                    if(iR<DIM_HOUSES){
                    ravenCLaw[iR]=students[i];
                    iR++;
                    assigned=true;
                    }
                    break;
                
            }
        }while(!assigned);
        }
        
        for(int)
   }
}
