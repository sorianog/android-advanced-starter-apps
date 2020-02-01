package com.example.android.fragmentexample


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class SimpleFragment : Fragment() {

    val YES : Int = 0;
    val NO : Int = 1;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment.
        val rootView : View =  inflater.inflate(R.layout.fragment_simple, container, false);
        val radioGroup : RadioGroup = rootView.findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, i ->
            val radioButton : View = radioGroup.findViewById(i)
            val index : Int = radioGroup.indexOfChild(radioButton)

            val textView : TextView = rootView.findViewById(R.id.fragment_header)

            when (index) {
                YES -> textView.setText(R.string.yes_message)
                NO -> textView.setText(R.string.no_message)
            }
        })

        // Return the View for the fragment's UI.
        return rootView;
    }


}
