package com.picard.designPatern.factory;

import com.picard.designPatern.model.Run;
import com.picard.designPatern.model.Marathon;
import com.picard.designPatern.model.HalfMarathon;

public class RunFactory {
        public enum RunType {
            Marathon,
            Half,
        };
        public static Run makeRun(RunType type) {
            switch (type) {
                case Marathon: return new Marathon();
                case Half: return new HalfMarathon();
            }

            return new Marathon();
        }
}
