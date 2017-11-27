package com.example.dao;



import com.example.model.Files;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface FileDao {
	public int addfile(Files file)throws SQLException;
	public int deleteById(int id)throws SQLException;
	public ResultSet select()throws SQLException;
	public ResultSet findFileById(int id)throws SQLException;	
}
