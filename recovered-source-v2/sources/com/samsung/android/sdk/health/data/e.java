package com.samsung.android.sdk.health.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {
    public static final Gson a = new GsonBuilder().registerTypeAdapter(DataType.class, new b1()).registerTypeAdapter(Instant.class, new d1()).registerTypeAdapter(Duration.class, new c1()).registerTypeAdapter(LocalDateTime.class, new e1()).create();

    public static Object a(byte[] jsonBlob, Class clazz) {
        Intrinsics.checkNotNullParameter(jsonBlob, "jsonBlob");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jsonBlob);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream);
                    try {
                        Object fromJson = a.fromJson((Reader) inputStreamReader, (Class<Object>) clazz);
                        CloseableKt.closeFinally(inputStreamReader, null);
                        CloseableKt.closeFinally(gZIPInputStream, null);
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        return fromJson;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (JsonIOException e) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e.getMessage()), null, 4, null);
        } catch (JsonSyntaxException e2) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e2.getMessage()), null, 4, null);
        } catch (ZipException e3) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e3.getMessage()), null, 4, null);
        } catch (IOException e4) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e4.getMessage()), null, 4, null);
        }
    }

    public static final d a(Class cls) {
        return new d(new Type[]{cls});
    }

    public static byte[] a(Object obj) {
        String json = a.toJson(obj);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(json.length());
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    Intrinsics.checkNotNullExpressionValue(json, "json");
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    byte[] bytes = json.getBytes(UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    gZIPOutputStream.write(bytes);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
