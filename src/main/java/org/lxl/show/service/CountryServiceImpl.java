package org.lxl.show.service;

import java.util.List;

import javax.annotation.Resource;

import org.lxl.show.entity.Country;
import org.lxl.show.mapper.CountryMapper;
import org.springframework.stereotype.Service;

@Service("countryService")
public class CountryServiceImpl implements CountryService {
	@Resource
	private CountryMapper countryMapper;
	public List<Country> getAll() {
		return countryMapper.selectAll();
	}
}
