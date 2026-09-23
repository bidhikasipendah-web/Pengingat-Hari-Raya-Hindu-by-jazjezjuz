package com.balidharma.pengingat
import android.app.*; import android.os.*; import android.content.*; import android.content.pm.PackageManager; import android.widget.*; import java.text.SimpleDateFormat; import java.util.*
class MainActivity: Activity(){
 override fun onCreate(b:Bundle?){super.onCreate(b);setContentView(R.layout.activity_main)
  findViewById<TextView>(R.id.today).text="Hari ini: "+SimpleDateFormat("EEEE, d MMMM yyyy",Locale("id","ID")).format(Date())
  findViewById<TextView>(R.id.events).text="Hari suci utama:\n• Galungan & Kuningan\n• Purnama & Tilem\n• Kajeng Kliwon\n• Saraswati\n• Pagerwesi\n• Tumpek\n• Anggara Kasih\n• Buda Kliwon\n\nVersi awal source project. Jadwal dapat dikembangkan dari database kalender Bali."
  findViewById<Button>(R.id.btnPermission).setOnClickListener{if(Build.VERSION.SDK_INT>=33)requestPermissions(arrayOf("android.permission.POST_NOTIFICATIONS"),10)}
  findViewById<Button>(R.id.btnTest).setOnClickListener{ReminderReceiver.show(this,"🕉️ Pengingat Hari Raya Hindu Bali","Notifikasi berhasil diaktifkan.")}
 }
}