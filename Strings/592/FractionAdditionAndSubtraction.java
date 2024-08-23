class Solution {
    public String fractionAddition(String expression) {
        int nume = 0;
        int deno = 1;

        int i = 0;
        int n = expression.length();

        while (i < n) {
            int currNume = 0;
            int currDeno = 0;

            boolean isNegative = (expression.charAt(i) == '-');

            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                i++;
            }
   
           // numerator
            while (i < n && Character.isDigit(expression.charAt(i))) {
                int value = expression.charAt(i) - '0';
                currNume = (currNume * 10) + value;
                i++;
            }

            // to skip the /
            i++;

            if (isNegative) {
                currNume *= -1;
            }


            //denominator
            while(i<n && Character.isDigit(expression.charAt(i))){
                int value=expression.charAt(i)-'0';
                currDeno=(currDeno*10)+value;
                i++;
            }

            nume=nume*currDeno+currNume*deno;
            deno=deno*currDeno;



        }

         int gcd = gcd(Math.abs(nume), deno);

         nume/=gcd;
         deno/=gcd;


        return nume+"/"+deno;

    }
private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}