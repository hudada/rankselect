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
import com.example.bean.ShareBean;
import com.example.bean.UserBean;
import com.example.dao.ShareDao;
import com.example.dao.UserDao;
import com.example.utils.ResultUtils;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/share")
public class ApiShareController {

	@Autowired
	private ShareDao shareDao;

	@RequestMapping(value = "/change", method = RequestMethod.POST, produces = "application/json")
	public BaseBean<List<ShareBean>> getList(@RequestBody List<ShareBean> data) {
		for (ShareBean userBean : data) {
			shareDao.save(userBean);
		}
		return ResultUtils.resultSucceed(shareDao.findAll());
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public BaseBean<UserBean> addUser(HttpServletRequest request) {
		return ResultUtils.resultError("该账号已存在！");
	}

}
