package trng.sprms.aws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeBO {
private Integer empno;
private String ename;
private String job;
private Integer deptno;
}
