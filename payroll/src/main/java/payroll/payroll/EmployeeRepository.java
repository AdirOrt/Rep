package payroll.payroll;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;


@EntityScan
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}