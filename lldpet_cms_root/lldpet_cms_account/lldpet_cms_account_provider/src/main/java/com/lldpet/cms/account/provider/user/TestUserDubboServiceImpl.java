package com.lldpet.cms.account.provider.user;

import com.lldpet.cms.service.account.user.ITestUserLoginDubboService;

public class TestUserDubboServiceImpl implements ITestUserLoginDubboService{

	@Override
	public String getUserName(String userName) {
		return "Hello "+userName;
	}

}
