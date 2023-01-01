package com.dailybuffer.filemgnt.service;

import java.util.List;

import com.dailybuffer.filemgnt.entity.FileDB;

public interface FileService {
	
				List<FileDB> getAllFiles();
				void saveAllFilesList(List<FileDB> fileList);

}
