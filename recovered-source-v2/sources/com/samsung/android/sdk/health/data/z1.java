package com.samsung.android.sdk.health.data;

import android.app.Activity;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class z1 {
    public static void a(String listName, List input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(listName, "listName");
        if (input.isEmpty()) {
            throw new InvalidRequestException(1001, listName + "List should not be null or empty");
        }
    }

    public static void a(Object obj) {
        Objects.requireNonNull(obj, "Input data should not be null.");
    }

    public static void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isDestroyed() || activity.isFinishing() || activity.getWindow() == null) {
            throw new InvalidRequestException(1001, "Invalid instance of Activity");
        }
    }
}
