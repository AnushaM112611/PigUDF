package com.udf;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

import java.io.IOException;


public class EvalSSNUdf extends EvalFunc<String> {

    public String exec(Tuple input) throws IOException {
        if(input == null || input.size() ==0)
            return null;
        String inputString = (String) input.get(0);
        return inputString.replaceAll("^\\d{3}-\\d{2}-","###-##-");
    }
}
