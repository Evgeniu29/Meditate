package com.genius.meditation.beforesleep
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.genius.meditation.BeforeSleepViewModel
import com.genius.meditation.databinding.FragmentBeforesleepBinding

class BeforeSleepFragment : Fragment() {

    private lateinit var beforeSleepViewModel: BeforeSleepViewModel
    private var _binding: FragmentBeforesleepBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        beforeSleepViewModel =
            ViewModelProvider(this).get(BeforeSleepViewModel::class.java)

        _binding = FragmentBeforesleepBinding.inflate(inflater, container, false)
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