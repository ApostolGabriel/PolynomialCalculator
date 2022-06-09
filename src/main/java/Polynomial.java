import java.util.*;
import java.lang.*;

public class Polynomial {

    private List<Monomial> monomialList = new ArrayList<Monomial>();

    Polynomial(String s){

        monomialList = Parse.parsePolynomial(s);
        Collections.sort(monomialList,new SortbyExponent());
        for(Monomial mono:monomialList){
            if(mono.getCoefficient() == 0){
                monomialList.remove(mono);
            }
        }

    }



    public List<Monomial> getMonomialList(){
        return monomialList;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for(Monomial mono:monomialList){
            if(mono.getCoefficient() != 0) {
                string.append(mono.toString());
            }
        }
        return string.toString();
    }
}
class SortbyExponent implements Comparator<Monomial>{

    public int compare(Monomial m1, Monomial m2){
        return m1.getExponent()-m2.getExponent();
    }

}
