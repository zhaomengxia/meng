package com.example.service;


import com.example.model.Files;

import java.util.ArrayList;

public interface FileService {

	public int addfile(String file_name, String file_desc, String file_auto_name, String user_name);
	public int delete(int id);
	public ArrayList<Files> selectAll();
	public Files selectById(int id);
}
