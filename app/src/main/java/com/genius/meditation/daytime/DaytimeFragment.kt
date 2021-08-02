package com.genius.meditation.daytime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.genius.meditation.databinding.FragmentDaytimeBinding
import com.genius.myapplication.ui.home.DaytimeViewModel

class DaytimeFragment : Fragment() {

    private lateinit var daytimeViewModel: DaytimeViewModel
    private var _binding: FragmentDaytimeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        daytimeViewModel =
            ViewModelProvider(this).get(DaytimeViewModel::class.java)

        _binding = FragmentDaytimeBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (view != null) {
            val parentViewGroup = requireView().parent as ViewGroup?
            parentViewGroup?.removeAllViews();
            _binding = null
        }
    }
}