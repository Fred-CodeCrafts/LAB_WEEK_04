package com.fredcodecrafts.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
private const val TAB_POS = "TAB_POS"

class CafeDetailFragment : Fragment() {
    private var pos: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            pos = it.getInt(TAB_POS, 0)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.content_description)

        // Use the position to load correct resource (fall back to index 0 safely)
        val index = pos.coerceIn(0, TABS_CONTENT.size - 1)
        val content = requireContext().getString(TABS_CONTENT[index])
        textView.text = content

        android.util.Log.d("CafeDetailFragment", "Loaded pos=$pos content length=${content.length}")
    }

    companion object {
        fun newInstance(position: Int) =
            CafeDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(TAB_POS, position)
                }
            }
    }
}
