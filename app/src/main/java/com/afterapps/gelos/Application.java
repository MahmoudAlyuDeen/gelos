package com.afterapps.gelos;

/*
 * Created by mahmoud on 1/9/17.
 */

public class Application extends android.app.Application {

    @Override
        public void onCreate() {
        super.onCreate();
        //todo: un-comment this out before release
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread thread, Throwable throwable) {
//                Log.e("@@@@@", "uncaughtException: " + throwable.toString());
//                Cat.e(throwable);
//                Intent splash = new Intent(getApplicationContext(), SplashActivity.class);
//                splash.putExtra(SPLASH_CRASHED_FLAG, true);
//                PendingIntent splashPending = PendingIntent.getActivity(getBaseContext(), 0, splash, 0);
//                AlarmManager mgr = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//                mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, splashPending);
//                System.exit(2);
//            }
//        });
    }
}
