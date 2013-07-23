package com.cs2c.dvs.label.service;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.pojo.Label;

public interface LabelService {
	
	List<Label> queryAllLabel() throws SQLException;

	void addLabel(Label label) throws SQLException;
	
	void updateLabel(Label label) throws SQLException;
	
	void deleteLabel(int labelId) throws SQLException;
}
