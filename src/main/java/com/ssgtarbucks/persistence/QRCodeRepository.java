package com.ssgtarbucks.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssgtarbucks.domain.QRCodeDTO;
import com.ssgtarbucks.domain.SearchDTO;
import com.ssgtarbucks.domain.StockLocationDTO;
import com.ssgtarbucks.domain.StorageDTO;

@Mapper
public interface QRCodeRepository {

	StorageDTO joinStroagebyQRCodeIdToSearch(int qrcode_id);
	
	List<SearchDTO> selectItemAndLocationToSearchbyQRcode(QRCodeDTO dto);

	int insertQrcodeToRegisterLocation(QRCodeDTO dto);

	int selectQrcodeIdToCount();

	int selectQrcodeIdToFind(String qrcode_value);

	int updateLocationToAddQrcodeId(StockLocationDTO dto);


}
