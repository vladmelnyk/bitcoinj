package org.bitcoinj_cash.core.listeners;

import org.bitcoinj_cash.core.EmptyMessage;
import org.bitcoinj_cash.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class FeeFilterMessage extends EmptyMessage{
    public FeeFilterMessage(NetworkParameters params){
        super(params);
    }
}
