import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class DebugActivity : AppCompatActivity() {

    companion object {
        const val TAG: String = "DebugActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, getClassName() + ".onCreate() chamado. " + savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, getClassName() + ".onStart() chamado.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, getClassName() + ".onRestart() chamado.")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, getClassName() + ".onResume() chamado.")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, getClassName() + ".onPause() chamado.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, getClassName() + ".onSaveInstanceState() chamado.")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, getClassName() + ".onStop() chamado.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, getClassName() + ".onDestroy() chamado.")
    }

    private fun getClassName(): String {
        val s = javaClass.name
        return s.substringAfterLast(".")
    }
}