package libs.trustconnector.scdp.smartcard.application.pboc;

import libs.trustconnector.scdp.smartcard.application.*;
import libs.trustconnector.scdp.smartcard.*;

import libs.trustconnector.scdp.smartcard.AID;
import libs.trustconnector.scdp.smartcard.SmartCardReader;
import libs.trustconnector.scdp.smartcard.application.Application;

public class QPBOC extends Application
{
    public QPBOC(final SmartCardReader reader, final AID aid) {
        super(reader, aid);
    }
}
