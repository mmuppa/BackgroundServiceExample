package edu.uw.tacoma.mmuppa.backgroundserviceexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by mmuppa on 4/28/15.
 */
public class RSSBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            // Set the alarm here.
            RSSService.setServiceAlarm(context, true);
        }
    }
}
