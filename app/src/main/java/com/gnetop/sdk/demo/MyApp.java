package com.gnetop.sdk.demo;

import android.support.multidex.MultiDex;

import com.gnetop.ltgame.core.manager.action.LTGameActionName;
import com.gnetop.ltgame.router.YApplication;
import com.gnetop.ltgame.router.YRouter;
import com.gnetop.sdk.ltgame.fb.action.FBAction;
import com.gnetop.sdk.ltgame.gp.GPAction;

/**
 * Created by Administrator on 2020\2\11
 */

public class MyApp extends YApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }

    @Override
    public void registerAction() {
        YRouter.getInstance().registerAction(LTGameActionName.name,new FBAction());
        YRouter.getInstance().registerAction(LTGameActionName.gp_name,new GPAction());
    }
}
