package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.StuMapper;
import com.xiaoshu.entity.Stu;
import com.xiaoshu.entity.StuVo;

@Service
public class StuService {

@Autowired
private StuMapper stuMapper;

public PageInfo<StuVo> findStuPage(StuVo stuVo, Integer pageNum, Integer pageSize, String ordername, String order) {
	// TODO Auto-generated method stub
	PageHelper.startPage(pageNum, pageSize);
	List<StuVo> list = stuMapper.findStuPage(stuVo);
	return new PageInfo<>(list);
}

public void deleteStu(int parseInt) {
	// TODO Auto-generated method stub
	stuMapper.deleteByPrimaryKey(parseInt);
}

public void updateStu(Stu stu) {
	// TODO Auto-generated method stub
	stuMapper.updateByPrimaryKeySelective(stu);
}

public void addStu(Stu stu) {
	// TODO Auto-generated method stub
	stuMapper.insert(stu);
}

public List<StuVo> findAll(StuVo stuVo) {
	// TODO Auto-generated method stub
	return stuMapper.findStuPage(stuVo);
}


}
