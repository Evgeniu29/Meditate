package com.genius.meditation.morning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.genius.meditation.databinding.FragmentMorningBinding
import com.genius.myapplication.ui.notifications.MorningViewModel

class MorningFragment : Fragment() {

    private lateinit  var morningViewModel:MorningViewModel
    private var _binding: FragmentMorningBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        morningViewModel = ViewModelProvider(this).get(MorningViewModel::class.java)

        _binding = FragmentMorningBinding.inflate(inflater, container, false)
        val root: View = _binding!!.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (view != null) {
            val parentViewGroup = requireView().parent as ViewGroup?
            parentViewGroup?.removeAllViews();
            _binding=null
        }
    }
}