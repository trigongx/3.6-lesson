package com.example.a36_lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a36_lesson.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private lateinit var dataFromMainFragment: Song

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        dataFromMainFragment = arguments?.getSerializable("key") as Song
        binding.tvDetailName.text =dataFromMainFragment.name
        binding.tvDetailArtist.text = dataFromMainFragment.artist
        binding.tvDetailDuration.text = dataFromMainFragment.duration
        dataFromMainFragment.image?.let { binding.imgDetailPhoto.loadImage(it) }
    }

}