package com.fredcodecrafts.lab_week_04

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class FavoritesFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }
}
