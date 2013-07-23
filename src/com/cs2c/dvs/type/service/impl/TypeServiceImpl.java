package com.cs2c.dvs.type.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.dao.TypeDao;
import com.cs2c.dvs.pojo.Type;
import com.cs2c.dvs.type.service.TypeService;

public class TypeServiceImpl implements TypeService {

	private TypeDao dao;
	
	
	public TypeDao getDao() {
		return dao;
	}


	public void setDao(TypeDao dao) {
		this.dao = dao;
	}


	@Override
	public Type queryTypeById(int typeId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.queryTypeById(typeId);
	}


	@Override
	public List<Type> queryAllType() throws SQLException {
		// TODO Auto-generated method stub
		return dao.queryAllType();
	}

}
