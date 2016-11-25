package com.lemne.services;

import com.lemne.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by aeremia on 11/16/2016.
 */
public class LogReaderServiceImpl implements LogReaderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogReaderServiceImpl.class);

    @Override
    public void getCharsByLine(String path) {
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            int i = 0;
            while (i < 100) {
                line = br.readLine();
                System.out.println(line);
                System.out.println(StringUtils.getDelimiterCandidate(line));
                i++;
            }
//            Iterator it = charCount(line).entrySet().iterator();
//            while(it.hasNext()){
//                Map.Entry item = (Map.Entry) it.next();
//                System.out.println(item.getKey() + " : " + item.getValue());
//            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

    private HashMap<Character, Integer> charCount(String line) {
        HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
        for (int i = 0; i < line.length(); i++) {
            if (characterCount.containsKey(line.charAt(i))) {
                int old = characterCount.get(line.charAt(i));
                old++;
                characterCount.remove(line.charAt(i));
                characterCount.put(line.charAt(i), old);
            } else {
                characterCount.put(line.charAt(i), 1);
            }
        }
        return characterCount;
    }

}
