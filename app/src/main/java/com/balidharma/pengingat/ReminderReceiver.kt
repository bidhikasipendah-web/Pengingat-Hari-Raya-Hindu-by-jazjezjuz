package com.balidharma.pengingat
import android.app.*; import android.content.*; import android.os.*
object ReminderReceiver{
 fun show(c:Context,title:String,body:String){
  val id="bali_reminder"; val nm=c.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
  if(Build.VERSION.SDK_INT>=26)nm.createNotificationChannel(NotificationChannel(id,"Pengingat Hari Raya",NotificationManager.IMPORTANCE_HIGH))
  val n=Notification.Builder(c,id).setSmallIcon(android.R.drawable.ic_dialog_info).setContentTitle(title).setContentText(body).setAutoCancel(true).build()
  nm.notify(System.currentTimeMillis().toInt(),n)
 }
}
