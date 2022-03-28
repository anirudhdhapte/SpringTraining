package trng.sprmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPRING_ULNDL")
public class UploadFiles {

	@Column(name = "NAME")
	@Id
	private String name;
	@Column(name="PATH")
	private String path;	

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}
}
