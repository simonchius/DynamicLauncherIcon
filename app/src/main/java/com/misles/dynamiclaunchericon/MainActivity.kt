package com.misles.dynamiclaunchericon

import android.content.ComponentName
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        one.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.OneLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.TwoLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.ThreeLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)

            Toast.makeText(this@MainActivity, "Launcher one has been applied successfully",Toast.LENGTH_SHORT).show()
        }

        two.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.OneLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.TwoLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.ThreeLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            Toast.makeText(this@MainActivity, "Launcher three has been applied successfully",Toast.LENGTH_SHORT).show()
        }

        three.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.OneLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.TwoLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.ThreeLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            Toast.makeText(this@MainActivity, "Launcher two has been applied successfully",Toast.LENGTH_SHORT).show()
        }

    }

}
