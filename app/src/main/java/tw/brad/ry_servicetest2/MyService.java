package tw.brad.ry_servicetest2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private final IBinder mBinder = new LocalBinder();

    public class LocalBinder extends Binder {
        MyService getService(){
            return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public int doSomething(){
        Log.v("brad", "Service: doSomething...");
        return (int)(Math.random()*49+1);
    }

}
