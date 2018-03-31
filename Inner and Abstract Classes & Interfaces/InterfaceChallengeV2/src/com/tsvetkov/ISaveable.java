package com.tsvetkov;

import java.util.List;

public interface ISaveable {
    List<String> write(); // write (save) the data
    void read(List<String> savedValues);
}
