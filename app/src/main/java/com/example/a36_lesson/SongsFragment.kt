package com.example.a36_lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a36_lesson.databinding.FragmentSongsBinding

class SongsFragment : Fragment() {

    private lateinit var binding:FragmentSongsBinding
    private var songList = arrayListOf<Song>(
        Song("https://f4.bcbits.com/img/a4019672456_10.jpg","Disfruto","Carla Morrison","3:36"),
        Song("https://www.dafont.com/forum/attach/orig/7/9/794765.png","Into you","Ariana Grande","4:01"),
        Song("https://i.pinimg.com/736x/10/8f/f2/108ff26135732a74801de3f9352f9b89.jpg","Thank you,next","Ariana Grande","3:27"),
        Song("https://wallpapercave.com/wp/wp4684245.jpg","Hotline","Billie Eilish","1:01"),
        Song("https://f4.bcbits.com/img/a2829340549_10.jpg","21 question","50Cent","3:52")
        )
    private var bundle = Bundle()
    private var fragment:DetailFragment = DetailFragment()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        repeat(20){
            songList.add(Song())
        }
        val adapter = SongAdapter(songList,this::onClick)
        binding.rvSongs.adapter = adapter
    }
    fun onClick(position:Int){

        bundle.putSerializable("key", songList[position])
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.main_container,DetailFragment()).addToBackStack(null).commit()

    }


}