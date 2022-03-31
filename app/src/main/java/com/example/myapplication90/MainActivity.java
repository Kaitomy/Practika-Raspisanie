package com.example.myapplication90;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ArrayList<Model> movies = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setData();
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);

        recyclerView.setAdapter(adapter);

    }
    private void setData() {
      movies.add(new Model("Понедельник","Нахимовский","","","Физическая культура","","","Системное программирование","","","Иностранный язык в профессиональной деятельности","","","Поддержка и тестирование программных модулей",""));
      movies.add(new Model("Вторник","","","Теория вероятностей и математическая статистика","Основы проектирования баз данных","","","Разработка программных модулей","","","Операционные системы и среды","","","",""));
      movies.add(new Model("Среда","Нахимовский","","Основы алгоритмизации и программирования","","Системное программирование","Поддержка и тестирование программных модулей","Разработка мобильных приложений","","","","","","",""));
      movies.add(new Model("Четверг","Нахимовский","","","","","Основы алгоритмизации и программирования","Основы алгоритмизации и программирования","","","Разработка программных модулей","","","Элементы высшей математики",""));
      movies.add(new Model("Пятница","Нахимовский","","Основы проектирования баз данных","Компьютерные сети","","","","Основы алгоритмизации и программирования","Операционные системы и среды","","Разработка мобильных приложений","","",""));
      movies.add(new Model("Суббота","","","","","","","","","","","","","",""));
      movies.add(new Model("Воскресенье","","","","","","","","","","","","","",""));


    }

}