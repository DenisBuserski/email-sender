package org.example.logmanipulator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Log2 implements LogManipulator {
    private static final String REGEX = "(?<datetime>[A-Z]{3}\\s+\\d{1,2}\\s\\d{2}:\\d{2}:\\d{2})\\s(?<service>[^\\[]+)\\[(?<logtype>[^\\]]+)]:\\serror:\\s\\{(?<error>[^\\}]+)\\}";
    private static final Logger LOG_2_LOGGER = LogManager.getLogger(Log2.class);

    @Override
    public List<String> manipulate(List<String> stringFile) {
        LOG_2_LOGGER.info("Manipulating file");
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
