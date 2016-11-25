package com.lemne.utils

import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created by aeremia on 11/17/2016.
 */
class StringUtils {

    static public String removeWords(String line) {
        def remains = line;
//        remains.replaceAll(/.*/, " ")
        Matcher m = Pattern.compile("\".*\"").matcher(remains)
        if(m.find()) println "found ya"
        remains.replaceAll(Pattern.compile("\".*\""),"")
    }

    static public String getDelimiterCandidate(String line) {
        removeWords(line)
    }
}
