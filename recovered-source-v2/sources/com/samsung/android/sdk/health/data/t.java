package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.data.AggregateOperation;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class t {
    public static final p a = new p();
    public static final q b = new q();
    public static final s c;
    public static final HashMap d;

    static {
        s sVar = new s();
        c = sVar;
        d = new HashMap();
        Iterator it = sVar.values().iterator();
        while (it.hasNext()) {
            for (AggregateOperation aggregateOperation : (Set) it.next()) {
                d.put(aggregateOperation.toString(), aggregateOperation);
            }
        }
    }

    public static AggregateOperation a(String str) {
        HashMap hashMap = d;
        if (hashMap.containsKey(str)) {
            return (AggregateOperation) hashMap.get(str);
        }
        throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "Type error");
    }

    public static DataType b(String str) {
        p pVar = a;
        if (pVar.containsKey(str)) {
            return (DataType) pVar.get(str);
        }
        throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "Type error");
    }

    public static List a(DataType dataType) {
        if (a.containsValue(dataType)) {
            s sVar = c;
            if (!sVar.containsKey(dataType)) {
                return Collections.emptyList();
            }
            return new ArrayList((Collection) Objects.requireNonNull((Set) sVar.get(dataType)));
        }
        throw new InvalidRequestException(1001, "Unknown data type");
    }

    public static List b(DataType dataType) {
        if (a.containsValue(dataType)) {
            q qVar = b;
            if (!qVar.containsKey(dataType)) {
                return Collections.emptyList();
            }
            return new ArrayList((Collection) Objects.requireNonNull((Set) qVar.get(dataType)));
        }
        throw new InvalidRequestException(1001, "Unknown data type");
    }
}
