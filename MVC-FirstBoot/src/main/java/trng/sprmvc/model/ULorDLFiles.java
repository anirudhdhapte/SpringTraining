package trng.sprmvc.model;

import org.springframework.web.multipart.MultipartFile;

public class ULorDLFiles {
	private String name;
	private MultipartFile uploaddoc;

	public MultipartFile getUploaddoc() {
		return uploaddoc;
	}

	public void setUploaddoc(MultipartFile uploaddoc) {
		this.uploaddoc = uploaddoc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
