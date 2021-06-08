package com.example.finalwhatcomappv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.finalwhatcomappv2.databinding.FragmentLandingPageBinding


class LandingPageFragment : Fragment() {

    private var _binding: FragmentLandingPageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLandingPageBinding.inflate(inflater, container, false)
        return binding.root
        return inflater.inflate(R.layout.fragment_landing_page, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonSeniorMeals.setOnClickListener {
            findNavController().navigate(R.id.action_landingPageFragment_to_cacheView)
        }
        binding.buttonCommunityMeals.setOnClickListener {
            findNavController().navigate(R.id.action_landingPageFragment_to_cacheView)
        }
        binding.buttonFoodBanks.setOnClickListener {
            findNavController().navigate(R.id.action_landingPageFragment_to_cacheView)
        }
    }

}