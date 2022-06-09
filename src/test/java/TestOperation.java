import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestOperation {

    @Test
    public void addTest() {
        Polynomial p1 = new Polynomial("4*x^5-3*x^4+1*x^2-8*x^1+1");
        Polynomial p2 = new Polynomial("3*x^4-1*x^3+1*x^2+2*x^1-1");
        assertTrue(PolynomialOperations.addPolynomials(p1, p2).toString().equals("-6*x^1+2*x^2-1*x^3+4*x^5"));
    }

    @Test
    public void subTest() {
        Polynomial p1 = new Polynomial("4*x^5-3*x^4+1*x^2-8*x^1+1");
        Polynomial p2 = new Polynomial("3*x^4-1*x^3+1*x^2+2*x^1-1");
        assertTrue(PolynomialOperations.subPolynomials(p1, p2).toString().equals("+2*x^0-10*x^1+1*x^3-6*x^4+4*x^5"));
    }

    @Test
    public void mulTest() {
        Polynomial p1 = new Polynomial("3*x^2-1*x^1+1");
        Polynomial p2 = new Polynomial("1*x^1-2");
        assertTrue(PolynomialOperations.multiplicatePolynomials(p1, p2).toString().equals("-2*x^0+3*x^1-7*x^2+3*x^3"));
    }
    @Test
    public void divTest() {
        Polynomial p1 = new Polynomial("1*x^3-2*x^2+6*x^1-5");
        Polynomial p2 = new Polynomial("1*x^2-1");
        assertTrue(PolynomialOperations.dividePolynomials(p1, p2)[0].toString().equals("-2*x^0+1*x^1"));
        assertTrue(PolynomialOperations.dividePolynomials(p1, p2)[1].toString().equals("-7*x^0+7*x^1"));
    }
    @Test
    public void derivTest() {
        Polynomial p1 = new Polynomial("1*x^3-2*x^2+6*x^1-5");
        Polynomial p2 = new Polynomial("1*x^2-1");
        assertTrue(PolynomialOperations.derivativePolynomial(p1).toString().equals("+6*x^0-4*x^1+3*x^2"));
        assertTrue(PolynomialOperations.derivativePolynomial(p2).toString().equals("+2*x^1"));
    }
    @Test
    public void integTest() {
        Polynomial p1 = new Polynomial("1*x^3-2*x^2+6*x^1-5");
        Polynomial p2 = new Polynomial("1*x^2-1");
        assertTrue(PolynomialOperations.integratePolynomial(p1).equals("(+1*x^4)/4+(-2*x^3)/3+(+6*x^2)/2+(-5*x^1)/1+C"));
        assertTrue(PolynomialOperations.integratePolynomial(p2).equals("(+1*x^3)/3+(-1*x^1)/1+C"));
    }

}
