import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            val weight = binding.editTextWeight.text.toString().toDouble()
            val height = binding.editTextHeight.text.toString().toDouble()

            val bmi = weight / (height * height)
            binding.textViewResult.text = "BMI: %.2f".format(bmi)

            binding.textViewCategory.text = when {
                bmi < 18.5 -> "Underweight"
                bmi < 25 -> "Normal"
                else -> "Overweight"
            }
        }
    }
}



