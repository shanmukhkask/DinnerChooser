package example.com.dinnerkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList= arrayListOf("Chinese","Chicken","Burger","Mutton","Bun","KFC","Zomato")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectFood.text="KFC"

        decideButton.setOnClickListener {
            val food=Random()
            val randomFood:Int=food.nextInt(foodList.count())
            selectFood.text=foodList[randomFood]

        }
        addFoodButton.setOnClickListener {
            val newFood=editText.text.toString()
            foodList.add(newFood)
            editText.text.clear()
        }
    }
}
