package com.example.a36_lesson

import java.io.Serializable

data class Song(val image:String? = null,val name:String? = "Неизвестное название",val artist:String? = "Незвестный исполнитель",val duration:String? = null):Serializable
