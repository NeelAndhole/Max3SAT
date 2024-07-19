
public class Clause {
  public int term1;
  public int term2;
  public int term3;

  public Clause(int term1, int term2, int term3) {
    this.term1 = term1;
    this.term2 = term2;
    this.term3 = term3;
  }

  public boolean isSatisfied(boolean[] literals) {
    boolean value1 = (term1 > 0) ? literals[term1] : !literals[-term1];
    boolean value2 = (term2 > 0) ? literals[term2] : !literals[-term2];
    boolean value3 = (term3 > 0) ? literals[term3] : !literals[-term3];
    return value1 || value2 || value3;
  }



}
