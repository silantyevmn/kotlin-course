package silantyevmn.ru.kotlincourse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/*      1. Создать новый проект в Android studio без поддержки Kotlin.
        2. Сконфигурировать Kotlin в новом проекте (лучше вручную).
        3. Перевести MainActivity на Kotlin.
        4. Добавить кнопку в разметку и повесить на нее clickListener в Activity.
        5. Убедиться, что все работает.*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = textView
        var count = 0;
        buttonStart.setOnClickListener {
            count++
            textView.text = count.toString()
        }
        buttonReset.setOnClickListener {
            count = 0;
            textView.text = count.toString()
        }
    }
}
