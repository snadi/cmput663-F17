import org.sat4j.MUSLauncher;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.*;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.xplain.HighLevelXplain;
import org.sat4j.tools.xplain.Xplain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;

/**
 * Created by snadi on 16-08-29.
 */
public class UnsatCore {

    public static void main(String args[]) {
        Xplain<ISolver> solver = new Xplain<ISolver>(SolverFactory.newDefault());
        ModelIterator mi = new ModelIterator(solver);
        solver.setTimeout(3600); // 1 hour timeout
        Reader reader = new InstanceReader(mi);

        // filename is given on the command line
        try {

            IProblem problem = reader.parseInstance(args[0]);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable");
            } else {
                System.out.println("Unsatisfiable");
                //Collection<IConstr> minConstraints = solver.explain();
                int[] explanation = solver.minimalExplanation();

                System.out.println("number of problematic clauses: " + explanation.length);
                System.out.println("clause indices: ");
                for (int clauseIndex : explanation) {
                    System.out.println("clause index: " + clauseIndex);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ContradictionException e) {
            System.out.println("Unsatisfiable (trivial)!");
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");
        }
    }
}
