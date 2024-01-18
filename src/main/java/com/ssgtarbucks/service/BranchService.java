package com.ssgtarbucks.service;

import java.util.List;

import com.ssgtarbucks.domain.IncomeDTO;
import com.ssgtarbucks.domain.StockLocationDTO;
import com.ssgtarbucks.domain.TotalDTO;
import com.ssgtarbucks.domain.UserDTO;

public interface BranchService {
	public List<TotalDTO> selectSearchBySearchWord(String searchWord);
	public List<TotalDTO> selectExpirationDateList(String branch_id, String curDate);
	public UserDTO selectUserAndBranchInfo(String branch_id);
	public void registerStockLocatioinWithTrans(List<StockLocationDTO> locationDTOList);

}
