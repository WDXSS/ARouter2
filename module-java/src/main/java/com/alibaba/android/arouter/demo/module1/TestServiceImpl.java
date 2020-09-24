package com.alibaba.android.arouter.demo.module1;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * TestServiceImpl简介
 *
 * @author ext.zhouchao3
 * @date 2020-09-23 16:24
 */

@Route(path = "/TestServiceImpl/java", name = "测试服务" )
public class TestServiceImpl implements IProvider {


	public String getInfo(){
		return "TestServiceImpl -- getInfo";
	}
	@Override
	public void init(Context context) {

	}
}
