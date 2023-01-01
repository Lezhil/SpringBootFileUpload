package com.dailybuffer.filemgnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name = "files_DB")
public class FileDB {
		@Id 
	   
	    // @GeneratedValue annotation Provides for the
	    // specification of generation strategies
	    // for the values of primary keys
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	    // @Column annotation specifies
	    // the name of the column
	    @Column(name = "id")
	    long id;
	    @Column(name = "name")
	    String fileName;
	    @Lob
	    @Column(name = "content")
	    String content;
	    @Column(name = "filetype")
	    private String fileType;
	
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getFileType() {
			return fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
		public FileDB(String fileName, String content, String fileType) {
			super();
			this.fileName = fileName;
			this.content = content;
			this.fileType = fileType;
		}
		public FileDB() {
			super();
		}
	    
	    
  
}