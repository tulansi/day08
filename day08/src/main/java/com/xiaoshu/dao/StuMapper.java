package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Stu;
import com.xiaoshu.entity.StuExample;
import com.xiaoshu.entity.StuVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuMapper extends BaseMapper<Stu> {

	List<StuVo> findStuPage(StuVo stuVo);
}