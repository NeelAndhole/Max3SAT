import java.util.Random;
import java.util.Scanner;

/**
 * this question models the MAX3SAT problem with a goal of floor 7/8 * k clauses satisfied
 */
public class MAX3SATMain {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int numOfLiterals = Integer.parseInt(kb.nextLine());
    int numOfClauses = Integer.parseInt(kb.nextLine());
    boolean[] literals = new boolean[numOfLiterals + 1];
    Clause[] clauses = new Clause[numOfClauses];
    for (int i = 0; i < numOfClauses; i++) {
      String[] line = kb.nextLine().split(" ");
      clauses[i] = new Clause(Integer.parseInt(line[0]), Integer.parseInt(line[1]),
          Integer.parseInt(line[2]));
    }
    int numSatisfied = 0;
    Random random = new Random();
    while (numSatisfied < Math.floor(7.00 / 8.00 * numOfClauses)) {
      numSatisfied = 0;
      // get new assignments for variables
      for (int i = 1; i < literals.length; i++) {
        literals[i] = random.nextBoolean();
      }
      for (int i = 0; i < clauses.length; i++) {
        if (clauses[i].isSatisfied(literals)) {
          numSatisfied++;
        }
      }
    }
    // print valid output
    System.out.print(literals[1] ? 1 : -1);
    for (int i = 2; i < literals.length; i++) {
      System.out.print(" " + (literals[i] ? 1 : -1));
    }
    kb.close();
  }


}
