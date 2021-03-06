package cn.bingoogolapple.swipebacklayout.demo.activity;

import android.os.Bundle;
import android.view.View;

import cn.bingoogolapple.swipebacklayout.demo.R;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/12/27 下午5:35
 * 描述:示例项目主界面，改界面不需要支持滑动返回
 */
public class MainActivity extends BaseActivity {

    /**
     * 主界面不需要支持滑动返回，重写该方法永久禁用当前界面的滑动返回功能
     *
     * @return
     */
    @Override
    protected boolean isSupportSwipeBack() {
        return false;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        mToolbar = getViewById(R.id.toolbar);
    }

    @Override
    protected void setListener() {
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        setSupportActionBar(mToolbar);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btn_main_test) {
            forward(TestActivity.class);
        }
    }
}
