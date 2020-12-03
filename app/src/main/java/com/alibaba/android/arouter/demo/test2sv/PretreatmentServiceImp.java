package com.alibaba.android.arouter.demo.test2sv;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PretreatmentService;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/test2sv/PretreatmentServiceImp")
public class PretreatmentServiceImp implements PretreatmentService {
	private static final String TAG = "zhou" + PretreatmentServiceImp.class.getSimpleName();

	@Override
	public boolean onPretreatment(Context context, Postcard postcard) {
		Log.d(TAG, "onPretreatment: postcard.getPath() "+postcard.getPath());
		// 跳转前预处理，如果需要自行处理跳转，该方法返回 false 即可
		if ("/test/activity4".equals(postcard.getPath())) {
			ARouter.getInstance()
					.build("/test/activity3")
					.withString("name","拦截4 重新定位到3")
					.withInt("age",33)
					.withBoolean("girl",false)
					.navigation();
			return false;
		}
		return true;
	}

	@Override
	public void init(Context context) {

	}
}
