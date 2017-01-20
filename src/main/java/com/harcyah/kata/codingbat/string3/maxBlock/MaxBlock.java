package com.harcyah.kata.codingbat.string3.maxBlock;

public class MaxBlock {

    public int maxBlock(String source) {
        if (source.isEmpty()) {
            return 0;
        }
        if (source.length() == 1) {
            return 1;
        }

        int largestBlock = 1;
        int currentBlock = 1;
        char latest = source.charAt(0);
        for (int i = 1; i < source.length(); i++) {
            char current = source.charAt(i);
            if (latest == current) {
                currentBlock++;
            } else {
                if (currentBlock > largestBlock) {
                    largestBlock = currentBlock;
                }
                currentBlock = 1;
            }
            latest = current;
        }

        return Math.max(largestBlock, currentBlock);
    }

}
