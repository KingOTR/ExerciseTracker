package com.samsung.android.sdk.health.data.data;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0014J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/Field;", ExifInterface.GPS_DIRECTION_TRUE, "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTypeName", "typeName", "b", "getName", HintConstants.AUTOFILL_HINT_NAME, "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Field<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String typeName;

    /* renamed from: b, reason: from kotlin metadata */
    private final String name;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/Field$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "typeName", "fieldName", "Lcom/samsung/android/sdk/health/data/data/Field;", "of$SDK_clientRelease", "(Ljava/lang/String;Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/data/Field;", "of", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final /* synthetic */ Field of$SDK_clientRelease(String typeName, String fieldName) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new Field(typeName, fieldName, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Field(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public boolean equals(Object other) {
        return (other instanceof Field) && Intrinsics.areEqual(toString(), ((Field) other).toString());
    }

    public final String getName() {
        return this.name;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return this.typeName + "." + this.name;
    }

    private Field(String str, String str2) {
        this.typeName = str;
        this.name = str2;
    }
}
