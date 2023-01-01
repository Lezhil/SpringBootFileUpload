package com.dailybuffer.filemgnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailybuffer.filemgnt.entity.FileDB;
import com.dailybuffer.filemgnt.repository.FileRepository;

@Service
public class FileServiceImplementation implements FileService {
	
		@Autowired
		FileRepository fileRepository;

	@Override
	public List<FileDB> getAllFiles() {
		// TODO Auto-generated method stub
		return fileRepository.findAll();
	}

	@Override
	public void saveAllFilesList(List<FileDB> fileList) {
		
		for(FileDB filedb:fileList){
			
			fileRepository.save(filedb);
		}
		
	}
		
				
}
