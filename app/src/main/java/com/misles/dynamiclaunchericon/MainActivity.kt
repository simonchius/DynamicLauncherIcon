package com.misles.dynamiclaunchericon

import android.content.ComponentName
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

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
        }

        two.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.OneLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.TwoLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.ThreeLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
        }

        three.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.OneLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.TwoLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, com.misles.dynamiclaunchericon.ThreeLauncherAlias::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
