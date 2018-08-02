package com.example.cy346.logger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExerciseFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.exercise_list_fragment, container, false)

        viewManager = LinearLayoutManager(activity)
        viewAdapter = ExerciseListAdapter(myDataSet())

        recyclerView = rootView.findViewById<RecyclerView>(R.id.rv_exercise_recycler_layout).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
        return rootView
    }

    fun myDataSet(): Array<Exercise> {
        val dataset = Array(80, { i -> Exercise(i,"This is object", " # $i") })

        return dataset
    }
}