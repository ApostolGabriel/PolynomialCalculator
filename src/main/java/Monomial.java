public class Monomial {

    private int exponent;
    private int coefficient;

    Monomial(int coef, int exp){
        this.exponent = exp;
        this.coefficient = coef;
    }

    public int getExponent(){
        return this.exponent;
    }

    public int getCoefficient(){
        return this.coefficient;
    }

    @Override
    public String toString(){
        if(this.coefficient > 0) {
            return "+" + this.coefficient + "*x^" + this.exponent;
        }
        else if(this.coefficient < 0){
            return this.coefficient + "*x^" + this.exponent;
        }
        else return "";
    }
}
