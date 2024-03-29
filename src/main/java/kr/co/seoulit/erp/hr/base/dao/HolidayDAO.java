package kr.co.seoulit.erp.hr.base.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.seoulit.erp.hr.base.to.HolidayTO;


@Mapper
public interface HolidayDAO {
	
	public ArrayList<HolidayTO> selectHolidayList(String applyDay);
	public void insertHoliday(HolidayTO holiday);
	public void updateHoliday(HolidayTO holiday);
	public void deleteHoliday(String applyDay);
	
	public void insertPublicHoliday(HolidayTO holiday);
	
	String selectWeekDayCount(String startDate, String endDate);
	public void updateCodeList(HolidayTO holyday);
	public void insertCodeList(HolidayTO holyday);
	public void deleteCodeList(HolidayTO holyday);
}
