package business_logic.working_days;

/**
 * @author balaji mohan
 *
 */

import java.time.LocalDate;

public interface IWorkingDays {
    LocalDate findFirstWorkingDate(LocalDate date);
}
