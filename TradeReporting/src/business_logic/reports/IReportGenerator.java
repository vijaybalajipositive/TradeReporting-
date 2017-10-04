package business_logic.reports;

/**
 * @author balaji mohan
 *
 */
import model.instruction.Instruction;

import java.util.Set;

public interface IReportGenerator {
    String generateInstructionsReport(Set<Instruction> instructions);
}
