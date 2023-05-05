package com.example.expiry_remainder.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.expiry_remainder.databinding.FragmentDashboardBinding
import com.example.expiry_remainder.databinding.FragmentRemainderBinding

class RemainderFragment : Fragment() {

    private var _binding: FragmentRemainderBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentRemainderBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.textDashboard.text="This is Remainder Page"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}