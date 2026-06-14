package com.example.rungps.export;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import com.example.rungps.BuildConfig;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.tracking.TrackingService;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: LocalBackupExporter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.export.LocalBackupExporter$exportToDownloads$2", f = "LocalBackupExporter.kt", i = {0, 0, 0, 1}, l = {27, 40}, m = "invokeSuspend", n = {"repo", "$this$invokeSuspend_u24lambda_u246", "$this$invokeSuspend_u24lambda_u246_u24lambda_u242", "$this$invokeSuspend_u24lambda_u246_u24lambda_u245"}, s = {"L$0", "L$2", "L$4", "L$2"})
/* loaded from: classes3.dex */
final class LocalBackupExporter$exportToDownloads$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalBackupExporter$exportToDownloads$2(Context context, Continuation<? super LocalBackupExporter$exportToDownloads$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalBackupExporter$exportToDownloads$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((LocalBackupExporter$exportToDownloads$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0138 A[LOOP:0: B:7:0x0132->B:9:0x0138, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        String str;
        Object allRuns;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        Repository repository;
        JSONArray jSONArray2;
        JSONObject jSONObject3;
        String str2;
        String str3;
        JSONArray jSONArray3;
        Object finishedGymSessions;
        JSONObject jSONObject4;
        String str4;
        JSONArray jSONArray4;
        JSONObject jSONObject5;
        byte[] zipJson;
        Uri insert;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String str5 = "endedAtMs";
        String str6 = "startedAtMs";
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Repository repository2 = Repository.INSTANCE.get(this.$context);
            jSONObject = new JSONObject();
            jSONObject.put("exportedAtMs", System.currentTimeMillis());
            jSONObject.put("appVersion", BuildConfig.VERSION_NAME);
            JSONArray jSONArray5 = new JSONArray();
            this.L$0 = repository2;
            this.L$1 = jSONObject;
            this.L$2 = jSONObject;
            this.L$3 = jSONArray5;
            this.L$4 = jSONArray5;
            str = "runs";
            this.L$5 = "runs";
            this.L$6 = jSONObject;
            this.label = 1;
            allRuns = repository2.allRuns(this);
            if (allRuns == coroutine_suspended) {
                return coroutine_suspended;
            }
            jSONObject2 = jSONObject;
            jSONArray = jSONArray5;
            repository = repository2;
            jSONArray2 = jSONArray;
            jSONObject3 = jSONObject2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject4 = (JSONObject) this.L$4;
                str4 = (String) this.L$3;
                jSONArray3 = (JSONArray) this.L$2;
                JSONArray jSONArray6 = (JSONArray) this.L$1;
                jSONObject5 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str2 = "startedAtMs";
                finishedGymSessions = obj;
                str3 = "endedAtMs";
                jSONArray4 = jSONArray6;
                for (GymSessionEntity gymSessionEntity : (Iterable) finishedGymSessions) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("id", gymSessionEntity.getId());
                    jSONObject6.put(str2, gymSessionEntity.getStartedAtMs());
                    jSONObject6.put(str3, gymSessionEntity.getEndedAtMs());
                    jSONArray3.put(jSONObject6);
                }
                Unit unit = Unit.INSTANCE;
                jSONObject4.put(str4, jSONArray4);
                String str7 = "ExerciseTracker-backup-" + System.currentTimeMillis() + ".zip";
                LocalBackupExporter localBackupExporter = LocalBackupExporter.INSTANCE;
                String jSONObject7 = jSONObject5.toString(2);
                Intrinsics.checkNotNullExpressionValue(jSONObject7, "toString(...)");
                zipJson = localBackupExporter.zipJson("backup.json", jSONObject7);
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str7);
                contentValues.put("mime_type", "application/zip");
                insert = this.$context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                if (insert != null) {
                    return null;
                }
                OutputStream openOutputStream = this.$context.getContentResolver().openOutputStream(insert);
                if (openOutputStream != null) {
                    OutputStream outputStream = openOutputStream;
                    try {
                        outputStream.write(zipJson);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStream, null);
                    } finally {
                    }
                }
                return insert;
            }
            JSONObject jSONObject8 = (JSONObject) this.L$6;
            String str8 = (String) this.L$5;
            JSONArray jSONArray7 = (JSONArray) this.L$4;
            JSONArray jSONArray8 = (JSONArray) this.L$3;
            JSONObject jSONObject9 = (JSONObject) this.L$2;
            jSONObject2 = (JSONObject) this.L$1;
            Repository repository3 = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            repository = repository3;
            jSONArray2 = jSONArray8;
            str = str8;
            allRuns = obj;
            jSONObject3 = jSONObject8;
            jSONObject = jSONObject9;
            jSONArray = jSONArray7;
        }
        for (RunEntity runEntity : (Iterable) allRuns) {
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("id", runEntity.getId());
            jSONObject10.put(str6, runEntity.getStartedAtMs());
            jSONObject10.put(str5, runEntity.getEndedAtMs());
            jSONObject10.put("distanceM", runEntity.getTotalDistanceM());
            jSONObject10.put(TrackingService.EXTRA_ACTIVITY_TYPE, runEntity.getActivityType());
            jSONArray.put(jSONObject10);
            str5 = str5;
            str6 = str6;
            jSONObject3 = jSONObject3;
        }
        str2 = str6;
        JSONObject jSONObject11 = jSONObject3;
        str3 = str5;
        Unit unit3 = Unit.INSTANCE;
        jSONObject11.put(str, jSONArray2);
        jSONArray3 = new JSONArray();
        this.L$0 = jSONObject2;
        this.L$1 = jSONArray3;
        this.L$2 = jSONArray3;
        this.L$3 = "gymSessions";
        this.L$4 = jSONObject;
        this.L$5 = null;
        this.L$6 = null;
        this.label = 2;
        finishedGymSessions = repository.finishedGymSessions(this);
        if (finishedGymSessions == coroutine_suspended) {
            return coroutine_suspended;
        }
        jSONObject4 = jSONObject;
        str4 = "gymSessions";
        jSONArray4 = jSONArray3;
        jSONObject5 = jSONObject2;
        while (r4.hasNext()) {
        }
        Unit unit4 = Unit.INSTANCE;
        jSONObject4.put(str4, jSONArray4);
        String str72 = "ExerciseTracker-backup-" + System.currentTimeMillis() + ".zip";
        LocalBackupExporter localBackupExporter2 = LocalBackupExporter.INSTANCE;
        String jSONObject72 = jSONObject5.toString(2);
        Intrinsics.checkNotNullExpressionValue(jSONObject72, "toString(...)");
        zipJson = localBackupExporter2.zipJson("backup.json", jSONObject72);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("_display_name", str72);
        contentValues2.put("mime_type", "application/zip");
        insert = this.$context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues2);
        if (insert != null) {
        }
    }
}
