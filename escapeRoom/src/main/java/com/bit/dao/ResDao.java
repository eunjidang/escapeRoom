package com.bit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.ResManager;
import com.bit.vo.ResVo;

@Repository
public class ResDao {
	public List<ResVo> selectRes() {
		return ResManager.selectRes();
	}
}
