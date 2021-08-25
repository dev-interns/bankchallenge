package com.endava.bankchallenge.strategy;

import java.util.Random;

public class RandomOperation implements Operation{
    @Override
    public Integer run() {
        return 10 +new Random().nextInt(6);
    }
}
