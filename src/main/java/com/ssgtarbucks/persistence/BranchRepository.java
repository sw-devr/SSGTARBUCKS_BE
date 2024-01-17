package com.ssgtarbucks.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssgtarbucks.domain.IncomeDTO;
import com.ssgtarbucks.domain.TotalDTO;
import com.ssgtarbucks.domain.UserDTO;

@Mapper
public interface BranchRepository {
	public List<TotalDTO> selectSearchBySearchWord(String searchWord);
	public List<TotalDTO> selectExpirationDateList(String branch_id, String curDate);
	public UserDTO selectUserAndBranchInfo(String branch_id);
}