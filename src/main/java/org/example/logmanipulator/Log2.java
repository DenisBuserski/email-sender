package org.example.logmanipulator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Log2 implements LogManipulator {
    private static final String REGEX = "(?<datetime>[A-Z]{3}\\s+\\d{1,2}\\s\\d{2}:\\d{2}:\\d{2})\\s(?<service>[^\\[]+)\\[(?<logtype>[^\\]]+)]:\\serror:\\s\\{(?<error>[^\\}]+)\\}";
    @Override
    public List<String> manipulate(List<String> stringFile) {
        List<String> result = new ArrayList<>();

        for (String data : stringFile) {
            Pattern filePattern = Pattern.compile(REGEX);
            Matcher fileMatcher = filePattern.matcher(data);

            if (fileMatcher.matches()) {
                String datetime = fileMatcher.group("datetime");
                result.add(datetime);
            }
        }

        return result;
    }
}
