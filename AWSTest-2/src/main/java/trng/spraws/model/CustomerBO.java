package trng.spraws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerBO {
	private String custname;
	private Integer custno;
	private String item;
	private Float amount;
}
