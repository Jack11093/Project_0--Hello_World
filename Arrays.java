public class Arrays {
   public static void main (String[] args){
    int x=5;
    int[] nums= new int[5];
    
    System.out.println(nums[nums.length-1]);

    nums[0]=27;
    nums[nums.length-1]=30;
    
    System.out.println(nums[nums.length-1]);

    for(int i=0; i<nums.length; i++){
        System.out.print(i+"->");
        System.out.println(nums[i]);
    }

    for(int i=0; i<nums.length; i++){
        nums[i]=i; //il valore dell'Array è la posizione dell'indice.
        System.out.println(nums[i]);
    }

    //Alle posizioni pari ci vuole il doppio della loro posizione
    //Alle posizioni dispari ci vuole il triplo della loro posizione
    System.out.println("******");

    for(int i=0; i<nums.length; i++){
        if(i%2==0){
            nums[i]=i*2;
        } else{
            nums[i]=i*3;
        }
    }
                
   //Creare una variabile che abbia come valore il massimo valore dell'Array, e stamparla
   System.out.println("******");
   
   int max=nums[0];
   for(int i=1; i<nums.length; i++){
    if(nums[i]>max){
        max=nums[i];
    }
   }

// Creare una variabile che abbia come valore il minimo valore dell'Array, e stamparla

    int min=nums[0];
    for (int i=1; i<nums.length; i++){
        if(nums[i]<min){
            min=nums[i];
        }
    }
    System.out.println(min);

// Creare una variabile che conterrà la somma di tutti gli elementi dell'Array

    double sum=0;
    for (int i=0; i<nums.length; i++) {
        //sum=sum+nums[i];
        sum+=nums[i];
    }
    System.out.println(sum);
    System.out.println(sum/nums.length);

    int temp=nums[0];
    nums[0]=nums[1];
    nums[1]=temp;
    System.out.println(nums[0]+" "+nums[1]);

    boolean found=false;
    int target=4;
    for (int i=0; i<nums.length; i++){
        System.out.println("Sto analizzando la posizione"+i);
        if(nums[i]==target){
            found=true;
            break;
        }
    }
    System.out.println(found);
    nums=new int [] {3, 9, 0, 9, 0};
    int repeated=1;
    for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]==nums[j]) {
                repeated++;
            }
        }
        if(repeated>1){
            break;
        }
    }
    System.out.println(repeated);

    int mode=-1;
    int pos=-1;
    int howMany=1;
    int value=-1;

    nums=new int [] {3, 9, 0, 9, 0};

    for (int i=0; i<nums.length-1; i++){
        howMany=1;
        for (int j=i+1; j<nums.length; j++) {
            if(nums[i]==nums[j]){
                howMany++;
            }
        }
        if(howMany>mode){
            mode=howMany;
            pos=i;
            value=nums[i];
            }
        }

    }
    System.out.println(mode+" "+pos+" "+nums[pos]+" "+value);


}
