package com.yxp.mapper;

import java.util.List;

import com.yxp.bean.Tuser1;

public interface UserMapper {
	public void save(Tuser1 user);
	public List<Tuser1>listAll();
}
