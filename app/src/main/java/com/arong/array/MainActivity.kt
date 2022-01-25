package com.arong.array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // arrayOf 함수 호출
            val names = arrayOf("홍길동1", "홍길동2", "홍길동3")
            // Array 클래스 생성자 이용
            val names2 = Array<String>(3, {index -> "홍길동${index+1}"})
            // 원소의 값을 null로 만들기
            val names3 = arrayOfNulls<String>(3)
            // 원소가 하나도 없는 배열 객체
            val names4 = emptyArray<String>()

            textView.append("\n${Arrays.toString(names)}")
            textView.append("\n${Arrays.toString(names2)}")
            textView.append("\n${Arrays.toString(names3)}")
            textView.append("\n${Arrays.toString(names4)}")
        }

        button2.setOnClickListener {
            // 배열을 만들 때 기본 자료형을 지정하면서 만들 수 있음 -> intArrayOf => 숫자형 공간에 저장되어 arrayOf를 이용할 때보다 메모리를 효율적으로 사
            val digits = intArrayOf(1, 2, 3)
            digits.set(2,4)
            val adigits = digits.get(2)
            textView.append("\n세번째 숫자 : ${adigits}")
            textView.append("\n원소 개수 : ${digits.count()}")

            val digits2 = digits.plus(5)
            val aIndex = digits2.indexOf(5)
            val digits3 = digits2.sliceArray(1..aIndex)
            textView.append("\n${Arrays.toString(digits3)}")
        }

        button3.setOnClickListener {
            val digits = intArrayOf(2, 1, 3)
            digits.forEach { elem -> textView.append("$elem") }

            textView.append("\n")
            for(elem in digits){
                textView.append("$elem")
            }

            textView.append("\n")
            val iter = digits.iterator()
            while (iter.hasNext()){
                val elem = iter.next()
                textView.append("$elem")
            }
        }

        button4.setOnClickListener {
            val digits = intArrayOf(2, 1, 3)

            val sorted = digits.sortedArray()
            textView.append("\n${Arrays.toString(sorted)}")

            val sortedDesc = digits.sortedArrayDescending()
            textView.append("\n${Arrays.toString(sortedDesc)}")

            textView.append("\n")
            digits.filter { elem -> elem > 1 }.forEach{ elem -> textView.append("$elem")}

        }
    }
}