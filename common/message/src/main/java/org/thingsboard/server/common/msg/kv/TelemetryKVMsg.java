package org.thingsboard.server.common.msg.kv;

import org.thingsboard.server.common.data.kv.TsKvEntry;

import java.io.Serializable;
import java.util.List;

public interface TelemetryKVMsg extends Serializable {
    List<TsKvEntry> getDeviceTelemetry();
}
