package org.example.logmanipulator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Log1 implements LogManipulator {
    private static final String REGEX = "(?<datetime>[A-Z]{3}\\s{2}\\d{1,2}\\s\\d{2}:\\d{2}:\\d{2})\\s(?<username>[^\\s]+)\\s(?<service>[^\\[]+)\\[(?<logtype>[^\\]]+)]:\\serror:\\s\\{(?<errormessage>[^\\}]+)\\}";
    private static final String ERROR_REGEX = "\\\"(?<username>[a-zA-Z0-9_-]+(?:-\\\\d+)?)\\\"";

    @Override
    public List<String>  manipulate(List<String> stringFile) {
        List<String> result = new ArrayList<>();

        for (String data : stringFile) {
            Pattern filePattern = Pattern.compile(REGEX);
            Matcher fileMatcher = filePattern.matcher(data);

            if (fileMatcher.matches()) {
                String errorMessage = fileMatcher.group("errormessage");
                Pattern errorPattern = Pattern.compile(ERROR_REGEX);
                Matcher errorMatcher = errorPattern.matcher(errorMessage);

                if (errorMatcher.find()) {
                    String username = errorMatcher.group("username");
                    result.add(username);
                }

            }
        }

        return result;
    }
}
