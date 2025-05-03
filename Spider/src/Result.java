import java.util.List;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
        int soma = 0;
        for(Integer num : ar){
            soma +=  num.intValue();
        }
       return soma;
    }

}