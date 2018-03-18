package com.example.apicontroller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.bean.BaseBean;
import com.example.bean.DbBean;
import com.example.bean.UserBean;
import com.example.dao.ShareDao;
import com.example.dao.SportsDao;
import com.example.dao.UserDao;
import com.example.utils.ResultUtils;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

	@Autowired
	private UserDao userDao;
	@Autowired
	private ShareDao shareDao;
	@Autowired
	private SportsDao sportsDao;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public BaseBean<DbBean> getList(HttpServletRequest request) {
		DbBean bean = new DbBean();
		bean.setUserBeans(userDao.findAll());
		bean.setShareBeans(shareDao.findAll());
		bean.setSportsBeans(sportsDao.findAll());
		return ResultUtils.resultSucceed(bean);
	}

}
