package com.example.emptylb3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.decapitalize
//import androidx.compose.ui.tooling.preview.Preview
import com.example.emptylb3.ui.theme.EmptyLb3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmptyLb3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    //1:
                    val str="MagnanImoUs"
                    var new_str = str.uppercase()
                    println("Задание 1: $new_str")
                    new_str = str.lowercase()
                    println("Задание 1: $new_str")
                    new_str = str.decapitalize()
                    println("Задание 1: $new_str")
                    //2:
                    val num=45
                    val num2=40
                    var new_num=num*num2+(num+10-20+num2)+(num2-20)+num/5
                    println("Задание 2: $new_num")
                    println("Задание 2: ${10%3}")
                    val d_Num1=12.0
                    val d_Num2=5.0
                    println("Задание 2: ${d_Num1/d_Num2}")
                    //3
                    val greetings = "Здравствуйте"
                    val user ="Многоуважаемый пользователь"
                    val multiString= """
                    Задание 3:
                    $greetings
                    $user
                    Как прошел ваш день?
                    """.trimIndent()
                    println(multiString)
                    //4
                    val s1: String = "12.5"
                    val d4: Float = s1.toFloat()
                    println("Задание 4: $d4")
                    //5
                    if(d4>10)
                    {
                        println("Задание 5: Все верно!")
                    }
                    else
                    {
                        println("Задание 5: Неверно!")
                    }
                    //6
                    for (i in 7 downTo 0 )
                    {
                        println("Задание 6(for): Вывод 6го задания закончится через:$i")
                        Thread.sleep(1000)
                    }
                    var ss6=1000;
                    var counter = 0;

                    while (ss6>0)
                    {
                        ss6-=20
                        counter+=12
                    }
                    println("Задание 6 (while):$counter")
                    //7(Вызов функции)
                    val j7=n7(5)
                    println("Задание 7: $j7")
                    //8
                    var intArr: IntArray= intArrayOf(1,2,3,4,5,6,7,8,9,0)
                    var s8:Int
                    println("Задание 8(массив до изменения):${intArr.joinToString(" ")}")
                    for(i in 0 until intArr.size-5)
                    {
                        s8=intArr[i+5]
                        intArr[i+5]=intArr[i]
                        intArr[i]=s8
                    }
                    println("Задание 8(массив после изменения):${intArr.joinToString(" ")}")

                }
            }
        }
    }
}

fun n7(a:Int) : Int
{
    return a*5
}
