package trng.spraws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeBO {
	private String ename;
	private Integer empno;
	private String job;
	private Integer deptno;
}
