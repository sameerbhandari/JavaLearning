package BuildUpLogicalThinking;

public class Patterns {
    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static  void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static  void pattern6(int n){
        for(int i= n; i>0; i--){
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static  void pattern9(int n){
        //upper half
        for(int i= 0; i<n; i++){
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<(i+i+1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      for(int i= n-2; i >=0; i--){
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<(i+i+1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static  void pattern17(int n){
        int A = 65;
        //upper half
        for(int i= 0; i<n; i++){
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<(i+1) ; j++){
                char charToPrint = (char) (A+j);
                System.out.print(charToPrint);
            }
            for(int j = 0; j<i ; j++){
                char charToPrint = (char) (A+j);
                System.out.print(charToPrint);
            }
            System.out.println();
        }
//        for(int i= n-2; i >=0; i--){
//            for(int j = n-1; j > i; j--){
//                System.out.print(" ");
//            }
//            for(int j = 0; j<(i+i+1) ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
