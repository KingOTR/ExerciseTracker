package com.example.rungps.ui.main;

import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;
import org.osmdroid.util.GeoPoint;

/* compiled from: MapOsMapKit.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapOsMapKitKt$isLikelyParkOrBeach$2", f = "MapOsMapKit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapOsMapKitKt$isLikelyParkOrBeach$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ GeoPoint $p;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapOsMapKitKt$isLikelyParkOrBeach$2(GeoPoint geoPoint, Continuation<? super MapOsMapKitKt$isLikelyParkOrBeach$2> continuation) {
        super(2, continuation);
        this.$p = geoPoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapOsMapKitKt$isLikelyParkOrBeach$2(this.$p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((MapOsMapKitKt$isLikelyParkOrBeach$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0137, code lost:
    
        if (r9.length() > 0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long cacheKey;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            cacheKey = MapOsMapKitKt.cacheKey(this.$p);
            linkedHashMap = MapOsMapKitKt.parkBeachCache;
            synchronized (linkedHashMap) {
                linkedHashMap2 = MapOsMapKitKt.parkBeachCache;
                Boolean bool = (Boolean) linkedHashMap2.get(Boxing.boxLong(cacheKey));
                boolean z = true;
                if (bool != null) {
                    return Boxing.boxBoolean(bool.booleanValue());
                }
                double latitude = this.$p.getLatitude();
                double longitude = this.$p.getLongitude();
                String trimIndent = StringsKt.trimIndent("\n            [out:json][timeout:12];\n            (\n              nwr(around:35," + latitude + "," + longitude + ")[leisure=park];\n              nwr(around:35," + latitude + "," + longitude + ")[natural=beach];\n              nwr(around:35," + latitude + "," + longitude + ")[landuse=recreation_ground];\n            );\n            out ids;\n        ");
                try {
                    URLConnection openConnection = new URL("https://overpass-api.de/api/interpreter").openConnection();
                    Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setConnectTimeout(12000);
                    httpURLConnection.setReadTimeout(12000);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
                    String str = "data=" + URLEncoder.encode(trimIndent, "UTF-8");
                    BufferedReader outputStream = httpURLConnection.getOutputStream();
                    try {
                        byte[] bytes = str.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        outputStream.write(bytes);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStream, null);
                        InputStream inputStream = httpURLConnection.getInputStream();
                        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                        Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                        outputStream = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        try {
                            String readText = TextStreamsKt.readText(outputStream);
                            CloseableKt.closeFinally(outputStream, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            if (200 <= responseCode) {
                                if (responseCode < 300) {
                                    JSONArray optJSONArray = new JSONObject(readText).optJSONArray("elements");
                                    if (optJSONArray != null) {
                                    }
                                }
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Exception unused) {
                }
                z = false;
                linkedHashMap3 = MapOsMapKitKt.parkBeachCache;
                synchronized (linkedHashMap3) {
                    Long boxLong = Boxing.boxLong(cacheKey);
                    Boolean boxBoolean = Boxing.boxBoolean(z);
                    linkedHashMap4 = MapOsMapKitKt.parkBeachCache;
                    linkedHashMap4.put(boxLong, boxBoolean);
                    linkedHashMap5 = MapOsMapKitKt.parkBeachCache;
                    if (linkedHashMap5.size() > 800) {
                        linkedHashMap6 = MapOsMapKitKt.parkBeachCache;
                        Iterator it = linkedHashMap6.entrySet().iterator();
                        for (int i = 0; i < 200; i++) {
                            if (it.hasNext()) {
                                it.next();
                                it.remove();
                            }
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                return Boxing.boxBoolean(z);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
