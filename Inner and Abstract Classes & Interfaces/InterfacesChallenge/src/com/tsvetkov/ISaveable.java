package com.tsvetkov;

import java.util.ArrayList;

public interface ISaveable {
    ArrayList<String> getFields();
    void populateFields(ArrayList<String> arrayList);
}
