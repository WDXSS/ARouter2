package com.alibaba.android.arouter.demo;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;

@Route(path = "/xxx/11233")//path 的值是随便写的
public class DegradeServiceImpl implements DegradeService {
	@Override
	public void onLost(Context context, Postcard postcard) {
		// do something.
		Log.d("ARouter", "DegradeServiceImpl -- 找不到了");
	}

	@Override
	public void init(Context context) {
		Log.d("ARouter", "init");
	}
}
