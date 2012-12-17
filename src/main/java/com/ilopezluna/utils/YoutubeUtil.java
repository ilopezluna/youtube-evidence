package com.ilopezluna.utils;

import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YoutubeUtil
{
    public static String getYoutubeID(String url) throws MalformedURLException {
        String pattern = "(?<=videos\\/|v=)([\\w-]+)";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(url);

        if(matcher.find()){
            return matcher.group();
        }
        throw new MalformedURLException(url);
    }
}

