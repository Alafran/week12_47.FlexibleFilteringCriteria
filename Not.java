
package reader.criteria;

public class Not implements Criterion {

    private Criterion criterionToCheck;
    
    public Not(Criterion criterionToCheck) {
        this.criterionToCheck = criterionToCheck;
    }
    
    @Override
    public boolean complies(String line) {
        if(!this.criterionToCheck.complies(line)) {
            return true;
        }
        return false;
    }

}
