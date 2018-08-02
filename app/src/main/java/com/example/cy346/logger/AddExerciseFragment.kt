package com.example.cy346.logger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders


class AddExerciseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.add_exercise_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val addButton: Button = view.findViewById(R.id.b_add_exercise) as Button
        val input: EditText = view.findViewById(R.id.et_new_exercise) as EditText

        addButton.setOnClickListener {
            Toast.makeText(context, input.text.toString(), Toast.LENGTH_LONG).show()
        }
    }
}