package com.assac453.vigener.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {

    private final String encodeInput;

    public FrequencyAnalysis(String encodeInput) {
        this.encodeInput = encodeInput;
    }

    public String analyze(){
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> frequencyMap = analyzeFrequency(encodeInput);
        result.append("Посимвольная статистика и частотный анализ: \n");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char symbol = entry.getKey();
            int count = entry.getValue();
            double frequency = (double) count / encodeInput.length() * 100;
            result.append(String.format("Символ %s встречается %d раз. Частота %.2f%%\n", symbol, count, frequency));
        }
        return result.toString();
    }

    private static Map<Character, Integer> analyzeFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char symbol : input.toCharArray()) {
            if (!Character.isLetter(symbol)) {
                continue;
            }
            symbol = Character.toLowerCase(symbol);
            frequencyMap.put(symbol, frequencyMap.getOrDefault(symbol, 0) + 1);
        }
        return frequencyMap;
    }
}

