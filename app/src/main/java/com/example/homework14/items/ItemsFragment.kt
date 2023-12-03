package com.example.homework14.items

import androidx.fragment.app.viewModels
import com.example.homework14.ItemsViewModel
import com.example.homework14.databinding.FragmentItemsBinding

class ItemsFragment : BaseFragment<FragmentItemsBinding>(FragmentItemsBinding::inflate) {
    private val viewModel: ItemsViewModel by viewModels()

    override fun setUp() {
        TODO("Not yet implemented")
    }

    override fun listeners() {
        TODO("Not yet implemented")
    }

}