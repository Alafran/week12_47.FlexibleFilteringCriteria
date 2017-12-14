
package reader.criteria;

public class Both implements Criterion {

    private Criterion criteriaOne;
    private Criterion criteriaTwo;
    
    public Both(Criterion criteriaOne, Criterion criteriaTwo) {
        this.criteriaOne = criteriaOne;
        this.criteriaTwo = criteriaTwo;
    }
    
    @Override
    public boolean complies(String line) {
       return this.criteriaOne.complies(line) && this.criteriaTwo.complies(line);
    }

}
