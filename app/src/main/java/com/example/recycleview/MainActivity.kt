package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adapter.MyAdapter
import com.example.recycleview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.RV1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)


        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.img1, "Smile face with sunglasses"))
        items.add(MyModel(R.drawable.img2, "Face screams in fear"))
        items.add(MyModel(R.drawable.img3, "Head on fire"))
        items.add(MyModel(R.drawable.img4, "Let's party!"))
        items.add(MyModel(R.drawable.img5, "Thinking..."))
        items.add(MyModel(R.drawable.img6, "Smiling face with glasses"))
        items.add(MyModel(R.drawable.img7, "Smiling face"))
        items.add(MyModel(R.drawable.img8, "Explode face"))
        items.add(MyModel(R.drawable.img9, "Smile face cowboy hat"))
        items.add(MyModel(R.drawable.img10, "Money-mouth face"))
        items.add(MyModel(R.drawable.img11, "Surprised face"))
        items.add(MyModel(R.drawable.img12, "Crying face"))
        items.add(MyModel(R.drawable.img13, "Face with tongue"))
        items.add(MyModel(R.drawable.img14, "Lovely face"))
        items.add(MyModel(R.drawable.img15, "Star-struck"))
        items.add(MyModel(R.drawable.img16, "Thinking face"))
        items.add(MyModel(R.drawable.img17, "Loud crying face"))
        items.add(MyModel(R.drawable.img18, "Face with a heart"))
        items.add(MyModel(R.drawable.img19, "Looking closely face"))
        items.add(MyModel(R.drawable.img20, "Big-mouth smiling face"))
        items.add(MyModel(R.drawable.img21, "Cold face"))
        items.add(MyModel(R.drawable.img22, "More than lovely"))
        items.add(MyModel(R.drawable.img23, "Be happy face"))
        items.add(MyModel(R.drawable.img24, "Ha-Ha face"))
        items.add(MyModel(R.drawable.img25, "Angelic face"))


        return items
    }
}