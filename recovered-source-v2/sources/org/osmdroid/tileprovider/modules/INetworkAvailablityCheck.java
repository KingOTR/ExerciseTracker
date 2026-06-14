package org.osmdroid.tileprovider.modules;

/* loaded from: classes5.dex */
public interface INetworkAvailablityCheck {
    boolean getCellularDataNetworkAvailable();

    boolean getNetworkAvailable();

    @Deprecated
    boolean getRouteToPathExists(int i);

    boolean getWiFiNetworkAvailable();
}
