package edu.chapman.monsutauoka.ui.fourth

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import edu.chapman.monsutauoka.R
import edu.chapman.monsutauoka.databinding.FragmentDeltaBinding
import edu.chapman.monsutauoka.extensions.TAG

class DeltaFragment : Fragment() {

    private var _binding: FragmentDeltaBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DeltaViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, ::onCreateView.name)

        _binding = FragmentDeltaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, ::onViewCreated.name)

        binding.buttonDelta.setOnClickListener {
            Log.d(TAG, "ERROR")
        }
    }

    override fun onDestroyView() {
        Log.d(TAG, ::onDestroyView.name)

        super.onDestroyView()
        _binding = null
    }
}