package org.thingsboard.server.extensions.api.device;

import org.thingsboard.server.common.data.kv.TsKvEntry;

import java.util.*;

public class DeviceTelemetry {

    private final Map<String, TsKvEntry> deviceTelemetryMap;

    public DeviceTelemetry(List<TsKvEntry> tsKvEntries) {
        this.deviceTelemetryMap = mapDeviceTelemetry(tsKvEntries);
    }

    private static Map<String, TsKvEntry> mapDeviceTelemetry(List<TsKvEntry> tsKvEntries) {
        Map<String, TsKvEntry> result = new HashMap<>();
        for (TsKvEntry tsKvEntry : tsKvEntries) {
            result.put(tsKvEntry.getKey(), tsKvEntry);
        }
        return result;
    }

    public Collection<TsKvEntry> getDeviceTelemetry() {
        return deviceTelemetryMap.values();
    }

    public Optional<TsKvEntry> getDeviceTelemetry(String attribute) {
        return Optional.ofNullable(deviceTelemetryMap.get(attribute));
    }

    public void update(List<TsKvEntry> values) {
        values.forEach(v -> deviceTelemetryMap.put(v.getKey(), v));
    }

    @Override
    public String toString() {
        return "DeviceTelemetry{ deviceTelemetryMap= " + deviceTelemetryMap +
                '}';
    }
}
