package com.example.rungps.routing;

import androidx.browser.trusted.sharing.ShareTarget;
import com.example.rungps.sleep.SleepAudioConstants;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.osmdroid.util.GeoPoint;

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lorg/osmdroid/util/GeoPoint;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.routing.OsrmWalkingRouter$requestFootGeometry$2", f = "OsrmWalkingRouter.kt", i = {0, 0, 1, 1, 1}, l = {261, 272}, m = "invokeSuspend", n = {"coordPath", "attempt", "coordPath", "lastErr", "attempt"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class OsrmWalkingRouter$requestFootGeometry$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends GeoPoint>>>, Object> {
    final /* synthetic */ List<GeoPoint> $points;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OsrmWalkingRouter$requestFootGeometry$2(List<? extends GeoPoint> list, Continuation<? super OsrmWalkingRouter$requestFootGeometry$2> continuation) {
        super(2, continuation);
        this.$points = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OsrmWalkingRouter$requestFootGeometry$2(this.$points, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        return ((OsrmWalkingRouter$requestFootGeometry$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015e, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0143 -> B:10:0x00d5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        String sb;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        List list;
        IllegalStateException illegalStateException;
        Object obj2;
        String str;
        Iterator it;
        int i2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        List list2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            List<GeoPoint> list3 = this.$points;
            StringBuilder sb2 = new StringBuilder();
            i = 0;
            int i4 = 0;
            for (Object obj3 : list3) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GeoPoint geoPoint = (GeoPoint) obj3;
                if (i4 > 0) {
                    sb2.append(';');
                }
                sb2.append(geoPoint.getLongitude()).append(AbstractJsonLexerKt.COMMA).append(geoPoint.getLatitude());
                i4 = i5;
            }
            sb = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
            if (sb.length() <= 7500) {
                linkedHashMap = OsrmWalkingRouter.cache;
                synchronized (linkedHashMap) {
                    linkedHashMap2 = OsrmWalkingRouter.cache;
                    list = (List) linkedHashMap2.get(sb);
                }
                if (list != null) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m7904boximpl(Result.m7905constructorimpl(list));
                }
                illegalStateException = null;
                if (i < 2) {
                }
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Too many coordinates for OSRM URL"))));
            }
        } else if (i3 == 1) {
            i2 = this.I$0;
            it = (Iterator) this.L$1;
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).getValue();
            if (!Result.m7912isSuccessimpl(obj2)) {
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            Throwable th = (Throwable) this.L$1;
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            sb = str;
            Throwable th2 = th;
            i = i2 + 1;
            illegalStateException = th2;
            if (i < 2) {
                list2 = OsrmWalkingRouter.bases;
                Iterator it2 = list2.iterator();
                str = sb;
                Throwable m7908exceptionOrNullimpl = illegalStateException;
                i2 = i;
                it = it2;
                if (it.hasNext()) {
                    this.L$0 = str;
                    this.L$1 = it;
                    this.I$0 = i2;
                    this.label = 1;
                    obj2 = invokeSuspend$tryBase(str, (String) it.next(), this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!Result.m7912isSuccessimpl(obj2)) {
                        Object obj4 = Result.m7911isFailureimpl(obj2) ? null : obj2;
                        Intrinsics.checkNotNull(obj4);
                        List list4 = (List) obj4;
                        linkedHashMap3 = OsrmWalkingRouter.cache;
                        synchronized (linkedHashMap3) {
                            linkedHashMap4 = OsrmWalkingRouter.cache;
                            linkedHashMap4.put(str, list4);
                            linkedHashMap5 = OsrmWalkingRouter.cache;
                            if (linkedHashMap5.size() > 80) {
                                linkedHashMap6 = OsrmWalkingRouter.cache;
                                Iterator it3 = linkedHashMap6.entrySet().iterator();
                                it3.next();
                                it3.remove();
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m7904boximpl(Result.m7905constructorimpl(list4));
                    }
                    m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj2);
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 == 0) {
                        this.L$0 = str;
                        this.L$1 = m7908exceptionOrNullimpl;
                        this.I$0 = i2;
                        this.label = 2;
                        if (DelayKt.delay(250L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    th = m7908exceptionOrNullimpl;
                    sb = str;
                    Throwable th22 = th;
                    i = i2 + 1;
                    illegalStateException = th22;
                    if (i < 2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        if (illegalStateException == null) {
                            illegalStateException = new IllegalStateException("OSRM failed");
                        }
                        return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(illegalStateException)));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0076 A[Catch: Exception -> 0x01e0, TryCatch #0 {Exception -> 0x01e0, blocks: (B:3:0x0002, B:6:0x0056, B:7:0x0063, B:9:0x0073, B:10:0x007e, B:18:0x00b4, B:24:0x00d3, B:30:0x00f1, B:35:0x0110, B:40:0x012f, B:57:0x018f, B:60:0x0199, B:63:0x01d5, B:70:0x01dc, B:71:0x01df, B:72:0x0076, B:73:0x005b, B:12:0x0080, B:15:0x008e, B:17:0x00a1, B:21:0x00b8, B:23:0x00c0, B:27:0x00d8, B:29:0x00de, B:32:0x00f5, B:34:0x00fd, B:37:0x0114, B:39:0x011c, B:42:0x0133, B:44:0x0143, B:46:0x0158, B:48:0x015e, B:50:0x0166, B:54:0x0169, B:56:0x017c, B:59:0x0193, B:62:0x019d, B:67:0x01da), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073 A[Catch: Exception -> 0x01e0, TryCatch #0 {Exception -> 0x01e0, blocks: (B:3:0x0002, B:6:0x0056, B:7:0x0063, B:9:0x0073, B:10:0x007e, B:18:0x00b4, B:24:0x00d3, B:30:0x00f1, B:35:0x0110, B:40:0x012f, B:57:0x018f, B:60:0x0199, B:63:0x01d5, B:70:0x01dc, B:71:0x01df, B:72:0x0076, B:73:0x005b, B:12:0x0080, B:15:0x008e, B:17:0x00a1, B:21:0x00b8, B:23:0x00c0, B:27:0x00d8, B:29:0x00de, B:32:0x00f5, B:34:0x00fd, B:37:0x0114, B:39:0x011c, B:42:0x0133, B:44:0x0143, B:46:0x0158, B:48:0x015e, B:50:0x0166, B:54:0x0169, B:56:0x017c, B:59:0x0193, B:62:0x019d, B:67:0x01da), top: B:2:0x0002, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invokeSuspend$tryBase(String str, String str2, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        InputStream errorStream;
        InputStream inputStream;
        BufferedReader bufferedReader;
        String readText;
        List simplifyPoints;
        try {
            URLConnection openConnection = new URL(str2 + "/route/v1/foot/" + str + "?overview=full&geometries=geojson&steps=false&alternatives=false&continue_straight=false").openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(SleepAudioConstants.SAMPLE_RATE_V1);
            httpURLConnection.setReadTimeout(SleepAudioConstants.SAMPLE_RATE_V1);
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "ExerciseTracker/1 (osrm-foot)");
            int responseCode = httpURLConnection.getResponseCode();
            try {
                if ((200 > responseCode || responseCode >= 300) && (errorStream = httpURLConnection.getErrorStream()) != null) {
                    inputStream = errorStream;
                    Intrinsics.checkNotNull(inputStream);
                    Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                    bufferedReader = !(inputStreamReader instanceof BufferedReader) ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    readText = TextStreamsKt.readText(bufferedReader);
                    if (200 <= responseCode || responseCode >= 300) {
                        Result.Companion companion = Result.INSTANCE;
                        Object m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM " + responseCode + " @ " + str2 + ": " + StringsKt.take(readText, 240))));
                        CloseableKt.closeFinally(bufferedReader, null);
                        return m7905constructorimpl;
                    }
                    JSONObject jSONObject = new JSONObject(readText);
                    if (Intrinsics.areEqual(jSONObject.optString("code"), "NoRoute")) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Object m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM: NoRoute")));
                        CloseableKt.closeFinally(bufferedReader, null);
                        return m7905constructorimpl2;
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("routes");
                    if (optJSONArray == null) {
                        Result.Companion companion3 = Result.INSTANCE;
                        Object m7905constructorimpl3 = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM response missing routes")));
                        CloseableKt.closeFinally(bufferedReader, null);
                        return m7905constructorimpl3;
                    }
                    JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                    if (optJSONObject == null) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m7905constructorimpl4 = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM empty routes")));
                        CloseableKt.closeFinally(bufferedReader, null);
                        return m7905constructorimpl4;
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("geometry");
                    if (optJSONObject2 == null) {
                        Result.Companion companion5 = Result.INSTANCE;
                        Object m7905constructorimpl5 = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM response missing geometry")));
                        CloseableKt.closeFinally(bufferedReader, null);
                        return m7905constructorimpl5;
                    }
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("coordinates");
                    if (optJSONArray2 == null) {
                        Result.Companion companion6 = Result.INSTANCE;
                        Object m7905constructorimpl6 = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM response missing coordinates")));
                        CloseableKt.closeFinally(bufferedReader, null);
                        return m7905constructorimpl6;
                    }
                    ArrayList arrayList = new ArrayList(optJSONArray2.length());
                    int length = optJSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        JSONArray jSONArray = optJSONArray2.getJSONArray(i);
                        double optDouble = jSONArray.optDouble(0, Double.NaN);
                        double optDouble2 = jSONArray.optDouble(1, Double.NaN);
                        if (!Double.isNaN(optDouble2) && !Double.isNaN(optDouble)) {
                            arrayList.add(new GeoPoint(optDouble2, optDouble));
                        }
                    }
                    simplifyPoints = OsrmWalkingRouter.INSTANCE.simplifyPoints(arrayList, 2.0d, 1400);
                    if (simplifyPoints.size() < 2) {
                        Result.Companion companion7 = Result.INSTANCE;
                        Object m7905constructorimpl7 = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM returned no coordinates")));
                        CloseableKt.closeFinally(bufferedReader, null);
                        return m7905constructorimpl7;
                    }
                    Result.Companion companion8 = Result.INSTANCE;
                    Object m7905constructorimpl8 = Result.m7905constructorimpl(simplifyPoints);
                    CloseableKt.closeFinally(bufferedReader, null);
                    return m7905constructorimpl8;
                }
                readText = TextStreamsKt.readText(bufferedReader);
                if (200 <= responseCode) {
                }
                Result.Companion companion9 = Result.INSTANCE;
                Object m7905constructorimpl9 = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("OSRM " + responseCode + " @ " + str2 + ": " + StringsKt.take(readText, 240))));
                CloseableKt.closeFinally(bufferedReader, null);
                return m7905constructorimpl9;
            } finally {
            }
            inputStream = httpURLConnection.getInputStream();
            Intrinsics.checkNotNull(inputStream);
            Reader inputStreamReader2 = new InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = !(inputStreamReader2 instanceof BufferedReader) ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
        } catch (Exception e) {
            Result.Companion companion10 = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(e));
        }
    }
}
