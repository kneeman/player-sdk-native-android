package com.kaltura.playersdk.actionHandlers;

import android.app.Activity;
import android.util.Log;

import org.json.JSONObject;

/**
 * Created by nissopa on 2/22/15.
 */
public class ShareManager {

    public static final String TAG = ShareManager.class.getSimpleName();

    public static void share(JSONObject dataSource, Activity activity) {
        KPShareStrategy strategy = ShareStrategyFactory.getStrategy(dataSource);
        if (strategy != null)
        {
            strategy.share(dataSource, activity);
        }

    }

    public interface KPShareStrategy {
        public void share(JSONObject shareParams, Activity activity);
    }


}