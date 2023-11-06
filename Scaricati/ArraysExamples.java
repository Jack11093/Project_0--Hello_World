public class ArraysExamples {
    public static void main(String[] args){

        int x = 5;
        int[] nums = new int[x];

        // System.out.println("grandezza array: " + nums.length);

        nums[0] = 27;
        nums[nums.length - 1] = 30;

        // for(int i = 0; i < nums.length; i++){
        //     System.out.println("Valore in pos. " + (i + 1) + ": " + nums[i]);
        // }

        // System.out.println();
        // //assegnare il numero dell' indice a tutte le posizioni

        for(int i = 0; i < nums.length; i++){
            nums[i] = i;
        }

        // for(int i = 0; i < nums.length; i++){
        //     System.out.println("Es 1 Valore in pos. " + i + ": " + nums[i]);
        // }

        // System.out.println();

        // //assegnare il doppio dell'indice alle posizioni pari e il triplo alle pos dispari

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = 2 * i;
            } else {
                nums[i] = 3 * i;
            }
        }

        // for(int i = 0; i < nums.length; i++){
        //     System.out.println("Es 2 Valore in pos. " + i + ": " + nums[i]);
        // }

        System.out.println();
        
        int     sum = nums[0];
        int     max = nums[0];
        int     min = nums[0];
        double  avg;

        for(int i = 1; i < nums.length; i++){
            if( max < nums[i]){
                max = nums[i];          //Creare una variabile che abbia il valore del massimo valore nell'array
            }
            if( min > nums[i]){
                min = nums[i];          //Creare una variabile che abbia il valore del minimo nell' array
            }

            sum    += nums[i];          //Creare una variabile che sommi i valori nell' array
        }
        avg = ((double)sum)/nums.length;  //Valore medio

        System.out.println("Il min degli elementi è: " + min);
        System.out.println("Il max dell'array è: " + max);
        System.out.println("La somma degli elementi è: " + sum);
        System.out.println("La media degli elementi è: " + sum + "/" + nums.length + " = " + avg);

        System.out.println();

        // sostituire 2 elementi dell' array
        int temp    = nums[0];
        nums[0]     = nums[1];
        nums[1]     = temp;

        //Cercare un valore in un array
        boolean found   = false;
        int     target  = 4;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]  == target){
                found   = true;
                break;
            }
        }
        System.out.println("Trovato il numero " + target + "? " + found);


        //cercare il numero più ripetuto di tutti
        nums = new int[] {3,9,0,9,0};
        int count = 0, maxCount = 0, mode = -1;

        for(int i = 0; i < nums.length; i++){
            System.out.println("Valore in pos. " + i + ": " + nums[i]);
        }

        for(int i = 0; i < nums.length - 1; i++){
            count = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(maxCount < count){
                maxCount    = count;
                mode        = nums[i];
            }
        }

        System.out.println(mode + " è stato ripetuto " + (maxCount + 1) + " volte");
    }
}
