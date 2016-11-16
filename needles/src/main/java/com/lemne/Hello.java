package com.lemne;

import com.lemne.services.LogReaderService;
import com.lemne.services.LogReaderServiceImpl;

/**
 * Created by aeremia on 11/16/2016.
 */
public class Hello {

    public static void main (String[] args){
        LogReaderService logReaderService = new LogReaderServiceImpl();
        logReaderService.getCharsByLine("D:\\logs\\access_wwl_log");
    }
}
