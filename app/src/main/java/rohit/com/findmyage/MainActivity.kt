package rohit.com.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val  mButton : Button = findViewById(R.id.Button_Show_Age)
        mButton.setOnClickListener{

            val mTextInputEditText : TextInputEditText = findViewById(R.id.TextInputEditText_DOB)

            val mYearOfBirth: String = mTextInputEditText.text.toString()
            if (TextUtils.isEmpty(mYearOfBirth)){

                val layout:TextInputLayout = findViewById(R.id.TextInputLayout_DOB)
                layout.error = "Please Provide the Year of Birth"

            }else{
                val mCurrentYear : Int = Calendar.getInstance().get(Calendar.YEAR)
                val mMyAge = mCurrentYear - mYearOfBirth.toInt()
                Toast.makeText(this,mMyAge.toString(), Toast.LENGTH_LONG).show()

            }


        }
    }
}
