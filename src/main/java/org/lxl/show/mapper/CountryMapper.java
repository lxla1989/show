package org.lxl.show.mapper;

import java.util.List;

import org.lxl.show.entity.Country;

public interface CountryMapper {
	List<Country> selectAll();
	
	int updateByIdSelective(Country country);
}