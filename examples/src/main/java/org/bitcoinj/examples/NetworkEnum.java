/*
 * Copyright 2013 Google Inc.
 * Copyright 2014 Andreas Schildbach
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bitcoinj_cash.examples;

import org.bitcoinj_cash.core.NetworkParameters;
import org.bitcoinj_cash.params.MainNetParams;
import org.bitcoinj_cash.params.RegTestParams;
import org.bitcoinj_cash.params.TestNet3Params;

public enum NetworkEnum {
    MAIN,
    PROD, // alias for MAIN
    TEST,
    REGTEST;

    public NetworkParameters get() {
        switch(this) {
            case MAIN:
            case PROD:
                return MainNetParams.get();
            case TEST:
                return TestNet3Params.get();
            case REGTEST:
            default:
                return RegTestParams.get();
        }
    }
}
