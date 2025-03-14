package sophia09.com.github.android_helloactivity

import DebugActivity
import android.os.Bundle

class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}