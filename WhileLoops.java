public class WhileLoops {
   public static void main (String[] args){
//        int i=0;
//        while(true){
//           System.out.println(i);
//           i+=1;
//        }
//    }
//}
// public class WhileLoops {
//     public static void main (String[] args){
//         int i=500;
//         while(i<4000){
//             try {
//                 Thread.sleep(2000); //millis
//                 } catch (InterruptedException e) {
//                    System.err.println(e);
//                 }
        
//             System.out.println(i);
//             i+=500;
//         }
//         double randNum=Math.random(); //Math.random genera solo da 0 a 1
//         while(randNum<0.5){
//             randNum=Math.random();
//         }
//         System.out.println(randNum);
        double ranN;
        do{
            double randN=Math.random();
            System.out.println(randN);
        }while(randN<0.5);
    }
}