package Transactions;

import java.util.Random;

public class RandomOperation implements Operation{
    @Override
    public int run() {
        return 10 +new Random().nextInt(6);
    }
}
