package anim.qy.com.anim;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by Alter on 2018/3/16.
 */

public class MyApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger
                .init("Anim")    //LOG TAG默认是PRETTYLOGGER
                .methodCount(3)                 // 决定打印多少行（每一行代表一个方法）默认：2
                .hideThreadInfo()               // 隐藏线程信息 默认：显示
                .logLevel(LogLevel.FULL)        // 是否显示Log 默认：LogLevel.FULL（全部显示）
                .methodOffset(2);
    }
}
