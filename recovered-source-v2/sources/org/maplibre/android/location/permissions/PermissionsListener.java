package org.maplibre.android.location.permissions;

import java.util.List;

/* loaded from: classes5.dex */
public interface PermissionsListener {
    void onExplanationNeeded(List<String> list);

    void onPermissionResult(boolean z);
}
