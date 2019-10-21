package org.bitcoinj_cash.core.listeners;

import org.bitcoinj_cash.core.EmptyMessage;
import org.bitcoinj_cash.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class SendHeadersMessage extends EmptyMessage{
    public SendHeadersMessage(NetworkParameters params){
        super(params);
    }
}
