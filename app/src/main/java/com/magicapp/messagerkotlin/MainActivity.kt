package com.magicapp.messagerkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import com.magicapp.messagerkotlin.model.Bundle
import com.magicapp.messagerkotlin.model.Message
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.magicapp.messagerkotlin.adapter.ChatAdapter
import com.magicapp.messagerkotlin.model.Chat
import com.magicapp.messagerkotlin.model.Room

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }
    fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList()
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.im_user_1, "Jordan"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))
        stories.add(Room(R.drawable.muslim, "Muslim"))

        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(stories))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", false)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", false)))
        chats.add(Chat(Message(R.drawable.im_user_1, "Jordan", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", false)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", false)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", true)))
        chats.add(Chat(Message(R.drawable.muslim, "Muslim", false)))
        return chats
    }
}