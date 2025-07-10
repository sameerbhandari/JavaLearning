package concepts.BuildUpLogicalThinking.DynamicProgramming;

public class FindWaterInGlass {


    public static double getWaterInGlass(int amount, int row, int column){
        double[][] amountArray = new double[amount + 1][amount + 1];
        amountArray[0][0] = amount;
        for(int i = 0; i < amountArray.length; i++){
            for(int j = 0; j <= i; j++){
                double currentAmount = amountArray[i][j];
                if(currentAmount > 1.0){
                    double spare = currentAmount - 1.0;
                    amountArray[i][j] = 1.0;
                    amountArray[i+1][j] = spare/2.0;
                    amountArray[i+1][j+1] = spare/2.0;
                }
            }
        }
        return amountArray[row-1][column-1];
    }

    public static void main(String[] args) {
        int k = 3;
        int r = 2;
        int c = 1;
        System.out.println(getWaterInGlass(k,r,c));
    }
}
