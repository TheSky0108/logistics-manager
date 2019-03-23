package com.bobo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bobo.dto.BasicDataDto;
import com.bobo.pojo.BasicData;
import com.bobo.service.IBasicService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/basic")
public class BasicDataController {

	@Resource
	private IBasicService basicService;
	
	@RequestMapping("/query")
	public String queryPage(BasicDataDto dto,Model model){
		PageInfo<BasicData> pageInfo = basicService.queryPage(dto);
		model.addAttribute("pageModel", pageInfo);
		return "basic/basic";
	}
	
	@RequestMapping("/basicUpdate")
	public String basicUpdate(Integer id,Model m){
		basicService.getUpdateInfo(id,m);
		return "basic/basicUpdate";
	}
	@RequestMapping("/saveOrUpdate")
	public String saveOrUpdate(BasicData bd){
		if(bd.getParentId()==0){
			bd.setParentId(null);
		}
		basicService.addBasicData(bd);
		return "redirect:/basic/query";
	}
}