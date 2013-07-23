package com.cs2c.dvs.label.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.dao.LabelDao;
import com.cs2c.dvs.label.service.LabelService;
import com.cs2c.dvs.pojo.Label;

public class LabelServiceImpl implements LabelService {

	private LabelDao dao;

	public void setDao(LabelDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Label> queryAllLabel() throws SQLException {
		//System.out.println("service:"+dao.queryAllLabel());
		return dao.queryAllLabel();
	}

	@Override
	public void addLabel(Label label) throws SQLException {
		dao.addLabel(label);
		System.out.println("service:"+label.getLabelName());
	}

	@Override
	public void deleteLabel(int labelId) throws SQLException {
		dao.deleteLabel(labelId);
		
	}

	@Override
	public void updateLabel(Label label) throws SQLException {
		dao.updateLabel(label);
		System.out.println("---service:"+label.toString());
	}

}
