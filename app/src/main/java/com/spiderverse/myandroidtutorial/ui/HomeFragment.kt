package com.spiderverse.myandroidtutorial.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.spiderverse.myandroidtutorial.ButtonList
import com.spiderverse.myandroidtutorial.adapter.HomeAdapter
import com.spiderverse.myandroidtutorial.databinding.FragmentButtonListsBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentButtonListsBinding? = null
    private var _menuList: MutableList<ButtonList>? = null
    private val menuList: List<ButtonList> get() = _menuList!!

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentButtonListsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _menuList = mutableListOf(
            ButtonList(1,"Recycler View"),
            ButtonList(2,"Download Files"),
            ButtonList(3,"Video Player"),
            ButtonList(4,"Web Viewer"),
            ButtonList(5,"Room Database"),
            ButtonList(6,"Bluetooth"),
            ButtonList(7,"Notification"),
            ButtonList(8,"User Permissions"),
        )
        binding.rvHome.adapter = HomeAdapter(menuList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}