
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args){
        //Polynomial p1 = new Polynomial("3*x^2-1*x^1+1");
        //Polynomial p2 = new Polynomial("1*x^1-2");

        Polynomial p1 = new Polynomial("6*x^1+1*x^3-2*x^2-5");
        Polynomial p2 = new Polynomial("1*x^2-1");

        //Polynomial p1 = new Polynomial("1*x^4-1");
        //Polynomial p2 = new Polynomial("1*x^2-1");

        //Polynomial p3 = new Polynomial("0*x^3+0*x^4+5*x^1+1");
        //System.out.println(p3.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println("Suma polinoamelor :");
        System.out.println(PolynomialOperations.addPolynomials(p1,p2).toString());

        System.out.println("Scaderea polinoamelor :");
        System.out.println(PolynomialOperations.subPolynomials(p2,p1).toString());

        System.out.println("Inmultirea polinoamelor:");
        System.out.println(PolynomialOperations.multiplicatePolynomials(p1,p2).toString());

        System.out.println("Polinomii ordonati descrescator:");
        Polynomial p1rev = new Polynomial(p1.toString());
        Collections.reverse(p1rev.getMonomialList());
        System.out.println(p1rev.toString());
        Polynomial p2rev = new Polynomial(p2.toString());
        Collections.reverse(p2rev.getMonomialList());
        System.out.println(p2rev.toString());

        Polynomial[] div = new Polynomial[2];
        div = PolynomialOperations.dividePolynomials(p1,p2);
        System.out.println("Catul impartirii:");
        System.out.println(div[0].toString());
        System.out.println("Restul impartirii:");
        System.out.println(div[1].toString());

        System.out.println("Derivatele polinoamelor:");
        System.out.println(PolynomialOperations.derivativePolynomial(p1).toString());
        System.out.println(PolynomialOperations.derivativePolynomial(p2).toString());

        System.out.println("Integralele polinoamelor: ");
        System.out.println(PolynomialOperations.integratePolynomial(p1));
        System.out.println(PolynomialOperations.integratePolynomial(p2));

    }
}
