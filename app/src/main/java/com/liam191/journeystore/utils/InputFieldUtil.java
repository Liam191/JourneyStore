package com.liam191.journeystore.utils;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class InputFieldUtil {

    // Checks if an EditText field contains any text.
    public static boolean isEmpty(EditText editText){
        return editText.getText().toString().length() == 0;
    }

    // Takes a varargs of EditText fields and returns a list containing
    // all empty EditTexts from the input.
    public static List<EditText> isEmpty(EditText... editTexts){
        List emptyEditTexts = new ArrayList<EditText>();

        for(EditText editText : editTexts){
            if(isEmpty(editText)){
                emptyEditTexts.add(editText);
            }
        }
        return emptyEditTexts;
    }
}
