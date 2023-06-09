package com.picard.designPatern;

import com.picard.designPatern.factory.RunFactory;
import com.picard.designPatern.model.Run;

import static com.picard.designPatern.factory.RunFactory.makeRun;

public class DesignPatern {
    public static void main(String[] args) {
        Run run = makeRun(RunFactory.RunType.Marathon);


    }
}
