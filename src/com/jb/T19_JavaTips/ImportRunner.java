package com.jb.T19_JavaTips;
import java.math.BigDecimal;
import java.util.ArrayList;
// import java.util.Collections;
//static imports
import static java.lang.System.out;
import static java.util.Collections.*;
public class ImportRunner {
    public static void main(String[] args) {
        String str="jaya"; //String is part of lang
        BigDecimal  bd= null;
        out.println("static input");
        out.println(str);
        out.println(bd);

        sort(new ArrayList<String>());
    }
}
// static input
// jaya
// null