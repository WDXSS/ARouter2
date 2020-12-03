package com.alibaba.android.arouter.demo.test2sv;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PathReplaceService;
@Route(path = "/test2sv/PathReplaceServiceImpl")
public class PathReplaceServiceImpl implements PathReplaceService {
	private static final String TAG = "zhou"+ PathReplaceServiceImpl.class.getSimpleName();
	@Override
	public String forString(String path) {
		Log.d(TAG, "forString() called with: path = [" + path + "]");
		if(path.equals("/test/activity2")){
			path = "/test/activity3";
		}
		return path;
	}

	@Override
	public Uri forUri(Uri uri) {
		Log.d(TAG, "forUri() called with: uri = [" + uri + "]");
		return uri;
	}

	@Override
	public void init(Context context) {

	}
}
