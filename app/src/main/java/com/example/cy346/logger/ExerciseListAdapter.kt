package com.example.cy346.logger

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ExerciseListAdapter(private val exerciseName: Array<Exercise>) : RecyclerView.Adapter<ExerciseListAdapter.ViewHolder>() {

    inner class ViewHolder(val cardView: CardView) : RecyclerView.ViewHolder(cardView) {
        var exercise: TextView = cardView.findViewById(R.id.tv_exercise_name)
        var info:TextView = cardView.findViewById(R.id.tv_exercise_info)
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ExerciseListAdapter.ViewHolder {
        // create a new view
        val cardView = LayoutInflater.from(parent.context)
                .inflate(R.layout.exercise_fragment, parent, false) as CardView

        return ViewHolder(cardView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.exercise.text = exerciseName[position].exerciseName
        holder.info.text = exerciseName[position].exerciseInfo
    }

    override fun getItemCount(): Int {
        return exerciseName.size
    }
}
