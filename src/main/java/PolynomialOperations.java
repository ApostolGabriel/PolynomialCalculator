import java.util.*;
import java.lang.*;

public class PolynomialOperations {

    private static int getGrade(Polynomial p){
        int n=0;
        for(Monomial mono:p.getMonomialList()) {
            n = mono.getExponent();
        }
        return n;
    }

    public static Polynomial addPolynomials(Polynomial p1, Polynomial p2) {
        StringBuilder sumString = new StringBuilder();
        int p = 0,i = 0;
        int[] exponentsVisited = new int[Math.min(p1.getMonomialList().size(),p1.getMonomialList().size())+1];
        exponentsVisited[0] = -1;
        for (Monomial mono1 : p1.getMonomialList()) {
            for (Monomial mono2 : p2.getMonomialList()) {
                if (mono1.getExponent() == mono2.getExponent()) {
                    Monomial sumMono = new Monomial(mono1.getCoefficient() + mono2.getCoefficient(), mono1.getExponent());
                    sumString.append(sumMono.toString());
                    exponentsVisited[p++] = mono1.getExponent();
                }
            }
        }

        for(Monomial mono:p1.getMonomialList()){
            if(exponentsVisited[i]==mono.getExponent()){
                i++;
            }
            else {
                sumString.append(mono);
            }
        }
        i=0;
        for(Monomial mono:p2.getMonomialList()){
            if(exponentsVisited[i]==mono.getExponent()){
                i++;
            }
            else {
                sumString.append(mono);
            }
        }
        Polynomial sum = new Polynomial(sumString.toString());
        return sum;
    }

    public static Polynomial subPolynomials(Polynomial p1, Polynomial p2) {
        StringBuilder sumString = new StringBuilder();
        int p = 0,i = 0;
        int[] exponentsVisited = new int[Math.min(p1.getMonomialList().size(),p1.getMonomialList().size())+1];
        exponentsVisited[0]=-1;
        for (Monomial mono1 : p1.getMonomialList()) {
            for (Monomial mono2 : p2.getMonomialList()) {
                if (mono1.getExponent() == mono2.getExponent()) {
                    Monomial subMono = new Monomial(mono1.getCoefficient() - mono2.getCoefficient(), mono1.getExponent());
                    sumString.append(subMono.toString());
                    exponentsVisited[p++] = mono1.getExponent();
                }
            }
        }

        for(Monomial mono:p1.getMonomialList()){
            if(exponentsVisited[i]==mono.getExponent()){
                i++;
            } else {
                sumString.append(mono);
            }
        }
        i=0;
        for(Monomial mono:p2.getMonomialList()){
            if(exponentsVisited[i]==mono.getExponent()) {
                i++;
            } else {
                sumString.append(new Monomial(-mono.getCoefficient(), mono.getExponent()));
            }
        }
        Polynomial sum = new Polynomial(sumString.toString());
        return sum;
    }

    public static Polynomial multiplicatePolynomials(Polynomial p1,Polynomial p2){
        int k=0;
        Polynomial[] aux = new Polynomial[p1.getMonomialList().size()*p2.getMonomialList().size()];
        for(Monomial mono1:p1.getMonomialList()){
            StringBuilder mul = new StringBuilder();
            for(Monomial mono2:p2.getMonomialList()){
                Monomial mono = new Monomial(mono1.getCoefficient()* mono2.getCoefficient(),mono1.getExponent()+mono2.getExponent());
                mul.append(mono.toString());
            }
            aux[k++] = new Polynomial(mul.toString());
        }
        Polynomial mul = new Polynomial(aux[0].toString());
        for(int i=1;i<k;i++){
            mul = PolynomialOperations.addPolynomials(mul,aux[i]);
        }
        return mul;
    }

    public static Polynomial[] dividePolynomials(Polynomial p1,Polynomial p2){
        Polynomial p2rev = new Polynomial(p2.toString());
        int gradep1 = PolynomialOperations.getGrade(p1), gradep2 = PolynomialOperations.getGrade(p2);
        Collections.reverse(p2rev.getMonomialList());
        StringBuilder quotientString = new StringBuilder();
        Polynomial[] div = new Polynomial[2];
        if(gradep1>gradep2){
            Polynomial sub = new Polynomial(p1.toString());
            while(PolynomialOperations.getGrade(sub) >= PolynomialOperations.getGrade(p2)) {
                Collections.reverse(sub.getMonomialList());
                Monomial monoQuotient = new Monomial(sub.getMonomialList().get(0).getCoefficient() / p2rev.getMonomialList().get(0).getCoefficient(), sub.getMonomialList().get(0).getExponent() - p2rev.getMonomialList().get(0).getExponent());
                quotientString.append(monoQuotient.toString());
                Collections.reverse(sub.getMonomialList());
                sub = PolynomialOperations.subPolynomials(sub, PolynomialOperations.multiplicatePolynomials(p2, new Polynomial(monoQuotient.toString())));
            }
            Polynomial quotient = new Polynomial(quotientString.toString());
            div[0] = quotient;
            div[1] = sub;
            return div;
        }
        return div;
    }

    public static Polynomial derivativePolynomial(Polynomial p){
        StringBuilder derivString = new StringBuilder();
        for(Monomial mono:p.getMonomialList()){
            if(mono.getExponent()>0){
                Monomial derivMonomial = new Monomial(mono.getCoefficient()* mono.getExponent(),mono.getExponent()-1);
                derivString.append(derivMonomial.toString());
            }
        }
        Polynomial deriv = new Polynomial(derivString.toString());
        return deriv;
    }

    public static String integratePolynomial(Polynomial p){
        StringBuilder integralString = new StringBuilder();
        Polynomial prev = new Polynomial(p.toString());
        Collections.reverse(prev.getMonomialList());
        for(Monomial mono : prev.getMonomialList()){
            Monomial integralMonomial = new Monomial(mono.getCoefficient(), mono.getExponent()+1);
            int integralDenominator = mono.getExponent()+1;
            integralString.append("("+integralMonomial.toString()+")/"+integralDenominator+"+");
        }
        integralString.append("C");
        return integralString.toString();
    }
}
