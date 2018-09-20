package com.liangguowen.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liangguowen.common.pojo.R;
import com.liangguowen.pojo.TbUser;

public interface UserService {

	R checkData(String content, Integer type);
	R createUser(TbUser user);
	R userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
	R getUserByToken(String token);
}
