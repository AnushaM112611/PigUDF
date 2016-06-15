package com.udf;

import org.apache.pig.FilterFunc;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.Tuple;



public class FilterUDF  extends FilterFunc {

    public Boolean exec(Tuple input) throws ExecException {

        if(input == null || input.size() ==0)
            return false;
        String inputString = (String) input.get(0);
        int numberOfCharacters = inputString.length();
        if(numberOfCharacters > 5){
            return true;
        }
        return false;
    }


}
