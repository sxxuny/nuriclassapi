package kr.dataeum.nuriclassapi.common.controller;


import kr.dataeum.nuriclassapi.common.dto.CommonDefaultDto;
import kr.dataeum.nuriclassapi.common.ui.Pagination;

public class CommonDefaultController {

	protected void setPagination(Pagination pagination, CommonDefaultDto search) throws Exception {
		search.setPageUnit(search.getPageUnit());
		search.setPageSize(10);

		pagination.setCurrentPageNo(search.getPageIndex());
		pagination.setRecordCountPerPage(search.getPageUnit());
		pagination.setPageSize(search.getPageSize());

		search.setFirstIndex(pagination.getFirstRecordIndex());
		search.setLastIndex(pagination.getLastRecordIndex());
		search.setRecordCountPerPage(pagination.getRecordCountPerPage());
	}
}
