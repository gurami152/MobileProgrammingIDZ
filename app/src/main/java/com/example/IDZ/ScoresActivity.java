package com.example.IDZ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ScoresActivity extends AppCompatActivity {
    private ArrayList<Paragraph> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        if (DataHolder.getInstance().getData() == null) {
            students = new ArrayList<Paragraph>();
            students.add(new Paragraph(
                    "Использование модели MVC в Android-приложениях",
                    "Приложения Android строятся на базе архитектуры, называемой «МодельПредставление Контроллер»   (Model-View-Controller, MVC). Согласно принципов этой архитектуры каждый объект   приложения   должен   быть   объектом   модели,   объектом   представления   или   объектом контроллера. •Объект модели содержит данные приложения и «бизнес-приложенияхлогику». Классы моделиобычно проектируются для моделирования сущностей, с которыми работает приложение,— пользователь, счет в банке, продукт в магазине, фотография на сервере, вопрос «да/нет»и т.п. Объекты модели ничего не знают о пользовательском интерфейсе, их единственнойцелью является хранение данных и управление ими. Классы моделей обычно создаютсяразработчиком для конкретной задачи, а все объекты модели в приложении составляют егоуровень модели.•Объекты  представлений  отображаются   на  экране   и  реагируют  на   определенныедействия   пользователя,   например,   касание,   фокусирование   и   прочее.   Если   что-приложенияхлибовыводится на экран, значит,  это объект представления. В Android имеется достаточноширокий набор настраиваемых классов представлений. Кроме того, разработчик такжеможет   создавать   собственные   классы   представлений.   Объекты   представления   вприложении образуют уровень представления.•Объекты контроллеров связывают объекты представления и модели, и содержат«логику   приложения».   Контроллеры   реагируют   на   различные   события,   инициируемыеобъектами   представлений,   и   управляют   потоками   данных   между   объектами   модели   иуровнем представления. В Android контроллер обычно представляется субклассом Activity,Fragment или Service.",
                    "MVC  расшифровывается как Model - View - ViewModel",
                    "Неправда",
                    "Найти в интренете какая еще модель используеться в Android-приложениях",
                    "MVVM"));
        } else {

            students = DataHolder.getInstance().getData();

        }
        ListView listItem = (ListView) findViewById(R.id.listItems);
        ScoresAdapter adapter = new ScoresAdapter(this, students);
        listItem.setAdapter(adapter);
    }
}