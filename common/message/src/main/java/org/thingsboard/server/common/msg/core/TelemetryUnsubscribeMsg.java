package org.thingsboard.server.common.msg.core;

import org.thingsboard.server.common.msg.session.FromDeviceMsg;
import org.thingsboard.server.common.msg.session.MsgType;

public class TelemetryUnsubscribeMsg implements FromDeviceMsg {
    @Override
    public MsgType getMsgType() {
        return MsgType.UNSUBSCRIBE_SPARKPLUG_TELEMETRY_REQUEST;
    }
}
