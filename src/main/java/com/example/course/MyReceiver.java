package com.example.course;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import static android.content.Context.NOTIFICATION_SERVICE;

public class MyReceiver extends BroadcastReceiver {
    static int notificationID;
    String channel_id="test";
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,intent.getStringExtra("key"),Toast.LENGTH_LONG).show();
        createNotificationChannel(context,channel_id);
  /*      Notification n=new Notification.Builder(context)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setChannelId(channel_id)
                .setContentTitle("Test Notification with an id of:"+Integer.toString(notificationID))
                .setContentText("This is a test").build();*/
        Notification n= new NotificationCompat.Builder(context, channel_id)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentText(intent.getStringExtra("key"))
                .setContentTitle("Test of Notification with an id of :"+Integer.toString(notificationID)).build();

        NotificationManager notificationManager=(NotificationManager)context.getSystemService(NOTIFICATION_SERVICE);
        assert notificationManager != null;
        notificationManager.notify(notificationID++,n);

        //Put a notification her aka Vogella Tutorial

        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        // throw new UnsupportedOperationException("Not yet implemented");
    }
    private void createNotificationChannel(Context context, String CHANNEL_ID) {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library

      /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = context.getResources().getString(R.string.channel_name);
            String description = context.getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            assert notificationManager != null;
            notificationManager.createNotificationChannel(channel);
        }*/
    }
}
