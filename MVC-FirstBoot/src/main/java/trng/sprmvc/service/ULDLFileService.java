package trng.sprmvc.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import trng.sprmvc.entity.UploadFiles;
import trng.sprmvc.model.ULorDLFiles;
import trng.sprmvc.repo.UploadNDownloadRepo;

@Component
public class ULDLFileService {
	
	@Autowired
	private UploadNDownloadRepo undrepo;
	
	public String uploadfile(ULorDLFiles uf) throws IOException {
	File file=new File("E:/spruploads");
	if(!file.exists())
		file.mkdir();
	String filename=uf.getUploaddoc().getOriginalFilename();
	if(filename.lastIndexOf("\\")!=-1)
		filename=filename.substring(filename.lastIndexOf("\\")+1);
	OutputStream os=new FileOutputStream(file.getAbsolutePath().replace("\\","/")+"/"+filename);
	InputStream is=uf.getUploaddoc().getInputStream();
	IOUtils.copy(is, os);
	UploadFiles uf1=new UploadFiles();
	String path=file.getAbsolutePath().replace("\\","/");
	uf1.setName(uf.getName());
	uf1.setPath(path+"/"+filename);
	undrepo.save(uf1);
	os.close();
	is.close();
	return "File Uploaded";
}
	public Iterable<UploadFiles> listfiles() {
	return undrepo.findAll();
	}
}
