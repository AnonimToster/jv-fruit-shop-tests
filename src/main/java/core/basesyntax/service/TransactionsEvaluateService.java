package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface TransactionsEvaluateService {
    void evaluate(List<FruitTransaction> transactions);
}
